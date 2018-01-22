package com.xwq520.excel.PoiDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ReadExcelDemo1 {

	public static void main(String[] args) throws Exception{
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		InputStream is=new FileInputStream("e:\\Auge1.0_核心系统程序发布单.xls");
		POIFSFileSystem fs=new POIFSFileSystem(is);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet hssfSheet=wb.getSheetAt(0); // 获取第一个Sheet页
		if(hssfSheet==null){
			return;
		}
		// 遍历行Row
		for(int rowNum=0;rowNum<=hssfSheet.getLastRowNum();rowNum++){
			HSSFRow hssfRow=hssfSheet.getRow(rowNum);
			if(hssfRow==null){
				continue;
			}
			// 遍历列Cell
			Map<String, Object> map = new HashMap<String, Object>();
			for(int cellNum=0;cellNum<=hssfRow.getLastCellNum();cellNum++){
				HSSFCell hssfCell=hssfRow.getCell(cellNum);
				if(hssfCell==null){
					continue;
				}
//				System.out.print(" "+getValue(hssfCell));
				map.put(String.valueOf(cellNum), getValue(hssfCell));
			}
			list.add(map);
			System.out.println();
		}
		String[] str =  new String[list.size()];
		int i = 0;
		for (Map<String, Object> map : list) {
			str[i] =  (String) map.get("1");
			i++;
			System.out.println(map.get("1"));
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println("str["+j+"] =" + str[j]);
		}
	}
	
	private static String getValue(HSSFCell hssfCell){
		if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
			return String.valueOf(hssfCell.getBooleanCellValue());
		}else if(hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
			return String.valueOf(hssfCell.getNumericCellValue());
		}else{
			return String.valueOf(hssfCell.getStringCellValue());
		}
	}
}

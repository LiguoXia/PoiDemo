package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 单元格合并
 * @author xialiguo
 */
public class CellMerge {

	public static void main(String[] args) throws Exception{
		Workbook wb=new HSSFWorkbook(); // 定义一个新的工作簿
		Sheet sheet=wb.createSheet("第一个Sheet页");  // 创建第一个Sheet页
		Row row=sheet.createRow(1); // 创建一个行
		
		Cell cell=row.createCell(1);
		cell.setCellValue("单元格合并测试");
		
		sheet.addMergedRegion(new CellRangeAddress(
				1, // 起始行
				2, // 结束行
				1, // 其实列
				2  // 结束列
		));
		
		
		FileOutputStream fileOut=new FileOutputStream("e:\\工作簿.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}

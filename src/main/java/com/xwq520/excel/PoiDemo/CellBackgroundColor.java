package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.FillPatternType;;

public class CellBackgroundColor {

	public static void main(String[] args) throws Exception{
		Workbook wb=new HSSFWorkbook(); // 定义一个新的工作簿
		Sheet sheet=wb.createSheet("第一个Sheet页");  // 创建第一个Sheet页
		Row row=sheet.createRow(1); // 创建一个行
		
		Cell cell=row.createCell(1);
		cell.setCellValue("XX");
		CellStyle cellStyle=wb.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.RED.index); // 背景色
		cellStyle.setFillPattern(FillPatternType.BIG_SPOTS);  
		cell.setCellStyle(cellStyle);
		
		
		Cell cell2=row.createCell(2);
		cell2.setCellValue("YYY");
		CellStyle cellStyle2=wb.createCellStyle();
		cellStyle2.setFillForegroundColor(IndexedColors.RED.index); // 前景色
		cellStyle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		cell2.setCellStyle(cellStyle2);
		
		FileOutputStream fileOut=new FileOutputStream("e:\\工作簿.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}

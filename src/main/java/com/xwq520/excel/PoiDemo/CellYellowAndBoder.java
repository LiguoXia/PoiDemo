package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CellYellowAndBoder {

	public static void main(String[] args) throws Exception{
		Workbook wb=new HSSFWorkbook(); // 定义一个新的工作簿
		Sheet sheet=wb.createSheet("第一个Sheet页");  // 创建第一个Sheet页
		Row row=sheet.createRow(1); // 创建一个行
		
		Cell cell=row.createCell(1); // 创建一个单元格
		cell.setCellValue(4);
		
		CellStyle cellStyle=wb.createCellStyle(); 
		cellStyle.setBorderBottom(BorderStyle.THIN);// 底部边框
		cellStyle.setBottomBorderColor(IndexedColors.RED1.index);// 底部边框颜色
		cellStyle.setBorderLeft(BorderStyle.THIN);// 左边边框
		cellStyle.setLeftBorderColor(IndexedColors.GREEN.index); // 左边边框颜色
		
		cellStyle.setBorderRight(BorderStyle.THIN);// 右边边框
		cellStyle.setRightBorderColor(IndexedColors.BLUE.index);  // 右边边框颜色
		
		cellStyle.setBorderTop(BorderStyle.THIN);// 上边边框
		cellStyle.setTopBorderColor(IndexedColors.BLACK.index);  // 上边边框颜色
		
		cell.setCellStyle(cellStyle);
		FileOutputStream fileOut=new FileOutputStream("e:\\工作簿.xls");
		wb.write(fileOut);
		fileOut.close();
	}
}

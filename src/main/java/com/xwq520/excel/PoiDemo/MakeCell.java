package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

//创建单元格
public class MakeCell {
	public static void main(String[] args) throws Exception{
		Workbook wb = new HSSFWorkbook();//定义一个新的工作簿
		Sheet sheet = wb.createSheet("第一个sheet页");//创建一个sheet页
		Row row = sheet.createRow(0);//创建一行
		Cell cell = row.createCell(0);//创建一个单元格，第一列
		cell.setCellValue("第一行第一列");
		row.createCell(1).setCellValue("第一行第二列"); 
		row.createCell(2).setCellValue("第一行第三列"); 
		row.createCell(3).setCellValue("第一行第四列"); 
		FileOutputStream fileOut = new FileOutputStream("e:\\poi创建的工作1.xls");
		wb.write(fileOut);
		fileOut.close();
	}

}

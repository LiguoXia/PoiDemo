package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class MakeSheet {
	public static void main(String[] args)throws Exception {
		Workbook wb = new HSSFWorkbook();//定义一个新的工作簿
		wb.createSheet("第一个sheet页");
		wb.createSheet("第二个sheet页");
		FileOutputStream fileOut = new FileOutputStream("e:\\poi创建的工作 .xls");
		wb.write(fileOut);
		fileOut.close();
	}

}

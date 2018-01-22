package com.xwq520.excel.PoiDemo;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class MakeExcel {
	public static void main(String[] args)throws Exception {
		Workbook wb = new HSSFWorkbook();//定义一个新的工作簿
		FileOutputStream fileOut = new FileOutputStream("e:\\poi创建的工作簿.xls");
		wb.write(fileOut);
		fileOut.close();
	}

}

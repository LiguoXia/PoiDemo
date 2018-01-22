package com.xwq520.excel.PoiDemo;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ReadSheetTest {

	public static void main(String[] args) throws Exception{
		InputStream is=new FileInputStream("e:\\名单.xls");
		POIFSFileSystem fs=new POIFSFileSystem(is);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		
		ExcelExtractor excelExtractor=new ExcelExtractor(wb);
		excelExtractor.setIncludeSheetNames(false);// 我们不需要Sheet页的名字
		System.out.println(excelExtractor.getText());
	}
	

}

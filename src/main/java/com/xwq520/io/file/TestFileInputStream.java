package com.xwq520.io.file;

import java.io.*;

public class TestFileInputStream {
	public static void main(String[] args) {
		System.out.println(File.separator);
//		System.out.println(System.getProperty("sep"));
		String sep = File.separator;
		int b = 0;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(
					"D:" + sep + "eclipse-oxygen-workspace" + sep + "SomeDemo" + sep + "src" + sep + "main" + sep + "java" + sep + "com" + sep + "xwq520" + sep + "io" + sep + "file" + sep + "TestFileInputStream.java");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		try {
			long num = 0;
			while ((b = fin.read()) != -1) {
				System.out.print((char) b);
				num++;
			}
			fin.close();
			System.out.println("共读取" + num + "个字节");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
	}
}

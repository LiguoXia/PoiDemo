package com.xwq520.io.file;

import java.io.*;

public class TestFileOutputStream {
	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("e://logFile.txt");
			out = new FileOutputStream("e://aa.java");
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e2) {
			System.out.println("找不到指定文件");
			System.exit(-1);
		} catch (IOException e1) {
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.println("文件已复制");
	}
}

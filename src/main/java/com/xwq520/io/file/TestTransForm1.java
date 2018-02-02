package com.xwq520.io.file;

import java.io.*;

public class TestTransForm1 {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\char.txt"));
			osw.write("mircosoftibmsunapplehp夏利国");//正常
			System.out.println(osw.getEncoding());
			osw.close();
			osw = new OutputStreamWriter(new FileOutputStream("e:\\char.txt", true), "ISO8859_1"); // latin-1 true：从原来的文件上接着
			osw.write("mircosoftibmsunapplehp夏利国");//乱码
			System.out.println(osw.getEncoding());
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

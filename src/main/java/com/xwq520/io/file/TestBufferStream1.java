package com.xwq520.io.file;

import java.io.*;

/**
 * 处理流，相当于在管道上再套一层管道，先放在缓冲区，最后一次读写，减少对硬盘的读写
 * 
 * @author xialiguo
 */
public class TestBufferStream1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\eclipse-oxygen-workspace\\SomeDemo\\src\\main\\java\\com\\xwq520\\io\\file\\TestBufferStream1.java");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int c = 0;
			System.out.println((char) bis.read());
			System.out.println((char) bis.read());
			bis.mark(100);
			for (int i = 0; i <= 20 && (c = bis.read()) != -1; i++) {
				System.out.print((char) c);
			}
			System.out.println();
			bis.reset();
			for (int i = 0; i <= 20 && (c = bis.read()) != -1; i++) {
				System.out.print((char) c);
			}
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

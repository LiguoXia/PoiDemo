package com.xwq520.file;
import java.io.File;

public class FilePath {
	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		System.out.println(FilePath.class.getClassLoader().getResource(""));
		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(FilePath.class.getResource(""));
		System.out.println(FilePath.class.getSimpleName());
		System.out.println(FilePath.class.getResource("/")); 
		System.out.println(new File("/").getAbsolutePath());
		System.out.println(System.getProperty("user.dir"));
	}
}

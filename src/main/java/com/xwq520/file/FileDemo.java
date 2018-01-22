package com.xwq520.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class FileDemo {
	public static void main(String[] args) {
//		getFileNameInfo("D:\\");
//		creatFile();
		try {
			readAndWrite();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void getFileNameInfo(String path) {
		File file = new File(path);
		String[] str = file.list();
		for (String s : str) {
			System.out.println(s);
		}
	}

	public static void creatFile() {
		File file = new File("aa.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		System.out.println(file.isFile());
	}
	public static void readAndWrite() throws IOException{
		String path = "D:\\eclipse-oxygen-workspace\\HelloWorld\\aa.txt";
        File file = new File(path);
        if(!file.exists()){
            file.getParentFile().mkdirs();          
        }
        file.createNewFile();
        // write
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("bbbbbbhah");
        bw.flush();
        bw.close();
        fw.close();

        // read
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        System.out.println(str);
	}
	
	
	
	
}

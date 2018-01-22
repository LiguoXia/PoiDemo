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

	/**
	 * TODO ��ȡ�̷�·�����ļ���
	 * 
	 * @param path
	 */
	public static void getFileNameInfo(String path) {
		File file = new File(path);
		String[] str = file.list();
		for (String s : str) {
			System.out.println(s);
		}
	}

	public static void creatFile() {
		File file = new File("aa.txt");// �ļ�Ĭ�Ͼʹ������㴴������Ŀ���棬ˢ�¼��ɿ���
		System.out.println(file.exists());// �ж��ļ��Ƿ����
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// �����ļ��������ļ���
		System.out.println(file.exists());// �ٴ��ж��Ƿ����
		System.out.println(file.getName());// ��ȡ�ļ�������
		System.out.println(file.getAbsolutePath());// ��ȡ�ļ��ľ���·��
		System.out.println(file.getPath());// ��ȡ�ļ������·��
		System.out.println(file.getParent());// ��ȡ�ļ��ĸ�·��
		System.out.println(file.canRead());// �ļ��Ƿ�ɶ�
		System.out.println(file.canWrite());// �ļ��Ƿ��д
		System.out.println(file.length());// �ļ��ĳ���
		System.out.println(file.lastModified());// �ļ����һ���޸ĵ�ʱ��
		System.out.println(file.isDirectory());// �ж��ļ��Ƿ���һ��Ŀ¼
		System.out.println(file.isHidden());// �ļ��Ƿ�����
		System.out.println(file.isFile());// �ж��ļ��Ƿ����
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
        bw.write("bbbbbbhahaha������2Ŷ1");
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

package com.xwq520.file;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FilePath2 {

	public static void main(String[] args) {
		FilePath2 muDemo = new FilePath2();
		try {
			muDemo.showURL();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void showURL() throws IOException {

		// ��һ�֣���ȡ����صĸ�·�� D:\eclipse-oxygen-workspace\HelloWorld\bin
		File f = new File(this.getClass().getResource("/").getPath());
		System.out.println(f);

		// ��ȡ��ǰ������ڹ���·��; ������ӡ�/�� ��ȡ��ǰ��ļ���Ŀ¼ D:\git\daotie\daotie\target\classes\my
		File f2 = new File(this.getClass().getResource("").getPath());
		System.out.println(f2);

		// �ڶ��֣���ȡ��Ŀ·�� D:\git\daotie\daotie
		File directory = new File("");// ����Ϊ��
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);

		// �����֣� file:/D:/git/daotie/daotie/target/classes/
		URL xmlpath = this.getClass().getClassLoader().getResource("");
		System.out.println(xmlpath);

		// �����֣� D:\git\daotie\daotie
		System.out.println(System.getProperty("user.dir"));
		/*
		 * ����� C:\Documents and Settings\Administrator\workspace\projectName ��ȡ��ǰ����·��
		 */

		// �����֣� ��ȡ���е���·�� ����jar����·��
		System.out.println(System.getProperty("java.class.path"));

	}
}
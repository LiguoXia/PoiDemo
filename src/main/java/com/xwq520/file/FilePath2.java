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

	
		File f = new File(this.getClass().getResource("/").getPath());
		System.out.println(f);


		File f2 = new File(this.getClass().getResource("").getPath());
		System.out.println(f2);

		
		File directory = new File("");
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);

		
		URL xmlpath = this.getClass().getClassLoader().getResource("");
		System.out.println(xmlpath);

	
		System.out.println(System.getProperty("user.dir"));
	
		System.out.println(System.getProperty("java.class.path"));

	}
}
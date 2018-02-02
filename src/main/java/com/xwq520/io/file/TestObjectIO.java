package com.xwq520.io.file;

import java.io.*;

public class TestObjectIO {
	public static void main(String args[]) throws Exception {
		T t = new T();
		t.k = 8;
		FileOutputStream fos = new FileOutputStream("e://testobjectio.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("e://testobjectio.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		T tReaded = (T) ois.readObject();
		System.out.println(tReaded.i + " " + tReaded.j + " " + tReaded.d + " " + tReaded.k);

	}
}

//Serializable 序列化接口，如果某个对象想被序列化，必须实现这个接口
class T implements Serializable {
	int i = 10;
	int j = 9;
	double d = 2.3;
	transient int k = 15;// transient修饰的成员变量不予考虑
}
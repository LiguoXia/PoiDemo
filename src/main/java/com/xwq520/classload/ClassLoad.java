package com.xwq520.classload;

public class ClassLoad {
	public static void main(String[] args) {
		new A();
		new A();
		System.out.println("--------------");
		B.getInsatnce();
		B.getInsatnce();
		System.out.println("--------------");
		new C();
		new C();
	}
}

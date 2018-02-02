package com.xwq520.classload;

public class C {
	static {
		System.out.println("class c is created");
	}
	public C() {
		System.out.println("class C creMethod");
	}
}

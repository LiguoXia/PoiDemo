package com.xwq520.extend;

public class Parent {
	
	public Parent(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Parent(){
	}
	public int a = 1;
	private int b = 2;  //当前类内部可访问
	protected int c = 3; //子类可访问
	int d = 4; //同一个包中可访问，同一个 包中的子类可访问，不同包中的子类不可访问
	public int hh(){
		System.out.println("这里是父类的方法");
		return 3;
	}
}

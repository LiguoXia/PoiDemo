package com.xwq520.extend;


public class Child extends Parent{
	
	public Child(int a, int b, int c, int d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Child c = new Child(2,2,2,2);
		Parent p = new Child(2,2,2,2);
//		Child d = new Parent(); 类型不匹配：无法从父项转换为子项
		c.hhh();
		System.out.println(c.hh());
	}

	public int hhh() {
		int c = 4;
		Child c1 = new Child(3,3,33,3);
		System.out.println("子类");
		System.out.println(c1.a);
//		System.out.println(c1.b);   Parent.b字段不可见
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("这是父类的c："+super.c);//super 指向父类对象的引用
		System.out.println();
		return 4;
	}
}

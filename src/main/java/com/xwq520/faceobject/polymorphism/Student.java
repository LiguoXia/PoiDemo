package com.xwq520.faceobject.polymorphism;

public class Student implements Human{

	public Behavior behavior() {
		Behavior bh = new Behavior() {
			
			public void sleep() {
				System.out.println("学生睡觉");
			}
			
			public void eat() {
				System.out.println("学生吃饭");
			}
		};
		return bh;
	}

	

}

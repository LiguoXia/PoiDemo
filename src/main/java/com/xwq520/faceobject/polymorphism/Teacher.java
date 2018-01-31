package com.xwq520.faceobject.polymorphism;

public class Teacher implements Human{

	public Behavior behavior() {
		Behavior bh = new Behavior() {
			
			public void sleep() {
				System.out.println("老师睡觉");
			}
			
			public void eat() {
				System.out.println("老师吃东西");
			}
		};
		return bh;
	}

	

}

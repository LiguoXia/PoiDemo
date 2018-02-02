package com.xwq520.classload;

public class B {
	private B(){
		System.out.println("class B is created");
	}
	private static B instance = new B();
	public static synchronized B getInsatnce(){
		if(instance == null){
			instance = new B();
		}
		return instance;
	}
}

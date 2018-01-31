package com.xwq520.faceobject.polymorphism;

public class Test {
	public static void main(String[] args) {
		Human hm = new Student();
		Behavior bh = hm.behavior();
		bh.eat();
	}
}

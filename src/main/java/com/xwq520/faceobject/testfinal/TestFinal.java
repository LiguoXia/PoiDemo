package com.xwq520.faceobject.testfinal;

public class TestFinal {
	public static void main(String[] args) {
		T t = new T();
		// t.i = 8;//final修饰的值无法在修改
	}
}

final class T {
	final int i = 8;

	public final void m() {
		// j = 9;
	}
}

/**
 * final修饰的类不能再继承
 * class TT extends T {
 * 
 * }
 */
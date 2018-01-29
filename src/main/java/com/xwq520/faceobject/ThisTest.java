package com.xwq520.faceobject;

public class ThisTest {
	int i = 0;

	ThisTest(int i) {
		this.i = i;
	}

	ThisTest increament() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i=" + i);
	}

	public static void main(String[] args) {
		ThisTest tt = new ThisTest(100);
		tt.increament().increament().print();
	}
}

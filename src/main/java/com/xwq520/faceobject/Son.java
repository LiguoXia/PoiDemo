package com.xwq520.faceobject;

import com.xwq520.extend.Parent;

public class Son extends Parent{
	public static void main(String[] args) {
		Son s = new Son();
//		System.out.println(s.d); 不同包中的子类不可访问
		System.out.println(s.toString());
	}
}

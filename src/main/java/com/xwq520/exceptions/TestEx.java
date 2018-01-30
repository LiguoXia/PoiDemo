package com.xwq520.exceptions;

import java.io.IOException;

public class TestEx {
	public static void main(String[] args) {
		TestEx te = new TestEx();
		te.bb();
	}
	
	public boolean bb() {
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (Exception e) {
			e.printStackTrace();//打印出错误的堆栈信息
		}
		TestEx te = new TestEx();
		try {
			te.hh();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			System.out.println("这是final");
		}
	}
	
	//这里抛出了一个异常，调用方法的时候要手动捕获处理
	public void hh() throws Exception{
		System.out.println("hhh");
	}
}

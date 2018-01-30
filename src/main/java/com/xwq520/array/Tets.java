package com.xwq520.array;

public class Tets {
	public static void main(String[] args) {
		int[] a;
		a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;// 动态初始化：定义，分配空间赋值分开进行

		int[] b = { 2, 3, 4, 5 };// 静态初始化：定义数组的同时就分配空间并赋值

		int[] c = new int[4]; //默认初始化

		for (int arr : b) {
			System.out.println(arr);
		}
	}
}

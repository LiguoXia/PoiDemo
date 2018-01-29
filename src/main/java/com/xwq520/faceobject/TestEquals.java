package com.xwq520.faceobject;

public class TestEquals {
	public static void main(String[] args) {
		Cat c1 = new Cat(1, 2, 3);
		Cat c2 = new Cat(1, 2, 3);
		System.out.println(c1.equals(c2));// true
		System.out.println(c1 == c2);// false
		String s1 = "123";
		String s2 = "123";
		String s3 = new String("123");
		String s4 = new String("123");
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
		System.out.println(s1 == s3);// false
		System.out.println(s1 instanceof Object);//true，用来判断引用类型变量指向的对象是否属于该类或该类的子类，用来判断String是否是Object或者是Object的子类
	}
}

class Cat {
	int color;
	int height;
	int weight;

	public Cat(int color, int height, int weight) {
		this.color = color;
		this.height = height;
		this.weight = weight;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof Cat) {
				Cat c = (Cat) obj;
				if (c.color == this.color && c.height == this.height && c.weight == this.weight) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", height=" + height + ", weight=" + weight + "]";
	}
}

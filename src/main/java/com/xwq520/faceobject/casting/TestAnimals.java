package com.xwq520.faceobject.casting;

public class TestAnimals {
	public static void main(String[] args) {
		Animal a = new Animal("animal name");
		Cat c = new Cat("cat name", "black eye");
		Dog d = new Dog("dog name", "blue");

		System.out.println(a instanceof Animal);// true
		System.out.println(c instanceof Animal);// true
		System.out.println(d instanceof Animal);// true
		System.out.println(a instanceof Cat);// false

		// 父类引用指向子类对象的，看到的只是父类对象那部分的属性和方法
		a = new Dog("动物对象指向的dog", "yellow");
		System.out.println(a.name);// 动物类具有的成员变量
		// System.out.println(a.furColor);//编译报错，现在的a是一个animal对象，不能访问dog的属性
		System.out.println("a对象是一个动物吗" + (a instanceof Animal));// true
		System.out.println("a对象是一只狗吗" + (a instanceof Dog));// true
		Dog d1 = (Dog) a;//把a对象强制转换成一个dog类型
		System.out.println(d1.furColor);//这里就能访问打作为dog类型的属性和方法
	}
}

class Animal {
	public String name;

	Animal(String name) {
		this.name = name;
	}
}

class Cat extends Animal {
	public String eyesColor;

	Cat(String n, String c) {
		super(n);
		eyesColor = c;
	}
}

class Dog extends Animal {
	public String furColor;

	Dog(String n, String c) {
		super(n);
		furColor = c;
	}
}

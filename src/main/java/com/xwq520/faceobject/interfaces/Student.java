package com.xwq520.faceobject.interfaces;

public class Student implements Singer {
	public String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	// 实现一个接口必须实现接口所有方法
	public void sing() {
		System.out.println("学生唱歌");
	}

	public void sleep() {
		System.out.println("学生睡觉");
	}
	
	public void stuFun() {
		System.out.println("student自己的方法");
	}

	public static void main(String[] args) {
		Student s = new Student("1");
		s.sing();
		s.sleep();
		System.out.println("访问接口里面的常量" + Singer.id);
		System.out.println("---------");
		//接口的引用指向实现接口的对象
		Singer s1 = new Student("2");
		s1.sing();
//		((Student) s1).stuFun();//不能访问自己的方法，只能看到接口里面的方法，但是调用的是自己重写的方法
		Singer s2 = new Teach();
		s2.sing();
//		s2.draw;//Singer接口没有这个方法
		((Teach) s2).draw();
		Paint p = (Paint)s2;//把s2强制转换成Paint对象
		p.eat();
	}

	public void hh() {
		// TODO Auto-generated method stub
		
	}
}

class Teach implements Singer, Paint {

	public void draw() {
		System.out.println("老师画画");
	}

	public void eat() {
		System.out.println("老师吃饭");
	}

	public void sing() {
		System.out.println("老师唱歌");
	}

	public void sleep() {
		System.out.println("老师睡觉");
	}

	public void hh() {
		// TODO Auto-generated method stub
		
	}

}

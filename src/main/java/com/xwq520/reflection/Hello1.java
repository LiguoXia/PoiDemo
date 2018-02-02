package com.xwq520.reflection;

class Person {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
}

public class Hello1 {
	public static void main(String[] args) {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.xwq520.reflection.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Person per = null;
		try {
			per = (Person) demo.newInstance(); //获取person类的实例对象
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		per.setName("Rollen");
		per.setAge(20);
		System.out.println(per);
	}
}

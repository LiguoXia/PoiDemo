package com.xwq520.extend;

public class Parent {
	public int a = 1;
	private int b = 2; // 当前类内部可访问
	protected int c = 3; // 子类可访问
	int d = 4; // 同一个包中可访问，同一个 包中的子类可访问，不同包中的子类不可访问
	public static final String Ab = "1";

	// this 关键字
	// this 关键字表示当前对象。可用于：
	// 调用当前类的构造方法，并且必须是方法的第一条语句。如：this(); 调用默认构造方法。this(参数); 调用带参构造方法。
	// 限定当前对象的数据域变量。一般用于方法内的局部变量与对象的数据域变量同名的情况。如 this.num = num。this.num
	// 表示当前对象的数据域变量 num，而 num 表示方法中的局部变量。
	// super 语句必须是子类构造方法的第一条语句。
	// 调用父类的构造方法的唯一途径是使用 super 关键字，如果子类中没显式调用，则编译器自动将 super(); 作为子类构造方法的第一条语句。
	public Parent(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	// 若父类没有无参构造器，则必须在子类的构造器中显式地通过super关键字调用父类的构造器并配以适当的参数列表。
	public Parent() {
		super();
	}

	// 对所有类可见。使用对象：类、接口、变量、方法
	public String publicCan() {
		System.out.println("这里是父类的publicCan()方法");
		return "父类public方法子类都可访问";
	}

	// 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
	// 子类若不在同一个包中，访问不了
	String defaultSomeCan() {
		System.out.println("这里是父类的defaultSomeCan()方法");
		return "父类默认方法在同一个包中的子类才能访问";
	}

	// 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
	private String privateCannot() {
		System.out.println("这里是父类的privateCannot()方法");
		return "父类的private方法子类不能访问";
	}

	// 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
	protected String protectedCan() {
		System.out.println("这里是父类的protectedCan()方法");
		return "父类protected方法同一个包中和子类中可用";
	}
}

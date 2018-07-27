package com.xwq520.extend;

public class Child extends Parent {

	// 子类不能继承父类的构造器（构造方法或者构造函数），但是父类的构造器带有参数的，则必须在子类的构造器中显式地通过super关键字调用父类的构造器并配以适当的参数列表。
	// 如果父类有无参构造器，则在子类的构造器中用super调用父类构造器不是必须的
	// 如果没有使用super关键字，系统会自动调用父类的无参构造器。
	
	// super 表示使用它的类的父类。super 可用于：
	// 调用父类的构造方法；
	// 调用父类的方法（子类覆盖了父类的方法时）；
	// 访问父类的数据域（可以这样用但没有必要这样用）。
	// 调用父类的构造方法语法：
	// super();
	// 或
	// super(参数列表);
	public Child(int a, int b, int c, int d) {
		super(a, b, c, d);
	}

	public static void main(String[] args) {
		Child c = new Child(2, 2, 2, 2);
		// Child d = new Parent(); 类型不匹配：无法从父项转换为子项
		c.self();
		
		/*向上转型：父类引用指向子类对象*/
		// 指向子类的父类引用由于向上转型了，它只能访问父类中拥有的方法和属性
		// 若子类重写了父类中的某些方法，在调用该些方法的时候，必定是使用子类中定义的这些方法（动态连接、动态调用）。
		// 父类类型的引用可以调用父类中定义的所有属性和方法，对于只存在与子类中的方法和属性它就望尘莫及了
		Parent p = new Child(2, 2, 2, 2);
		System.out.println(p.publicCan());
		System.out.println(p.protectedCan());
		System.out.println(p.defaultSomeCan());
		
		/*向下转型：指向子类对象的父类引用赋给子类引用，要强制转换*/
		Child c1 = (Child) p;
		
		// 子类对象可以直接调用父类的方法
		System.out.println(c.publicCan());
		System.out.println(c.protectedCan());
		System.out.println(c.defaultSomeCan());
	}

	public int self() {
		int c = 4;
		Child c1 = new Child(3, 3, 33, 3);
		System.out.println("子类");
		System.out.println(c1.a);
		// System.out.println(c1.b); Parent.b字段不可见
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.Ab);
		System.out.println("这是父类的c：" + super.c);// super 指向父类对象的引用
		System.out.println();
		return 4;
	}
	
	// 重写父类的方法
	public String publicCan() {
		System.out.println("这里是子类重写父类的publicCan()方法");
		return "我重写了";
	}
}

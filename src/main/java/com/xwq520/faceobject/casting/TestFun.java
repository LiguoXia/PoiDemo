package com.xwq520.faceobject.casting;

/**
 * 向上转型对于可扩展性的好处，如果以后还有其他动物，只需要改一个方法
 * @author xialiguo
 */
public class TestFun {
	public static void main(String[] args) {
		TestFun tf = new TestFun();
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		tf.f(a);
		tf.f(c);
		tf.f(d);
	}

	public void f(Animal a) {
		System.out.println("name:" + a.name);
		if (a instanceof Cat) {
			Cat cat = (Cat) a;
			System.out.println(" " + cat.eyesColor + "eyes");
		} else if (a instanceof Dog) {
			Dog dog = (Dog) a;
			System.out.println(" " + dog.furColor + "fur");
		}
	}
}

package com.xwq520.designmodel;
public class Test{
	public static void main(String[] args){
		HungryModel hm1 = HungryModel.getInsatnce();
		HungryModel hm2 = HungryModel.getInsatnce();
		System.out.println(hm1 == hm2);
		hm1.aa();
		hm2.aa();
	}
}
	
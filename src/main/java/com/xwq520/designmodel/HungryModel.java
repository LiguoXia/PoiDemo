package com.xwq520.designmodel;
public class HungryModel{
	private HungryModel(){
		System.out.println("HungryModel is create");
	}
	private static HungryModel instance = new HungryModel();
	public static synchronized HungryModel getInsatnce(){
		if(instance == null){
			instance = new HungryModel();
		}
		return instance;
	}
	public void aa() {
		System.out.println("hhhh");
	}
}

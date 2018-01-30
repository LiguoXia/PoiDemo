package com.xwq520.exceptions;

public class TestMyException {
	public void regist(int num) throws MyException {
		if (num < 0) {
			throw new MyException("登记人数不能为负", 1);
		}
		System.out.println("登记人数为:" + num);
	}
	
	public static void main(String[] args) {
		TestMyException tme = new TestMyException();
		try {
			tme.regist(-3);
		} catch (MyException e) {
			System.out.println("登记失败,错误类型：" + e.getId());
			e.printStackTrace();
		}
	}

}

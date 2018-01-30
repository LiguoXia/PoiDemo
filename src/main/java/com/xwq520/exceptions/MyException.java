package com.xwq520.exceptions;

public class MyException extends Exception {
	private int id;

	public MyException(String messige , int id) {
		super(messige);
		this.id = id;
	}
	public int getId() {
		return id;
	}
}

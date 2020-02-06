package com.app;

public class StaticFinalTest {
	
	static int value;
	final int finalValue;
	
	public StaticFinalTest() {
		// TODO Auto-generated constructor stub
		this.finalValue=1;
		value=200;
	}
	
	static {
		value=100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---before---");
		System.out.println(value);
		value = 10;
		System.out.println("---after---");

		System.out.println(value);
	}

}

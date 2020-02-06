package com.app.lambda;

import java.util.List;

public class Person {

	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	
	
	
	private Person(String fn, String ln, int age, List<String> phoneList) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.age = age;
		this.phoneList = phoneList;
	}

	public static Person of(String fn, String ln, int age, List<String> phoneList) {
		return new Person(fn, ln, age, phoneList);
	}


	String fn;
	String ln;
	int age;
	List<String> phoneList;
	
	
}

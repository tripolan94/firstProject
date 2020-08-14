package com.yedam.classes;

public class Friend {
	private static final Friend[] Friend = null;
	private String name;
	private int age;
	private int number;
	
	public Friend() {	
	}
	
	public Friend(String name, int age, int number) {
		this.name = name;
		this.age = age;
		this.number = number;
		Friend[1]  = new Friend(name, age, number);

		for(int i=0; i<5; i++){
		}

	}
	
	public void getArea(String name, int age, int number) {
		System.out.println(name + age + number);
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	
	
	
}

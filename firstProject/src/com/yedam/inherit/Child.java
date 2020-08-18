package com.yedam.inherit;

public class Child extends Parent { //extends Parent부모파트로 부터 받은 망토
	private int grade;
	
	public Child(String name, int age) {
		super(name, age); //super : 부모애 으해
		
	}
	public Child(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
		
		
		
		
	}
	public void getGrade() {
		// TODO Auto-generated method stub
		
	}
}	

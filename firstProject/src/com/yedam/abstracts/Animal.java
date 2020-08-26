package com.yedam.abstracts;
//추상메소드
public abstract class Animal {
	private String species;
	public Animal() {
		
	}
	public void showInfo() {
		System.out.println("분류는 "+ species);
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound(); //추상메소드
}

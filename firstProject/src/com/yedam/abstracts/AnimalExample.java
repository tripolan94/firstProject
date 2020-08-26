package com.yedam.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal anm = new Animal(); //추상클래스 : 인스턴스 생성불가.
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();
		
		anm = new Dog();
		anm.breathe();
		anm.sound();
		
		int a = 10;
		double b = a; // promotion (자동행변환)
		a = (int) b; // casting
		
		Dog dog = (Dog) anm; // 그냥 '=anm;'은 부모 클래스라서 자식인 dog가 재정의하지 못해서 설정을 이렇게 해줘야 한다.
		dog.sound();
	}
}

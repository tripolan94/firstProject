package com.yedam.classes;

public class Person {

// 필드(속성값을 가짐)
	String name;
	int age;

//생성자↓
	public Person() { // 매개값이 생성자를 기본생성자(default Constructor)
		name = "annoymous";
		age = 10;
	}

	public Person(String name, int age) {
		this.name = name; //this : 필드에 있는 String name값
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
	}

// 메소드↓ (기능을 담음)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { //반환값이 없음=void
		this.age = age;
	}

	public String introduce() {
		return "이름은 " + name + " 나이는 " + age;
	}

}

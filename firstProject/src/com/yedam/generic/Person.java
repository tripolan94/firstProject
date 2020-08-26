package com.yedam.generic;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
}

public String getName() {
	return name;
}

class Worker extends Person {
	public Worker(String name) {
		super(name);
	}
}

class Student extends Person{
	public Student(String name) {
		super(name);		
	}
}

class HighStudent extends Student {
	public HighStudent(String name) {
		super(name);		
	}
}


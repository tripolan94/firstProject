package com.yedam.classes.exam;

//6단원 13번문제
public class Member {
	public String name;
	public String id;
	public String password;
	public int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

}

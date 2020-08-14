package com.yedam.classes;

public class Student {
	private int code; // private: 이 클래스 안에서만 씀. 다른곳 접속막음
	private String name;
	private String major;
	public Student() {
	}//디폴트 생성자 
	

	public Student(int code, String name, String major) {
		this.code = code;
		this.name = name;
		this.major = major;
	}
	
	
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	
	
	
	
	public void getArea(int code, String name, String major) {
		System.out.println(code +","+ name + ","+ major);
	}


	public String toString() {
		return "학번은 " + code + ", 이름은 " + name + ", 전공은" + major;
	}

	
}

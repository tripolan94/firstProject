package com.yedam.classes;

public class Friend {
//필드
	private String name;
	private String major;
	private String phone; //int가 아니라 스트링으로 010-7415 처럼 -가 들어감
	
//생성자 
	public Friend() {	
	}
	public Friend(String name, String major, String number) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}
	

//메소드
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
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
		
	
		
	}
	
	@Override
	public String toString() {
		return 
		"일반친구 이름 : " + this.getName() 
        + ", 연락처 : " + this.getPhone();
	}
}

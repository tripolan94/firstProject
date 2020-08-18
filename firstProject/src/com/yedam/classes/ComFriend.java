package com.yedam.classes;

public class ComFriend extends Friend {
	//ComFriend는 Friend클래스를 상속받는다.
	public ComFriend() {
		super(); 
	}//이건 기본생성자라서 안써줘도 됨
	
	private String comName; //필드

	
	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}
	
	@Override
	public String toString() {
		return "회사친구 이름 : " + super.getName() 
		        + ", 연락처 : " + super.getPhone()
				+ ", 전공명" + this.getMajor();
				}
	
}

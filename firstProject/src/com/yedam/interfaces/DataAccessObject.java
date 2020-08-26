package com.yedam.interfaces;
//인터페이스에는 추상메세지만 와야한다. 인스턴스를 만들 수 없다.
public interface DataAccessObject {
	public void select(); //인터페이스에서는 추상메세지 abstract를 해주지 않아도 디폴트값으로 지정되어 있다.
	public void insert(); 
	public void update(); 
}

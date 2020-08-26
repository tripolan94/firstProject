package com.yedam.generic;

public class Box<T> {
//	private Object obj; 
	private T obj; // Object-> T : 타입을 미지정해두고 결정되면 그때 사용하겠다는 의미
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}

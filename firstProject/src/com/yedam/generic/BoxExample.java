package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get();
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); // 부모클래스의 Object타입을 String타입으로 바꾸려면 이렇게 행변환을 해주어야 한다.
//
//		Person p1 = new Person();
//		box.set(p1);
//		Person p2 = (Person) box.get();
//
//		result = (String) box.get(); //runtime error.
		
	}
}

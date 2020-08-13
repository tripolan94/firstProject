package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		// p 87~91 비교연산자
		int v1 = 20;
		int v2 = 30;
		if (v1 == v2) {
			System.out.println("기본타입 일 경우 비교..");
		
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1, str2는 같은 문자입니다.");
		}
		
//		if(str1 == str3) { // 실제 주소값이 다르기 때문에 안됨.
		if(str1.equals(str3)) { //문자열 자체가 같은 것을 구할때 씀. / .equals()

			System.out.println("str1, str3는 같은 문자입니다.");
		}
		
		System.out.println((1 == 1) && (2 == 2)); //true
		System.out.println((1 == 1) || (2 == 2)); //true

		
	}

}

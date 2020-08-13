package com.yedam.oper;

public class MorningCode {
	public static void main(String[] args) { //void = 공백
		String str1 = "Hello";
		String str2 = "World";
		String name = "박진규";
		System.out.println(str1 + "," + name);
		
		int v1 = 150, v2 = 270;
		int result = add (v1, v2); //add값이 반환 되면 리절트에 받는다. 
		System.out.println("결과값: " + result);
		
		introduce("홍길동");
		
		result = minus(v1, v2);
		System.out.println("결과는 " + result); }

	public static int minus(int a, int b) {
		return a - b;

	}
		
	
		
	
	public static void introduce(String name) { 
		//introduce는 매개값 홍길동을 호출한다. name = 홍길동
		System.out.println("안녕하세요. 저는 이창호입니다.");
		System.out.println("안녕하세요. 저는 " + name + "입니다.");

	}
	
	
	public static int add (int x, int y) { //method // add는 정수형 데이터만 받는다.(int)
		int sum = x + y; // 매개값으로 정수형 타입 2개를 받는다. 
		return sum;
		
	}
}


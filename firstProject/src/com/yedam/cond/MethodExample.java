package com.yedam.cond;

// 메소드?
public class MethodExample {
	public static void main(String[] args) {
		//멀티메소드
		multiTable(2, 5);
		
		int num = 2;
		for (;num <= 9; num++)
		multiTable(num); // ()에 넣은 값이 아래 테이블에서 출력됨.// 메소드를 8번 호출 한 것.
		
		multiTable();
	} //멀티메소드, 그냥 메소드, 빈 메소드 모두 각각으로 넣으면 다 실행 시켜준다. 

	public static void multiTable(int a, int b) {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public static void multiTable(int a) { // 정수타입이 들어와야 출력됨
		int num1 = a;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	} // 전체가 멀티 테이블에 대한 정의 구문

	public static void multiTable() {
		int num1 = 2;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	}
}

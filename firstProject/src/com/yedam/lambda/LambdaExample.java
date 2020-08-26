package com.yedam.lambda;

//함수적 인터페이스(Functional Interface)
interface MyFunctionalInterface {
	public void run(); // 추상메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {

	@Override
	public void run() {
		System.out.println("runnn");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
//		MyFunctionalInterface myintf = new MyFuncClass();
//		MyFunctionalInterface myintf = new MyFunctionalInterface() {
		MyFunctionalInterface myintf = () -> {
			System.out.println("rana");
		};// 익명구현개체 생성식(람다식)

		myintf.run();

		ShowContent sc = content -> { // 매개값이 하나일 때는 ()없어도 됨.
			System.out.println("내용은 " + content + "입니다.");
		};
		sc.show("바나나");

		ShowContent sc2 = (content) -> {
			System.out.println("this is " + content);
		};
		sc2.show("바나나");// this is 바나나.

		
		
//		Calculate cal = new Calculate() {
//			@Override
//			public int sum(int a, int b) {
//				return a+b;
//			}
//			
//		}; cal.sum(10, 5);
//		를 아래로 람다식 변환 
		Calculate cal = (a, b) -> a + b;
		System.out.println("결과: " + cal.sum(10, 5));
		;
	}
}

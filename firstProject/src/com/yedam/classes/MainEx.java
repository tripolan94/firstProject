package com.yedam.classes;

final class FinalClass {
	
}

//class ExtendClass extends FinalClass { // final은 상속 못 받음 
	
//}

//class ExString extends String{
	
//}

public class MainEx {
	final int age = 10;
	public static void main(String[] args) {
		Friend fr = new Friend(); //인스턴스
		fr.getName(); //인스턴스 메소드
		
		Calculator cal = new Calculator();
		cal.add(10, 10); //정적 메소드
//		= Calculator.add(10, 10)
		
		
		
		final int val = 10; 
		//val =20; //final이 변수에 붙으면 값을 바꿀수 없다.
		
		MainEx ex = new MainEx();
		// ex.age = 20; //final이 변수에 붙으면 값을 바꿀수 없다.
		
		
	}
}

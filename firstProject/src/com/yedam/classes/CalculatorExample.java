package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(10, 20); //결과값 반환
		System.out.println("20+10 = " + cal.add(10, 20));
		System.out.println("20.0+10.0 = " + cal.add(10.0, 20.0));

		double r1 = 3.5;
		cal.getArea(r1);
		
		System.out.println(cal.getRectangle(4,5));
		//가로4, 세로5  넓이는 20입니다.
		
		int r2 = 4;
		int r3 = 5;
		cal.getMeta(r2, r3);
	}
}

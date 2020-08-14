package com.yedam.classes;

public class Calculator {
	double pi = 3.14;
	
	//가로, 세로 - > 넓이를 반환해주는 메소드 (getRectangle)
	public int getRectangle(int x, int y) {
		return x * y;
	}
	public void getMeta(int x, int y) {
		int result = x * y;
		System.out.println("가로 " + x + "세로" +y+ "의 넓이는 " + result);
	}
	
	public int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum; 
		//  = (return = x + y;)
	}
	
	public double add(double x, double y) {
		return x + y;
	}
	
	public void getArea(double a) {
		double result = pi * a * a;
		System.out.println("반지름 " + a + "의 넓이는 " + result);
	}
}

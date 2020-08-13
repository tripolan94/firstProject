package com.yedam.oper;

public class OverFlowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// -2147483648 ~ 2147483647
//		int result = safeAdd(2147483647, 10);
		int result = safeAdd(-2147483648, -10);
		System.out.println(result);


	}
			//2147483647-10 < -2147483648
	public static int safeAdd(int a, int b) {
		int sum = 0;
		if (Integer.MAX_VALUE - b < a) { // Integer.MIN_VALUE - b 계산 후 크다작다 연산함.
			System.out.println("유효값이 아닙니다.");
			sum = 0;
			
		} 	
		
//		else if (Integer.MAX_VALUE - b > a) {
		else if (Integer.MIN_VALUE - b > a) {
			System.out.println(a+b);		
			// -2147483648 -10 = 2147483638 오버플로가 발생한것 : 오류
			System.out.println("유효값입니다.");
			sum = 0;			
			}
		
		else {
			sum = a+b;
		}
		
		return sum;
		
	}
	
}

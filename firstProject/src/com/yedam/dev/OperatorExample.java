package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		// 같은 우선순위 : 왼쪽에서 오른쪽 순서 p66
		int vall = 10;
		int result = 3 + 8 - 5 * 4; // 5*4, 3+8, 11-20 순서
		int result2 = (-3) + (8 - 5) * 4 + vall++; 
		System.out.println(result);
		System.out.println(result2);
		
		
		// 나머지 계산 %
		result = 10 % 7;
		System.out.println("나머지 : " + result); // 나머지 : 3
		
		// 나누기 계산 /
		result = 10 / 7;
		System.out.println("나누기1 : " + result); // 나누기1 : 1
		
		double r1 = 10 / 7; // 10 / 7 이 이미 정수 이기때문에 소수점 자리가 안됨.
		System.out.println("나누기2 : " + r1); // 나누기2 : 1.0
		double r2 = 10 / 7.0; // 둘 중 하나를 소숫점 숫자로 고쳐주면 됨.
							  // 실수 = 정수 / 실수
		System.out.println("나누기3 : " + r2); // 나누기3 : 1.4285714285714286
		
		for( int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i + "홀수입니다.");
			} else {
				System.out.println(i + "짝수입니다.");
			}
		}
		
	}
}

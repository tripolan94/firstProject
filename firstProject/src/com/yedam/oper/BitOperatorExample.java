package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		//비트연산자 
		int v1 = 10;  
		int v2 = ~v1; // ~: 비트를 반전시킨다는 의미 00001010 -> 11110101 로 변환 
					  // +/-,64,32,16,8,4,2,1 = 00000000
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + (v2+1));
		
		byte b1 = 10;
		//byte b2 = b1 + 5; // 연산자는 int를 기준으로 하기 때문에 오류가 난다.
		//byte b3 = b1 + b2;
		byte b2 = 4;
		int b3 = b1 % b2;
		
		int result = 10 / 4; //답은 2.5? 아니다. int는 정수형이기 때문에 2로 나온다. 
		double result2 = 10 / 4; //이러면 2.5가 나올까? 아니다. 정수와 정수값이기에 2.0으로 나온다.
		System.out.println(result2);
		double result3 = 10 / 4.0; // 이렇게 하나를 소수자리를 선언해야한다.
		System.out.println(result3);

		
	}
	
}

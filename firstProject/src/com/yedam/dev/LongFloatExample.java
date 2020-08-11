package com.yedam.dev;

import java.math.BigDecimal;

public class LongFloatExample {
	public static void main(String[] args) {
		//Long
		System.out.println(Integer.MAX_VALUE);
		long l1 = 2147483647; // 2147483648로 하면 오류가 뜬다.
		long l2 = 2147483648L; // 범위를 벗어나는 것은 L을 붙여주자.

		//Float
		float f1 = 0.12345678901234567989F; //F적어줘야 함
		double d1 = 0.12345678901234567989;
		double d2 = 0.12345678901234567989;
		double d3 = d1 + d2;
		System.out.println("d3 = " + d3); //정밀도가 떨어짐
		
		BigDecimal bd1 = new BigDecimal("0.12345678901234567989");
		BigDecimal bd2 = new BigDecimal("0.12345678901234567989");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("bd3 = " + bd3);

	}
}

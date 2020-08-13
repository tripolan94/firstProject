package com.yedam.oper;

public class InfinityExample {
	public static void main(String[] args) {
		// 무한대 값
		int x = 5;
		double y = 0;

//		double z = x / y;
//		System.out.println(z); // 무한대라고 뜸.

		double z = x % y; // NaN, Infinity
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("의미없는 값입니다.");
		} else {
			System.out.println(z);

		}

	}
}

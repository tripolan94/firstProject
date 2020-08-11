package com.yedam.dev;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 44032; // 65에 해당되는 유니코드값 =>A
		for (int i = 0; i < 10; i++) {
			System.out.print(c1++ + "\t");

		}

		char c2 = 'A';
		System.out.println((byte) c2); // short, int, byte 다 쓸수있다.
		// double : 소수점 .0 으로 표기

		char c21 = '나';
		System.out.println((int) c21); // byte하면 에러뜸

	}
}

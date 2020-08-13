package com.yedam.exam;

public class Exercise0405 {
	public static void main(String[] args) {

		for (int a = 0; a < 11; a++) {
			for (int b = 0; b < 11; b++) {
				if ((4 * a) + (5 * b) == 60) {
					System.out.println("(" + a + "," + b + ")");
				}
			}
		}
	}
}

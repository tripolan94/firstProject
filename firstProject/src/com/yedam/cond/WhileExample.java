package com.yedam.cond;

public class WhileExample {
	public static void main(String[] args) {
//p124
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		// 1~10값의 합
		int a = 0;
		int sum = 0;
		while (a <= 10) {
			sum = sum + a;
			a++;
			System.out.println("1 ~ " + (a - 1) + " 까지의 합" + sum);
		}

		/*
		 * int c = 1; while(c < 10) { int b = 1; while(b < 10) { System.out.println(c +
		 * " * " + b + " = " + (c*b)); b++; } c++; }
		 */
		int b = 1;
		int c = 1;
		while (c < 10) {
			b = 1;
			while (b < 10) {
				System.out.println(c + " * " + b + " = " + (c * b));
				b++;
			}
			c++;
		}
	}
}

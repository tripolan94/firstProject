package com.yedam.exam;

public class Exercise0403 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for(a=0; a<=100; a++) {
			if(a%3 == 0) {
				b = b + a;
			}
		}
		System.out.println(b);				
	}
}

package com.yedam.exam;

import java.util.Scanner;

public class test001 {
	public static void main(String[] args) {

		int[] num2 = new int[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int num = scanner.nextInt();
			num2[i] = num;

		}
		System.out.println(num2[0] + "," + num2[1] + "," + num2[2]);
		
		for (int c = 0; c < 3; c++) {
			
			if(num2[c]<num2[c++]) {
				System.out.println(num2[c]);
			} 

		}
	}
}

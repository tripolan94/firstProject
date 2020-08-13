package com.yedam.exam;

public class Exercise0404 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		boolean run = true;
		
		while (run) { 
			
			a = (int) (Math.random() * 6);
			b = (int) (Math.random() * 6);
			System.out.println(a + "," + b);	

			if (a+b == 6) {
				System.out.println(a + "," + b);	
				run = false;
			}
			


		}
	}
}

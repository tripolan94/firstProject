package com.yedam.exam;

import java.util.Scanner;

//p135 7번문제
public class Exercise03 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt(); //nextInt : 사용자의 입력을 기다리는 메소드
			
			if (menu == 1) { //1.예금
				System.out.println("예금 금액입력하세요 > ");
				input = scanner.nextInt();
				balance = balance + input;
				System.out.println(balance);
			} else if (menu == 2) {
				System.out.println("출금 금액입력하세요 > ");
				input = scanner.nextInt();
				balance = balance - input;
				System.out.println(balance);
			} else if (menu == 3) {
				System.out.println("잔액 : " + balance);
			} else if (menu == 4)
				run = false;
		
		}//end of while
		System.out.println("프로그램 종료");
	}//end of main
}//end of class

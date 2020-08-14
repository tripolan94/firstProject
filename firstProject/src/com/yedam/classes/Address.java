package com.yedam.classes;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		Friend f1 = new Friend();

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.정보입력  | 2.리스트 | 9.종료");
			System.out.println("--------------------------");

			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("이름 : ");
				String agewrite;
				agewrite = scanner2.nextLine();
				f1.setName(agewrite);
				
				System.out.print("나이 : ");
				int agewrit = scanner.nextInt();
				f1.setAge(agewrit);
				
				System.out.print("전화번호 : ");
				int numberwrite = scanner.nextInt();
				f1.setNumber(numberwrite);
				
				
			} else if (selectNo == 2) {
				f1.getArea;
				
			} else if (selectNo == 9) {
				run = false;
			}

		}

	}

}

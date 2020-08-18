package com.yedam.classes;

import java.util.Scanner;

public class Address {
	
	//1.정보입력(이름, 나이, 전화번호)
	//2.리스트
	//3.이름조회
	//4.이름조회 후 수정
	//9.종료
	
	public static void main(String[] args) {
		Friend[] f1 = new Friend[100];

		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		// 메뉴출력
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.정보입력  | 2.리스트 | 9.종료");
			System.out.println("--------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt(); scanner.nextLine();
			
			if (selectNo == 1) {
				System.out.print("이름 : ");
				String name = scanner.nextLine(); //문자열 입력
				System.out.print("나이 : ");
				int age = scanner.nextInt(); scanner.nextLine();
				System.out.print("전화번호 : ");
				String number = scanner.nextLine();
				
				Friend f = new Friend(name, age, number);
				//한건만 입력해야함
				for(int i = 0; i <f1.length; i++) {
					if(f1[i] == null) {
						f1 [i] = f;
						break;
					}
				}
				
				
			} else if (selectNo == 2) {
				for(Friend frnd : f1) {
					if(frnd != null) {
						System.out.println("이름 : " + frnd.getName()
						+ "나이 : " + frnd.getAge()
						+ "전화번호 : " + frnd.getNumber());
					}
				}
				
			} else if (selectNo == 9) {
				run = false;
			}

		}

	}

}

package com.yedam.exam;

import java.util.Scanner;

import com.yedam.classes.Friend;

public class ExercuseExample0620 {
	private static Exercuse0620[] accountArray = new Exercuse0620[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("계좌번호 : ");
		String accountNumber = scanner.nextLine();
		scanner.nextInt();
		System.out.print("이름 : ");
		String accountName = scanner.nextLine();
		System.out.print("초기입금액 : ");
		int firstMoney = scanner.nextInt();
		scanner.nextLine();
		System.out.println("계좌가 생성되었습니다.");

		Exercuse0620 money = new Exercuse0620(accountNumber, accountName, firstMoney);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = money;
				break;
			}

		}
	}

	// 계좌 목록보기
	private static void accountList() {
		for (Exercuse0620 mon : accountArray) {
			if (mon != null) {
				System.out.println("계좌목록");
				System.out.println("------");
				System.out.print(mon.getAno());
				System.out.print(mon.getOwner());
				System.out.print(mon.getBalance());

			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.println("입금액: ");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				accountArray[i].setBalance(curBalance + balance);
			}
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("출금액: ");
		int balance = scanner.nextInt();
		
		Exercuse0620 acnt = findAccount(ano);
		int curBalance = acnt.getBalance(); // 현재잔액
		acnt.setBalance(curBalance - balance); // 잔고
	}

	private static Exercuse0620 findAccount(String ano) {
		Exercuse0620 searchAcnt = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(ano)) {
				searchAcnt = accountArray[i]; // Account[]
			}
		}
		return searchAcnt;
	}
}

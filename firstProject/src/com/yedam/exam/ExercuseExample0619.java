package com.yedam.exam;

public class ExercuseExample0619 {
	public static void main(String[] args) {
		
	
	Exercuse0619 account = new Exercuse0619();
	
	account.setBalance(10000);
	System.out.println("현재잔고 :" + account.getBalance());
	
	account.setBalance(-100);
	System.out.println("현재잔고 :" + account.getBalance());
	
	account.setBalance(2000000);
	System.out.println("현재잔고 :" + account.getBalance());

	account.setBalance(300000);
	System.out.println("현재잔고 :" + account.getBalance());

	}
}

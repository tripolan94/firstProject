package com.yedam.interfaces;


public class Test0819 {
	public static void main(String[] args) {
		String[] number = {"990205-1234567", "010205/3234567", "980205*2234567", "0102054234567"};
		

		for(int i = 0; i <number.length; i++) {
			char sex = number[i].charAt(7);
			
			char woman = '2';
			char woman1 = '4';
			char man = '1';
			char man1 = '3';

			
			if(sex == man) {
				System.out.println("남자입니다.");
			} else if(sex == man1) {
				System.out.println("남자입니다.");
			} else if(sex == woman) {
				System.out.println("여자입니다.");
			} else if(sex == woman1) {
				System.out.println("여자입니다.");
			} 
			
		}
		
		
	}
}


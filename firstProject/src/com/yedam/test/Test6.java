package com.yedam.test;

public class Test6 {
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		//double var = (double) intValue;
		//byte var = (byte) intValue;
		//int var = (int) doubleValue;
		char var = (char) strValue; // 안됨 
	}
}

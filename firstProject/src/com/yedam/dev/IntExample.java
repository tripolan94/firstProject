package com.yedam.dev;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10; // 십진수 10;
		int var2 = 012; //8진수 12는 => 10
		int var3 = 0xA; //16진수 A => 10
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		// byte b1 = 10;
		// byte result = b1 + 10;
		// 바이트 타입이라서 실행 안됨. (byte) (b1+10); 해줘야 실행
		// 혹은 int result = b1 + 10; 해야함
		
	}
}

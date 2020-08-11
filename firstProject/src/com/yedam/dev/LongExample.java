package com.yedam.dev;

public class LongExample {
	public static void main(String[] args) {
		long l1 = 10;
		System.out.println("long 최대값: " + Long.MIN_VALUE);
		System.out.println("long 최대값: " + Long.MAX_VALUE);
		
		long l2 = 20;
		int result =(int)(l1 * l2); 
//l1,l2는 long형(8byte)이기때문에 더 작은 int(4byte)에 쓸수 없기에 (int)캐스팅 해주어야 한다.
//int + long 형일 때도 큰거 기준으로 돌아간다.
		
	}
}

package com.yedam.ref;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] origAry;
		origAry = new int []{3,6,9,2,4};
		
		int[] cpyAry = new int[5];
		
		for(int i = 0; i< origAry.length; i++) {
			cpyAry[i] = origAry[i];
			System.out.print(cpyAry[i]);
		}
		
//		System.arraycopy(origAry, srcPos, dest, destPos, length)
		System.arraycopy(origAry, 0, cpyAry, 0, 5); // 원본을 복사본에 복사하는 것
			System.out.println(cpyAry);//메모리 위치를 나타내는 수치
		//확장 for()
		for (int num : cpyAry) {
			System.out.print(num);
		}
		
	}
	
}

//3692Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
//at com.yedam.ref.ArrayCopyExample.main(ArrayCopyExample.java:11)
//배열 범위(배열 갯수) 넘쳤을때 뜨는 에러.
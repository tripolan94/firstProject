package com.yedam.test0827;

class Calulator {
	public static int sum(int[] ary) { //정수형 배열값 
		int sum = 0;
		for(int i :ary) { //배열의 숫자 만큼 돌리겠다.(같은 타입이기때문에 가능)
			sum += i;
		}
		return sum;
	}
	
	public static int sum (Member[] ary) {
		int sum = 0;
		for(Member mem:ary) {
			sum += mem.score;
		}
		return sum;
	}
}

class Member {
	String name;
	int score;
}


public class NewExample3 {
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		System.out.println(Calulator.sum(ary));
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member[] mAry = {m1, m2, m3};
		Calulator.sum(mAry);
		
	}
}

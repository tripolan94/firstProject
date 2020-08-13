package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		int m = (int) (Math.random() * 6) + 1; // 0 < m < 6
// Math.random() : 0~1사이의 임의의 수를 만드는 것
		System.out.println(m);

		switch (m) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		case 6:
			System.out.println("6번이 나왔습니다.");
			break;

		}
	}
}

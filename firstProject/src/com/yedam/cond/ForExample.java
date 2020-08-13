package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
//p119
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("연산자 결과는 " + sum);
//위아래 결과는 똑같다.
		sum = 0; // sum 초기화
		for (int a = 0; a < 3; a++) {
			sum = sum + 1;
		}
		sum += 1;
		System.out.println("for 결과는 " + sum);

		sum = 0;
		for (int a = 3; a > 0; a--) {
			sum += 1;
		}
		System.out.println("최종 결과는 " + sum);

		// 1~10범위 값의 합계
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;
			System.out.println("1 ~ 10 합 : " + sum);
		}

		int num = 2;
		System.out.println(num + " * " + 1 + " = " + (num * 1));
		System.out.println(num + " * " + 2 + " = " + (num * 2));
		System.out.println(num + " * " + 3 + " = " + (num * 3));
		System.out.println(num + " * " + 4 + " = " + (num * 4));
		System.out.println(num + " * " + 5 + " = " + (num * 5));
		System.out.println(num + " * " + 6 + " = " + (num * 6));
		System.out.println(num + " * " + 7 + " = " + (num * 7));
		System.out.println(num + " * " + 8 + " = " + (num * 8));
		System.out.println(num + " * " + 9 + " = " + (num * 9));
		System.out.println(num);
//구구단 만들기. 위는 2단, 아래는 2~9단 전체 
		for (int d = 2; d < 10; d++) {
			for (int c = 1; c < 10; c++) {
				System.out.println(d + " * " + c + " = " + (d * c));
			}
		}
		
	}
}

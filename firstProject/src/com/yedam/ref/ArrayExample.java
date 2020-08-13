package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {

		int score1 = 10, score2 = 20, score3 = 30, score4 = 40;
		score2 = 50; // score2의 값을 20->50으로 바꿈.
		int sum = score1 + score2 + score3 + score4;

		int[] intAry = { 10, 20, 30, 40 }; // 배열타입
		sum = intAry[0] + intAry[1] + intAry[2] + intAry[3];
		intAry[1] = 50; // intAry[1]의 값을 20->50으로 바꿈.
		System.out.println(intAry.length); // 배열의 길이

		for (int i = 0; i < 4; i++) {
			System.out.println(intAry[i]);
			// 인덱스값을 순서대로 쓸 수 있다.
			sum = sum + intAry[i];
		}
		System.out.println("sum :" + sum);

		double[] dAry = { 2.3, 4.3 };
		String[] sAry = { "hello", "world", "nice", "good" };
		for (int i = 0; i < sAry.length; i++) {
			System.out.print(sAry[i]);
			System.out.print(" ");
		}

		String[] scoreAry = new String[5]; // 5개 공간에 초기값이 있는것.
		// int = 0 , double = 0.0 String = null
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		scoreAry[0] = "one";
		scoreAry[1] = "two";
		scoreAry[2] = "three";
		for (int i = 0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		} // 값을 지정해 주지 않은 것은 null값
		int[] mathAry;
//		mathAry = {1,2,3,4}; //먼저 선언하고 배열 값을 주려면 안됨.
		mathAry = new int[] { 1, 2, 3, 4 };
	}
}

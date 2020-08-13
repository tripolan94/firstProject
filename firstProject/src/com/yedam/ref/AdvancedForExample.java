package com.yedam.ref;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		int[] scores = new int[5];
		
		int sum = 0;
		double avg= 0;
		int maxVal= 0;
		for (int score : scores) {
			sum = sum + score;
		}
		avg = (double) sum / scores.length;
		System.out.println("합계점수: = " + sum + ", 평균: = " + avg + "합계점수: = " + sum);

		System.out.println("점수총합 = " + sum);
		
		avg= (double) sum / scores.length;
		System.out.println("더블타입의 행분할 = "+ avg);
	}
}

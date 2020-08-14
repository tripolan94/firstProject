package com.yedam.exam;

import java.util.Scanner;

public class Exercise0509 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 > ");
		
			int selectNo = scanner.nextInt(); // .nextInt() : 계속 돌지않고 멈춰있음.
			
				
				if(selectNo == 1) {
					System.out.print("학생수 입력 : ");
					int num = scanner.nextInt();
					scores = new int[num];
					
				} else if (selectNo == 2) {
					for (int i = 0; i< scores.length; i++) {
						System.out.print("점수 입력 [" + i + "]> ");
						scores[i] = scanner.nextInt();
					}
					
				} else if (selectNo == 3) {
					for (int i = 0; i< scores.length; i++) {
						System.out.println("점수 [" + i + "]> " + scores[i]);						
					}
					
				} else if (selectNo == 4) { //분석
					int sum = 0;
					double avg = 0;
					int maxValue = 0;
					for(int i =0; i<scores.length; i++) {
						sum = sum + scores[i];
						if(maxValue < scores[i]) {
							maxValue = scores[i];
						}
					}
					avg = (double) sum / scores.length;
					System.out.println("최고점수 : " + maxValue);
					System.out.println("평균 : " + avg);
				} else if (selectNo == 5) {
					run = false;
				}
			}
		System.out.println("프로그램 종료");
		
		}
		
		
}


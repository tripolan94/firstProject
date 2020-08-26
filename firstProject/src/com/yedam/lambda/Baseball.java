package com.yedam.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		Scanner scn = new Scanner(System.in);
//		BaseballExample base = new BaseballExample();	
//		List<Integer> aList = new ArrayList<>();
		
		
		boolean run = true;
		while (run) {
			int count=0;
			for(int i = 0; i <3; i++) {
				com[i] = scn.nextInt();
				user[i] = (int) (Math.random() * 9) + 1;
				if(com[i] == user[i]){
					count++;
					System.out.println("스트라이크입니다.");
					if(count ==3) {
						break;
					}
				}

								
			}System.out.println("게임종료");
			
			
		}
		
	}

}

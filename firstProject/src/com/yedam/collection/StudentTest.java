package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student("홍길동", 70, 90));
		list.add(new Student("김유신", 90, 77));
		list.add(new Student("강감찬", 11, 20));
		for (Student s : list) {
			System.out.println(s.getName() + ", " + s.getMathscore() + ", " + s.getEnglishscore());
		}

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("-----------------------------");
			System.out.println("1.입력 2.평균 3.최고점수 9종료");
			System.out.println("-----------------------------");

			int num = scn.nextInt();
			scn.nextLine();

			if (num == 1) {
				System.out.println("이름입력 >");
				String name = scn.nextLine();
				System.out.println("수학점수입력 >");
				int mathscore = scn.nextInt();
				System.out.println("영어점수입력 >");
				int englishscore = scn.nextInt();
				list.add(new Student(name, mathscore, englishscore));

			} else if (num == 2) {
				int mathnum = 0;
				int mathsum = 0;
				for (Student s : list) {
					mathsum = mathsum + s.getMathscore();
					mathnum++;
				}
				double mathAvg = mathsum / mathnum;
				System.out.println("수학평균점수 :" + mathAvg);
				
				int engnum = 0;
				int engsum = 0;
				for (Student s : list) {
					engsum = engsum + s.getEnglishscore();
					engnum++;
				}
				double engAvg = engsum / engnum;
				System.out.println("영어평균점수 :" + engAvg);

			} else if (num == 3) {
				Student maxStu = list.get(0);
				for (Student s : list) {
					if (maxStu.getMathscore()<maxStu.getMathscore()) {
						maxStu = s;
					}
				}
				System.out.println("수학최고점: " + maxStu.getMathscore() + " 이름: " + maxStu.getName());
			} else if (num == 9) {
				run = false;
			}
		} System.out.println("시스템이 종료되었습니다.");

	}
}

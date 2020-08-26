package com.yedam.classes;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) { // 2020-08-19
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)); // 0~11
		// month 가 0부터 시작해서 8월이 아니라 7월로 뜸
		System.out.println(cal.get(cal.DATE));

		cal.set(2020, 7, 0); // 날짜 재지정
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)); // 0~11
		System.out.println(cal.get(cal.DAY_OF_WEEK)+ "일"); // 일요일
		System.out.println(cal.get(cal.DATE)); // 0입력 : 그 달의 마지막 날
		createCalendar(2020, 2);

	}

	public static void createCalendar(int year, int monthnow) {
		Calendar cal = Calendar.getInstance();
		int month = monthnow-1;
		
		cal.set(year, month, 0);
		System.out.println(year + "년 " + month + "월달");

		System.out.println(cal.get(cal.DATE) + "일수까지 나옴");

		int alldate = cal.get(cal.DATE);
		System.out.println("일 " + '\t' + "월" + '\t' + "화" + '\t' + "수" + '\t' + "목" + '\t' + "금" + '\t' + "토");

		for (int i = 1; i <= alldate; i++) {	
			cal.set(year, month, i);
			System.out.print(i);
			System.out.print('\t');
			if (cal.get(cal.DAY_OF_WEEK) == 7) {
				System.out.println(" ");
			}
			
			
			
		
		}
	}
}


/*
 * if (cal.get(cal.DAY_OF_WEEK) == i) { System.out.println(" "); } else if
 * (cal.get(cal.DAY_OF_WEEK) + 7 == i){ System.out.println(" "); } else if
 * (cal.get(cal.DAY_OF_WEEK) + 14 == i){ System.out.println(" "); } else if
 * (cal.get(cal.DAY_OF_WEEK) + 21 == i){ System.out.println(" "); } else if
 * (cal.get(cal.DAY_OF_WEEK) + 28 == i){ System.out.println(" "); }
 */

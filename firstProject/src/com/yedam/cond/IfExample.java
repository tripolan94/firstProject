package com.yedam.cond;

public class IfExample {
	public static void main(String[] args) {
		int score = 10;
		String grade = ""; // "" : 없는게 아니라 값을 받겠다는 의미.
//p114
		if (score >= 90) {
			if (score >= 95) { // if문 안에 또 if문을 넣을 수 있다.
				grade = "+A";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "+B";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "+C";
			} else {
				grade = "C";
			}
		} else if (score >= 65) {
			grade = "+D";

		} else {
			grade = "D";
		}

		// else if로 하지 않고 if로 하면 값이 각자 다른 2개가 나와도 마지막 하나만 값으로 판단 한다.
		System.out.println("등급은 " + grade + "입니다.");

	}
}

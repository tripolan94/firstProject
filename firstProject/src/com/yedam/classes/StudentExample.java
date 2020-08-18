package com.yedam.classes;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setCode(111);
		s1.setName("홍길동");
		s1.setMajor("역사");
		System.out.println("학번은 " + s1.getCode());
		System.out.println("이름은 " + s1.getName());
		System.out.println("전공은 " + s1.getMajor());
		
		Student s2 = new Student(222, "김유신", "말하기");
		System.out.print("학번은 " + s2.getCode());
		System.out.print("이름은 " + s2.getName());
		System.out.println("전공은 " + s2.getMajor());
		Student s3 = new Student(333, "최재영", "역사");
		Student s4 = new Student(444, "민해주", "말타기");
	
		
		String searchName = "홍길동";
		String searchMajor = "역사";
		
		
		Student[] sAry = {s1, s2 , s3 ,s4};
		for (Student s : sAry) {
			if (s.getName().equals (searchName)) {
				System.out.println(s.toString());
			} else if (s.getMajor().equals (searchMajor)) {
				System.out.println(s.toString());
			}
		}
		 
		
	}
}

package com.yedam.test0826;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseMain {
	public static void main(String[] args) {
		List cl = new ArrayList<>();
		List st = new ArrayList<>();

		String classname = null;
		int classnumber = 0;
		String name = null;
		int age = 0;
		int grade = 0;
		Course cou = new Course(classname, classnumber);
		Student stu = new Student(name, age, grade);

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.과정등록 2.학생등록 3.과정의 정보확인 9.종료");
			System.out.println("------------------------");
			System.out.println("입력>");

			int Num = scn.nextInt();
			scn.nextLine();

			if (Num == 1) {
				cou = new Course(classname, classnumber);
				System.out.println("과정명등록>");
				classname = scn.nextLine();
				System.out.println("수강인원입력>");
				classnumber = scn.nextInt();
				cou.setClassname(classname);
				cou.setClassnumber(classnumber);
				cl.add(cou); //Course에 과정 등록
			} else if (Num == 2) {

				System.out.println("과정명입력>");
				String classname2 = scn.nextLine();
				if(classname2 == cou.getClassname())	{
					for (int i = 0; i < cou.getClassnumber(); i++) {
						stu = new Student(name, age, grade);
						System.out.println((i + 1) + "번 학생" + "(" + cou.getClassnumber() + "까지 입력가능)");
						System.out.println("이름입력>");
						name = scn.nextLine();
						System.out.println("나이입력>");
						age = scn.nextInt();
						System.out.println("점수입력>");
						grade = scn.nextInt();
						scn.nextLine();
						stu.setName(name);
						stu.setAge(age);
						stu.setGrade(grade);
						st.add(stu);
					}
					System.out.println(cou.getClassname() + "학생입력종료");
				}
					

			} else if (Num == 3) {
				int size = cl.size();
				for (int i = 0; i < size; i++) {
					Course a = (Course) cl.get(i);
					System.out.println(a.getClassname() + ", " + a.getClassnumber());
				}

			} else if (Num == 9) {
				break;
			}
		}
	}

}

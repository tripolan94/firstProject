package com.yedam.api;

import java.util.Comparator;
import java.util.Objects;


//p475

public class ObjectsCompare {
	
		public static void main(String[] args) {
			Student s1 = new Student(5);
			Student s2 = new Student(5);
			Student s3 = new Student(6);

			int result = Objects.compare(s1, s2, new StudentComparator());
			System.out.println(result);
			int result2 = Objects.compare(s1, s3, new StudentComparator());
			System.out.println(result2);
		}			

		
		static class Student {
			int sno;
			Student(int sno){
				this.sno = sno;
			}
		}
		
		static class StudentComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.sno<o2.sno) return -1;
				else if (o1.sno == o2.sno) return 0;
				else return 1;
				//return Integer.compare(o1.sno, o2.sno); //위랑 같은말
			}
			
		}
		
	
}

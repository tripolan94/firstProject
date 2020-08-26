package com.yedam.generic;

import com.yedam.generic.Person.Student;
import com.yedam.generic.Person.Worker;

public class WildCardExample {
	public static void registerCourse(Course<?> course) { // 모든타입의 클래스를 받겠다는 의미(와일드카드)

	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		// Student클래스 or Student클래스를 상속받는 클래스(하위 클래스)만 올 수 있다.
	}

	public static void registerCourseWorker(Course<? super Worker> course) { //
		// Course<Worker>, Course<Person> 워커클래스와 워커클래스의 상위클래스들을 받음
	}

	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));

		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
		crsWorker.add(new Worker("직장인2"));
		
		Course<Worker> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));
		crsPerson.add(new HighStudent("고등학생2"));

		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정" , 5) ;
		crsPerson.add(new HighStudent("고등학생3"));
		
		// 일반인등록가능. Course<?> //모든 클래스 가능
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		
		// 직장인등록가능. Course<? super Worker>
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crsStudent);
//		registerCourseWorker(crsHighStudent);//안됨
		
		// 학생등록가능. Course<? extends Student
		registerCourseStudent<crsStudent);
		
		// 고등학생가능.

	}
}

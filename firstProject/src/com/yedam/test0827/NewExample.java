package com.yedam.test0827;

class Something { // something = "hello", 10; 의 생성자
	String field1;
	int field2;
	int[] field3;
	Student student;//다른 생성자를 가져옴.
	
	public Something(String field1, int field2, int[] field3) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	public void setStudent(Student student) {
		this.student = student; //변수를 여기서 사용하겠다는 의미. 정의하는것.
	}
	public Student getStudent() {
		return student;
	}

}

class Student{
	String studentName = "initValue";
	int studentAge =10;
	int studentScore =11;
}


public class NewExample {
	public static void main(String[] args) {
		int numA = 10;
		String str = "10";
		float f1 = 10.8f;

//	something = "hello", 10; //2개의 값을 넣고싶다면? 생성자를 만들어야 한다.
		Something something = new Something("hello", 10, new int[] { 1, 2, 3, 4, 5 });
		for (int i = 0; i < something.field3.length; i++) {
			System.out.println(something.field3[i]);
		}
		Student st1 = new Student();
		something.setStudent(st1); //실제값이 들어가야함
		something.setStudent(new Student()); //이렇게 해도 됨
		System.out.println(something.getStudent()); //이렇게하면 주소값만 나옴.
		System.out.println(something.getStudent().studentName); 
		System.out.println(something.getStudent().studentAge); 
		System.out.println(something.getStudent().studentScore); 

	}

}

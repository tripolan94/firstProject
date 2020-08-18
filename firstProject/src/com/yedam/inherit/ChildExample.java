package com.yedam.inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동" , 15, 10);
		child.getName(); //부모 getName()
		child.getAge(); //부모 getAge()
		child.getGrade(); // 자신 getGrade()
		
		Parent parent = new Child ("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade(); //자식 x
			
		
		Vehicle v1 = new Taxi();
//		v1.run();
		v1 = new Bus();
//		v1.run();
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}
}

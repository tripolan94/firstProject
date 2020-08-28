package com.yedam.api;

import java.util.Arrays;

//p469
public class CloneExample2 {
	
	class Car {
		public String model;
		public Car (String model) {
			this.model = model;
		}
	}
	
	
	
	class Clone implements Cloneable {
		public String name;
		public int age;
		public int[] scores;
		public Car car;
		
		public Clone(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			Clone cloned = (Clone) super.clone();
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			cloned.car = new Car(this.car.model);
			return cloned;
		}
		
		public Clone getClone() {
			Clone cloned = null;
			try {
				cloned = (Clone) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	}
	
	
	
	public static class CloneExample {
		public static void main(String[] args) {
			CloneExample2 ce = new CloneExample2();
			Clone original = ce.new Clone("홍길동", 25, new int[] {90,90} ,ce.new Car("소나타"));
			Clone cloned = original.getClone();
			cloned.scores[0] = 100;
			cloned.car.model = "그랜저";
			
			System.out.println("[복제 객체의 필드값]");
			System.out.println("name :" + cloned.name);
			System.out.println("age :" + cloned.age);
			System.out.print("scores {");
			for(int i = 0; i<cloned.scores.length; i++) {
				System.out.print(cloned.scores[i]);
				System.out.print((i==(cloned.scores.length-1))?"":",");
			}
			System.out.println("}");
			System.out.println("car :" + cloned.car.model); //model안쓰면 주소값으로 뜸 ㅠ
			
			System.out.println();

			System.out.println("[원본 객체의 필드값]");
			System.out.println("name :" + original.name);
			System.out.println("age :" + original.age);
			System.out.print("scores {");
			for(int i = 0; i<original.scores.length; i++) {
				System.out.print(original.scores[i]);
				System.out.print((i==(original.scores.length-1))?"":",");
			}
			System.out.println("}");
			System.out.println("car :" + original.car.model);
		}
	}
}

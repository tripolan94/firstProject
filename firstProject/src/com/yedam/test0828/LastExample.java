package com.yedam.test0828;

import java.util.ArrayList;
import java.util.List;

public class LastExample {
	class People {
		String name;
		int age;
		Pet[] pets;
		Fruit[] fruits;

		public People(String name, int age, Pet[] pets, Fruit[] fruits) {
			super();
			this.name = name;
			this.age = age;
			this.pets = pets;
			this.fruits = fruits;
		}
	}

	class Pet {
		String name;
		int age;
		String gender;
	}

	class Fruit {
		String name;
		int price;
	}

	public static void main(String[] args) {
		Pet[] p1 = {new Pet(), new Pet()};
		Fruit[] f1 = {new Fruit(), new Fruit()};
		People cjy = new People("최재영", 20, p1, f1);
		People mhj = new People("민해주", 21, new Pet[] {new Pet(),new Pet(),new Pet()},
				new Fruit[] {new Fruit(), new Fruit()});
		People ksm = new People("김상민", 21,null, null);
		List<People> personData = new ArrayList<>();
		personData.add(cjy);
		personData.add(mhj);
		personData.add(ksm);
		
		//민해주의 정보
		personData.get(1).pets[0].name = "야옹이";
		personData.get(1).pets[0].age = 2;
		personData.get(1).pets[0].gender = "수컷";
		//김상민의 정보
		personData.get(2).fruits[1].name = "사과";
		personData.get(2).fruits[1].price = 2;
	}
}

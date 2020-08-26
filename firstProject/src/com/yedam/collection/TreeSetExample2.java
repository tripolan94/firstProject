package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1", 11));
		set.add(new Person("Hong2", 12));
		set.add(new Person("Hong3", 15));
		set.add(new Person("Hong4", 10));

		SortedSet<Person> sSet = set.headSet(new Person("Sorted", 12)); // 12를 제외시킴. 12를 포함시키고 싶다면 매개값을 추가시키면 된다.
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("-------------------------------");

		NavigableSet<Person> nSet = set.headSet(new Person("Sorted" , 12), true); // 12도 포함시킴 ture를 false로 바꾸면 위와 값이 같다
		for (Person person : nSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("----------------z---------------");
		
		
		sSet = set.tailSet(new Person("So", 12));
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("-------------------------------");
		
		sSet = set.subSet(new Person("Temp", 10), new Person("Temp2", 13)); //범위값을 가져옴
		for (Person person : sSet) {
			System.out.println(person.name + ", " + person.age);
		}
		System.out.println("---------------z----------------");
		
		
		
		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().name + ", " + iter.next().age); // 오류남
		}
	}
}

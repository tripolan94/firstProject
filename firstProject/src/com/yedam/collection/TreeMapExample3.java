package com.yedam.collection;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3{
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
//		tMap.headMap(toKey)를 이용해서  //80점이하의 점수를 구현해보라.
//		tMap.tailMap(fromKey) //80점 이상
//		tMap.subMap(fromKey, toKey) //70~80사이
		
		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88));  //80점이하의 점수
		Set<Student> set = sMap.keySet();
		for (Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathscore());
		}
		System.out.println("-----------------------------");

		sMap = tMap.tailMap(new Student("Base", 80, 88));
		set = sMap.keySet();
		for (Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathscore());
		}
		System.out.println("-----------------------------");
		
		sMap = tMap.subMap(new Student("1", 70, 88), new Student("1", 80, 88));
		set = sMap.keySet();
		for (Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathscore());
		}
		
		

	}
}

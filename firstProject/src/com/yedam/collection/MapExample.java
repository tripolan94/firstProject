package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	public static void getInfo(Map<String, String> m) {
		System.out.println("이름: " + m.get("이름"));
		System.out.println("전공: " + m.get("전공"));
	}
	public static void getAge(Map<String, Integer> m) {
		Set<String> set = m.keySet();
		for(String str : set) {
			
			System.out.println("이름: " + str + ", 나이: "+ m.get(str));			
		}
	}
	
	
	
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("최재영", 20);
		m.put("김현동", 23);
		m.put("허성준", 26);
		getAge(m);

		
		Map<String, String> m3 = new HashMap<>();
		m3.put("이름", "홍길동");
		m3.put("전공", "역사학");
		getInfo(m3);

		
		Map<Integer, Member> map = new HashMap<>();
		map.put(11, new Member("김현동", 20));
		map.put(12, new Member("박진규", 21));
		map.put(13, new Member("오재훈", 22));
		
		System.out.println(map.get(11).getName() + ", " + map.get(11).getAge());
		System.out.println("----------------------");
		
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			Member m1 = map.get(i);
			System.out.println(m1.getName() + ", " + m1.getAge());
		}
		System.out.println("----------------------");

		Set<Map.Entry<Integer, Member>> entSet = map.entrySet();
		for (Map.Entry<Integer, Member> m1 : entSet) {
			System.out.println(m1.getKey()+ ", " +m1.getValue().getName()+ ", " +m1.getValue().getAge());
		}
		

		
	}
	
	
}

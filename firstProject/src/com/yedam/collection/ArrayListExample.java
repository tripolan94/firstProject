package com.yedam.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("허성준");
		list.add("김시무");
		list.add(1, "이광호");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------"); 
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("--------------------------"); 
		System.out.println(list.get(0)); // 허성준
		System.out.println(list.get(1)); // 이광호
		System.out.println(list.get(2)); // 김시무

	}
}

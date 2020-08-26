package com.yedam.api;

import java.util.Arrays;

class User implements Comparable<User> {
	String name;
	int grade;

	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public int compareTo(User o) {
//		return this.grade - o.grade;  // 1 - 2 : 음수(오름차순), 양수(내림차순)
		return this.name.compareTo(o.name); // 오름차순
	}
}

public class ArrayExample {
	public static void main(String[] args) {
		String[] names = { "Hong", "Park", "Choi" };
//		names => "Choi","Hong","Park" 정렬해보기(글자순으로)
		Arrays.sort(names);
		for (String s : names) {
			System.out.println(s);
		}

		User[] users = { new User("user1", 1), new User("user2", 2), new User("user3", 3) };
		Arrays.sort(users);

		for (User s : users) {
			System.out.println(s.name + ", " + s.grade);
		}

		// user3,user2,user1

	}
}

package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		tSet.add(new Integer(33));

		Iterator<Integer> dIter = tSet.descendingIterator(); // 오름 차순 순서를 바꿀때 사용
		while (dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		System.out.println("-------------------");

		NavigableSet<Integer> nSet = tSet.descendingSet();
		for (Integer icnt : nSet) {
			System.out.println(icnt);
		}
		System.out.println("-------------------");


		Integer t = tSet.first(); // 가장 작은 값을 가져온다.
		System.out.println("가장 작은 값 : " + t);
		System.out.println("-------------------");

		t = tSet.last(); // 가장 큰 값을 가져온다.
		System.out.println("가장 큰 값 : " + t);
		System.out.println("-------------------");

		t = tSet.floor(new Integer(90)); // <=
		t = tSet.lower(new Integer(90)); // <
		System.out.println(t);
		System.out.println("-------------------");

		t = tSet.ceiling(new Integer(80)); // >=
		t = tSet.higher(new Integer(80)); // >
		System.out.println(t);
		System.out.println("-------------------");

		t = tSet.pollFirst(); // 작은 값 부터 빼오고 그 값을 지움.
		System.out.println(t + ", " + tSet.size());
		t = tSet.pollFirst();
		System.out.println(t + ", " + tSet.size());
		t = tSet.pollFirst();
		System.out.println(t + ", " + tSet.size());

		int size = tSet.size();
		for (int i = 0; i < size; i++) {
//			t = tSet.pollFirst(); 
			t = tSet.pollLast(); // 큰 값부터 빼오고 그 값을 지움.
			System.out.println(t + ", " + tSet.size());
		}
		System.out.println("-------------------");

		Iterator<Integer> iter = tSet.iterator();
		while (iter.hasNext()) { // hasNext: 반복자안에서 뽑아내는 것. 다 뽑고나면 false가 된다.
			Integer icnt = iter.next();
			System.out.println(icnt);
		}

	}
}

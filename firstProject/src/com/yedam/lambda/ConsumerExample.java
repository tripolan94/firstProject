package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
//		Consumer<String> consumer = new Consumer<String>() {
//			@Override
//			public void accept(String t) {				
//				System.out.println(t + "님 반갑습니다.");
//			}
//		};
//		consumer.accept("최재영");

		// Consumer 타입
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "님 반갑습니다.");
		};
		consumer.accept("최재영");
		
		
		
		// BiConsumer 타입
		BiConsumer<String, String> biCon = (a, b) -> {
			System.out.println(a + "는 " + b);
		};
		biCon.accept("사과", "맛있다.");
		
		BiConsumer<Integer, Integer> biInt = (a, b) -> {
			System.out.println(a + " x " + b + " = " + (a * b));
		};
		biInt.accept(5, 5);
		
		
		
		
	}
}

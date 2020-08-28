package com.yedam.test0827;


public class NewExample5 {
	public static void main(String[] args) {
		nvl(null, "초기값"); // => "초기값"
		nvl("입력값", "초기값"); // => "입력값"
	}
	
	private static void nvl(String str1, String defaultValue) {
		System.out.println((str1 ==null) ? defaultValue : str1);
	}
}

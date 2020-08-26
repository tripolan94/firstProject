package com.yedam.exception;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class Clazz = Class.forName("sec06.exam03_newinstance.SendAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

package com.yedam.interfaces;

public class MySqlDb implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB 입력.");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB 수정.");
	}

	@Override
	public void update() {
		System.out.println("MySql DB 조회.");
	}
	
}

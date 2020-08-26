package com.yedam.collection;
//15-07문제

import java.util.List;
import java.util.ArrayList;

public class BoardDao {

	public List <Board> getBoardList() {
		
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("라이언일병","전쟁"));
		list.add(new Board("양들의침묵","추리"));
		list.add(new Board("씬오브레드라인","전쟁"));
		return list;
		
		
		
	}
	
	
	
	
}

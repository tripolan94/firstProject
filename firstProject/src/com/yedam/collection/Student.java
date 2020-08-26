package com.yedam.collection;

public class Student implements Comparable <Student>{ //implements Comparable기준을 정해주는 것
	private String name;
	private int mathscore;
	private int englishscore;
	
	public Student() {
	}
	
	public Student(String name, int mathscore, int englishscore) {
		super();
		this.name = name;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}

	public void setEnglishscore(int englishscore) {
		this.englishscore = englishscore;
	}

	public String getName() {
		return name;	
	}
	public int getMathscore() {
		return mathscore;
	}
	public int getEnglishscore() {
		return englishscore;
	}

	@Override
	public int compareTo(Student o) {
		return this.mathscore -o.mathscore;
	}
	
	
	
}


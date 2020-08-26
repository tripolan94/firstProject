package com.yedam.test0826;

public class Course {
	private String classname;
	private int classnumber;

	
	
	public Course(String classname, int classnumber) {
		this.classname = classname;
		this.classnumber = classnumber;
	}


	@Override
	public String toString() {
		return "Course [classname=" + classname + "]";
	}


	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getClassnumber() {
		return classnumber;
	}
	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
	}
	
		
		
	
	
}

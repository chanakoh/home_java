package com.kh.hw.person.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		
	}
	public Student(int grade, String major, Object Person) {
		super(Person);
	}
}

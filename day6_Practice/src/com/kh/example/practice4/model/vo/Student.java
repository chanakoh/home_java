package com.kh.example.practice4.model.vo;

public class Student {

	private int classroom = 3;
	private String name = "이름";
	private double height = 181.5;
	private char gender = '남';
	private int grade = 3;
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
			return classroom;
	}	
	public String getName() {
			return name;
	}		
	public double getHeight() {
			return height;
	}
	public char getGender() {
			return gender;
	}
	public Student() {
		
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println("내 학년은"+grade);
		System.out.println("내 반은"+classroom);
		System.out.println("내 이름은"+name);
		System.out.println("내 키는"+height);
		System.out.println("내 성별은"+gender);
	}
	
	
	
}

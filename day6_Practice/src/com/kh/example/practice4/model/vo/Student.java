package com.kh.example.practice4.model.vo;

public class Student {

	private int classroom = 3;
	private String name = "�̸�";
	private double height = 181.5;
	private char gender = '��';
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
		System.out.println("�� �г���"+grade);
		System.out.println("�� ����"+classroom);
		System.out.println("�� �̸���"+name);
		System.out.println("�� Ű��"+height);
		System.out.println("�� ������"+gender);
	}
	
	
	
}

package com.kh.example.practice4;

public class Student {

	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
		public void information() {
			System.out.println("���� "+grade+" �г� �Դϴ�.");
			System.out.println("���� "+classroom+"�� �Դϴ�.");
			System.out.println("�� �̸���"+name+"�Դϴ�.");
			System.out.println("�� Ű�� "+height+"cm �Դϴ�.");
			System.out.println("�� ������ "+gender+" �Դϴ�.");
	}
}

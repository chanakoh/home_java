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
			System.out.println("저는 "+grade+" 학년 입니다.");
			System.out.println("저는 "+classroom+"반 입니다.");
			System.out.println("제 이름은"+name+"입니다.");
			System.out.println("제 키는 "+height+"cm 입니다.");
			System.out.println("제 성별은 "+gender+" 입니다.");
	}
}

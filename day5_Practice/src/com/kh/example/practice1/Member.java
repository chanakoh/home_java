package com.kh.example.practice1;


public class Member {

	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	public void changeName() {
		memberName = "º¯°æ";
	}
	public void printName() {
		System.out.println(memberName);
}
}
package com.kh.day2;

import java.util.Scanner;

public class IfPractice3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		
		if(kor+math+eng>=180) {
			System.out.println("���� :" + kor);
			System.out.println("���� :" + math);
			System.out.println("���� :" + eng);
			System.out.println("�հ� :" + (kor+math+eng));
			System.out.println("���� :" + (kor+math+eng)/3);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
}

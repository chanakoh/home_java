package com.kh.day2;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int menu;
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		default:
			System.out.println("���α׷��� ����˴ϴ�.");
		}	
	}

}
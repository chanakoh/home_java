package com.kh.day2;

import java.util.Scanner;

public class IfPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ �����Է� : ");
		int month = sc.nextInt();
		
		
		switch(month) {
		case 1:
			System.out.println(month+"���� �ܿ��Դϴ�.");
			break;
		case 2:
			System.out.println(month+"���� �ܿ��Դϴ�.");
			break;
		case 3:
			System.out.println(month+"���� ���Դϴ�.");
			break;
		case 4:
			System.out.println(month+"���� ���Դϴ�.");
			break;
		case 5:
			System.out.println(month+"���� ���Դϴ�.");
			break;
		case 6:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 7:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 8:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 9:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 10:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 11:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case 12:
			System.out.println(month+"���� �ܿ��Դϴ�.");
			break;
		default :
			System.out.println(month+"���� �߸��� ���Դϴ�.");
		
		
		}	
	}

}

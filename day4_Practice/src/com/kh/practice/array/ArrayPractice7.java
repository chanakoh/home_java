package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� :");
		String chars = sc.next(); 
		
		char[] add = chars.toCharArray();
		int addLength = add.length;
		System.out.print("���ڿ��� �ִ� ���� :");
		for(int i = 0; i<addLength; i++) {
			
			System.out.print( add[i]);
		}
		System.out.println(" ");
		System.out.print("���� ���� : "+addLength);
	
	}

}
/*���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
������ ������ �Բ� ����ϼ���.
ex.
���ڿ� : application
���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n
���� ���� : 8*/
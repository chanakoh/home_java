package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 ���� ���� �Է� : ");
		
		int day = sc.nextInt();
		String[] val = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		if(day>6 || day <0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
		System.out.println(val[day]);
		}
		
		
	}

}

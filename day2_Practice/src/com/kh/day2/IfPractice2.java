package com.kh.day2;

import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("���ڸ� �� �� �Է��ϼ���. : ");
	
	int way = sc.nextInt();

	if (way > 0) {
		if(way %2== 0) {
		System.out.println("¦����. ");
	}else {
		System.out.println("Ȧ����. ");
	}
	}	else {
		System.out.println("����� �Է����ּ���. ");
	}
	}
}

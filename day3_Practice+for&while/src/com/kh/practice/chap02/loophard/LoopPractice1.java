package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int num = sc.nextInt(); 
		int ab = num%2;
		
		if(num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if(ab == 1) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		
		}
}
}
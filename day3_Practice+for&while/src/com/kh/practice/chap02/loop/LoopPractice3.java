package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		
		if(num < 1) { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i = num; i> 0; i--) {
				System.out.println(i);
			}
		}
}
}
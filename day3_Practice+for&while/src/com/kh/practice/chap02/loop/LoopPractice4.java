package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("���ڸ� �Է����ּ���: ");
			int num = sc.nextInt();
		if(num < 1) { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
			System.out.println("-------------------- ");
		} else { 
			for (int i = num; i> 0; i--) {
				System.out.println(i);
				
			}	isTrue = true;
		}
		}
	}
}

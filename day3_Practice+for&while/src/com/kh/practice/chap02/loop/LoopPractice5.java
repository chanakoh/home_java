package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ� �Է��ϼ���:");
		int num = sc.nextInt();
		int sum = 0;
			for (int i = 1; i<= num; i++) {
				sum += i; 
				
			}System.out.println("1���� �� ����ϱ� : "+sum);
	}

}

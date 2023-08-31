package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요:");
		int num = sc.nextInt();
		int sum = 0;
			for (int i = 1; i<= num; i++) {
				sum += i; 
				
			}System.out.println("1부터 합 출력하기 : "+sum);
	}

}

package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int num = sc.nextInt(); 
		int ab = num%2;
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(ab == 1) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		
		}
}
}
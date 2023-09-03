package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
			if(num%2==0) {
				System.out.println("소수가 아닙니다.");
			}else {
				System.out.println("소수 입니다.");
			}
		
		}
}

package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int num1 = sc.nextInt(); 
		int result = 0;  

		if(num1>9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}else {
		while(num1<10) {
		for (int i = 1; i <=9; i++) {
			result += num1;
			System.out.println(num1 + " * " + i + " = " + result);
		} num1 = ++num1;
		}
		}
	
	}
	}

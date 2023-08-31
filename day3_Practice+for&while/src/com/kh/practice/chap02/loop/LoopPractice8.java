package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알고싶은 구구단수를 입력하시오.");
		int num1 = sc.nextInt(); 
		
		int result = 0;  
		for (int i = 1; i <=9; i++) {
			result += num1;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}

}

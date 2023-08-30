package com.kh.day2;

import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 한 개 입력하세요. : ");
	
	int way = sc.nextInt();

	if (way > 0) {
		if(way %2== 0) {
		System.out.println("짝수다. ");
	}else {
		System.out.println("홀수다. ");
	}
	}	else {
		System.out.println("양수만 입력해주세요. ");
	}
	}
}

package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		
		int day = sc.nextInt();
		String[] val = {"월", "화", "수", "목", "금", "토", "일"};
		
		if(day>6 || day <0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
		System.out.println(val[day]);
		}
		
		
	}

}

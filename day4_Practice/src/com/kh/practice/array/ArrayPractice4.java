package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt(); 

			if (num >= 3 && num % 2 == 1) { 

				int[] val = new int[num];
				int value = 1;

				for (int i = 0; i < val.length; i++) { 
					val[i] = value;
					if (i < val.length / 2) { // 중간지점 반복 관련 별도 메서드가 있을거라 생각해서 확인
						value++;
					} else {
						value--;
					}
				}
				for (int i = 0; i < val.length; i++) {
					System.out.print(val[i] + " ");
				}
				return; 

			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
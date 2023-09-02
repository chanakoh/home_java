package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력해 주세요.");
		int num = sc.nextInt();
		
		int[] val = new int[num];
		
		for(int i = 0; i<val.length; i++ ) {
			val[i] = i+1;
			System.out.println(val[i]);
		}
		
	}
	}


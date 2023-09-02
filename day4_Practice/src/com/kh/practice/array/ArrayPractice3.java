package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice3 {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력해주세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int[] val = new int[num];
		for( int i = 0; i<val.length; i++) {
		System.out.println("배열"+i+"번째 인덱스에 넣을 값 : ");
		val[i] = sc.nextInt(); // int val = sc.nextint()로 입력해서 미출력
		
		}for( int i = 0; i<val.length; i++) {
			sum += val[i];
		}
		System.out.println("총합:"+sum);
	}
	}

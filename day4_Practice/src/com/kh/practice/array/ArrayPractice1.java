package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��� �ּ���.");
		int num = sc.nextInt();
		
		int[] val = new int[num];
		
		for(int i = 0; i<val.length; i++ ) {
			val[i] = i+1;
			System.out.println(val[i]);
		}
		
	}
	}


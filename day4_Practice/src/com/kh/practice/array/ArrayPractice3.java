package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice3 {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ���̸� �Է����ּ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		int[] val = new int[num];
		for( int i = 0; i<val.length; i++) {
		System.out.println("�迭"+i+"��° �ε����� ���� �� : ");
		val[i] = sc.nextInt(); // int val = sc.nextint()�� �Է��ؼ� �����
		
		}for( int i = 0; i<val.length; i++) {
			sum += val[i];
		}
		System.out.println("����:"+sum);
	}
	}

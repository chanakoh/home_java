package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt(); 

			if (num >= 3 && num % 2 == 1) { 

				int[] val = new int[num];
				int value = 1;

				for (int i = 0; i < val.length; i++) { 
					val[i] = value;
					if (i < val.length / 2) { // �߰����� �ݺ� ���� ���� �޼��尡 �����Ŷ� �����ؼ� Ȯ��
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
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
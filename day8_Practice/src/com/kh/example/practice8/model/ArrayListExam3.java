package com.kh.example.practice8.model;

import java.util.Scanner;

public class ArrayListExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int sum = 0;
		
		int[] number = {num1,num2,num3,num4,num5};
		for(int numbers : number) {
			sum += numbers;
	}System.out.println(sum);

}
}
/*3-3) ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���*/
package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt(); //2
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt(); //4
		
		if(num1<num2)
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
		}
		}
}
}
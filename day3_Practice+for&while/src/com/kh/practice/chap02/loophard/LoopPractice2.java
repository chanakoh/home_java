package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			boolean isTrue = false;	
			while(!isTrue) {
			System.out.println("���� : ");
			int num = sc.nextInt();
				
			if(num%2==1 && num>2) {
				System.out.println("�Ҽ� �Դϴ�.");
				isTrue = true;
			}else if(num<2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}
	}
}
}
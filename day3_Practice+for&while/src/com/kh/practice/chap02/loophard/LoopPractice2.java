package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			boolean isTrue = false;	
			
			while(!isTrue) {
			System.out.println("����: ");
			int num = sc.nextInt();
			int ab = num%2;
			if(num < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else if(ab == 1) {
				System.out.println("�Ҽ��Դϴ�.");
			}else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			
			} //isTrue = true;
}
}
}
/*Scanner sc = new Scanner(System.in);

boolean isTrue = false;
while(!isTrue) {
	System.out.println("���ڸ� �Է����ּ���: ");
	int num = sc.nextInt();
if(num < 1) { 
	System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
	System.out.println("-------------------- ");
} else { 
	for (int i = num; i> 0; i--) {
		System.out.println(i);
		
	}	isTrue = true;
}*/
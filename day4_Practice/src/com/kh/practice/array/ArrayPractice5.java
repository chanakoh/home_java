package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String[] chicken = {"���", "�Ķ��̵�"};
		System.out.println("�˻��ϰ��� �ϴ� ġŲ�� �Է��ϼ���. : ");
		String best = sc.nextLine();

		for(int i = 0; i<chicken.length; i++) {
			if(chicken[i].equals(best)) {//==������� ���� ���� �߻�, String������ equals���
				System.out.println(chicken[i]+"��� ����");
				return;
			}
		}		System.out.println(best+"�� ���� �޴��Դϴ�.");
		
		
	}
	}

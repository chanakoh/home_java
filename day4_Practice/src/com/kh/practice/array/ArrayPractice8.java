package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���. : ");
		int num = sc.nextInt();
		int sum = 0;
		String[] add = new String[num];
		
		int addl = add.length;
		
		while(true) {
		for(int i=0; i<addl; i++){
			System.out.println((i+1) + "��° ���ڿ� : ");
			add[i] = sc.next();}
				
				System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N)");
				char yorn = sc.next().charAt(0);
				if(yorn =='Y') {
					System.out.println("�� �Է��ϰ� ���� ���� : ");
					int num2 = sc.nextInt();
					int second = add.length+num2;
					String[] newadd = new String[second];
						for(int j=(num-1); j<second; j++) {
						System.out.println((j+2) + "��° ���ڿ� : ");
						add[j] = sc.next();
					}
				}else {
					System.out.println("�ڹ�");
		
		}break;// ���̻� ������ �ȵ�.. ��
		}
	}
	}

//}
/*����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
�ø� ���� � �����͸� ���� ������ ��������.
����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.*/

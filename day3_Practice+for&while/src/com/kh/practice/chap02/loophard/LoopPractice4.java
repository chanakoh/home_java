package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڿ��� �ϳ��� �Է��ϼ���.");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                count++;
            }
            else if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n2�� 3�� ������� ������ " + count + "���Դϴ�.");
	
		
		/*	int count = 0;
		for(int i = 0; i<n; i++) {
			boolean isTrue = true;
			if(i%2==0);
				for(int j = 0; j<n; j++) {
					if(j%3==0);
					isTrue = false;
					break;
				}
		}	boolean isTrue;
		if(isTrue) {
				System.out.prinln(i+j+" ");
				count++;
		}
	}*/
}//for ���� �ߺ����� �Ἥ ��Ÿ���� ������, if���� �ߺ������� ������ �����ϰ� ���٤�
}
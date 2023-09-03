package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("������ �Է��ϼ���: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            return;
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n�Ҽ��� ������ " + count + "���Դϴ�.");
    }
}
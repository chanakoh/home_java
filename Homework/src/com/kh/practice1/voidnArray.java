package com.kh.practice1;

import java.util.Scanner;

public class voidnArray {
	public void practice1() {
		//�� ���� �� ���
		 Scanner scanner = new Scanner(System.in);
	       	System.out.println("ù��° ���� �Է��ϼ���.");
	        int num1 = scanner.nextInt();
	    	System.out.println("�ι�° ���� �Է��ϼ���.");
	        int num2 = scanner.nextInt();
	        
	        int sum = num1 + num2;
	        System.out.println("�μ� �� ����"+sum+"�Դϴ�.");
	    }

	public void practice2() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("������ �Է��ϼ���.");
        int n = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(i);
        }
}

	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("���ڸ� �Է��ϼ���."); 
	     String input = scanner.nextLine();
	     
	     String reversed = new StringBuilder(input).reverse().toString();
	       System.out.println(reversed);
	}

	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���.");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }System.out.println(sum);
        
        
	}










}

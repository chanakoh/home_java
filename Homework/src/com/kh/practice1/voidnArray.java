package com.kh.practice1;

import java.util.Scanner;

public class voidnArray {
	public void practice1() {
		//두 수의 합 계산
		 Scanner scanner = new Scanner(System.in);
	       	System.out.println("첫번째 수를 입력하세요.");
	        int num1 = scanner.nextInt();
	    	System.out.println("두번째 수를 입력하세요.");
	        int num2 = scanner.nextInt();
	        
	        int sum = num1 + num2;
	        System.out.println("두수 의 합은"+sum+"입니다.");
	    }

	public void practice2() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int n = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(i);
        }
}

	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("글자를 입력하세요."); 
	     String input = scanner.nextLine();
	     
	     String reversed = new StringBuilder(input).reverse().toString();
	       System.out.println(reversed);
	}

	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사이즈를 입력하세요.");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }System.out.println(sum);
        
        
	}










}

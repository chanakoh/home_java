package com.kh.example.practice8.model;

import java.util.Scanner;

public class ArrayListExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
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
/*3-3) 사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력*/
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	public static void main(String[] args) {
   Scanner sc = new Scanner(System. in);
	 
	 int inum1, inum2;
	 System.out.println("정수를 입력하세요. :" );
	 inum1 = sc.nextInt();
	 System.out.println("또다른 정수를 입력하세요. :");
	 inum2 = sc.nextInt();
	 
	 System.out.print("더하기 결과 : " );
	 System.out.println(inum1 + inum2);
	 System.out.print("빼기 결과 : " );
	 System.out.println(inum1 - inum2);
	 System.out.print("곱하기 결과 : " );
	 System.out.println(inum1 * inum2);
	 System.out.print("나누기 결과 : " );
	 System.out.println(inum1 / inum2);
	 
	}

}

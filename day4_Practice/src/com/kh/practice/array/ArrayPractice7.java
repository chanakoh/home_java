package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 :");
		String chars = sc.next(); 
		
		char[] add = chars.toCharArray();
		int addLength = add.length;
		System.out.print("문자열에 있는 문자 :");
		for(int i = 0; i<addLength; i++) {
			
			System.out.print( add[i]);
		}
		System.out.println(" ");
		System.out.print("문자 개수 : "+addLength);
	
	}

}
/*문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
문자의 개수와 함께 출력하세요.
ex.
문자열 : application
문자열에 있는 문자 : a, p, l, i, c, t, o, n
문자 개수 : 8*/
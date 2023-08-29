package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name;
    System.out.println("문자열을 입력하세요 : ");
    name = sc.nextLine();
    
    char first = name.charAt(0);
    char second = name.charAt(1);
    char third = name.charAt(2);
    
    System.out.println("첫 번째 문자 : " + first);
	System.out.println("두 번째 문자 : " + second);
	System.out.println("세 번째 문자 : " + third);
    //궁금해서 검색해봤습니다..
	
	}

}

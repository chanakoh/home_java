package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
    //키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
    Scanner ec = new Scanner(System.in);
    
    char text;
    
    System.out.println("문자 하나를 입력 하시오 : ");
    text = ec.next().charAt(0);
    
    int text2 = text;
    System.out.println("문자 : "+text);
    System.out.println("A unicode : "+text2);

		
	}

}

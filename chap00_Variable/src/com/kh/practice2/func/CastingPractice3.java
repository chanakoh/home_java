package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice3 {
//선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.

	public static void main(String[] args) {
   
	int iNum1 = 10;  
    int iNum2 = 4;
    
    
    double iNumd = (double)iNum1;
    double iNumd2 = (double)iNum2;
    float iNumf = (float)iNum1;
    char iNumc = (char)iNum1;
    
    
    float fNum = 3.0f;
    int fNumi = (int)fNum;
    double fNumd = fNum;
    
    double dNum = 2.5;
    int dNum2 = (int)dNum;
    
    char ch = 'A';
    int chi = ch;
    char ch3 = (char) (ch+iNumc);
    
    

    System.out.println(iNum1 % iNum2); //2
    System.out.println(dNum2); //2
    
    System.out.println(iNum2 * dNum); //10.0
    System.out.println(iNumd); //10.0
   
    System.out.println(iNum1 / iNumd2 ); //2.5
    System.out.println( dNum ); //2.5
    
    System.out.println(fNumi ); //3
    System.out.println( iNum1/fNumi ); //3
    
    System.out.println( iNumf/fNum); // 3.3333333
    System.out.println( iNumd/fNumd ); // 3.333333333333335
    
    System.out.println( ch ); //'A'
    System.out.println(chi  ); // 65
    System.out.println(chi + iNum1); //75
    System.out.println(ch3); //'K'

	}

}

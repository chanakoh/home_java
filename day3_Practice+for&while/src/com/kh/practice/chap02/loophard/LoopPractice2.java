package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			boolean isTrue = false;	
			
			while(!isTrue) {
			System.out.println("숫자: ");
			int num = sc.nextInt();
			int ab = num%2;
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
			}else if(ab == 1) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			
			} //isTrue = true;
}
}
}
/*Scanner sc = new Scanner(System.in);

boolean isTrue = false;
while(!isTrue) {
	System.out.println("숫자를 입력해주세요: ");
	int num = sc.nextInt();
if(num < 1) { 
	System.out.println("1 이상의 숫자를 입력해주세요. ");
	System.out.println("-------------------- ");
} else { 
	for (int i = num; i> 0; i--) {
		System.out.println(i);
		
	}	isTrue = true;
}*/
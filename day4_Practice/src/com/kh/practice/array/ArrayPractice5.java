package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String[] chicken = {"양념", "후라이드"};
		System.out.println("검색하고자 하는 치킨을 입력하세요. : ");
		String best = sc.nextLine();

		for(int i = 0; i<chicken.length; i++) {
			if(chicken[i].equals(best)) {//==사용으로 인한 오류 발생, String에서는 equals사용
				System.out.println(chicken[i]+"배달 가능");
				return;
			}
		}		System.out.println(best+"는 없는 메뉴입니다.");
		
		
	}
	}

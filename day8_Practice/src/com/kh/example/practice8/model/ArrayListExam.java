package com.kh.example.practice8.model;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남");
		rainbow.add("보라");
		System.out.println("무지개 색상 :"+rainbow);
		rainbow.set(1,"블랙");
		rainbow.set(3,"브라운");
		rainbow.set(5,"그린");
		System.out.println("변경 무지개 색상 : "+rainbow);
		rainbow.clear();
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("옐로우");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");//
		rainbow.add("연한파랑");
		rainbow.add("남");
		rainbow.add("보라");//
		System.out.println("추가 무지개 생상 : "+rainbow);
		for(String rainbow1 : rainbow ) {
			System.out.println(rainbow1);
		}
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
		System.out.println(rainbow);
	}

}
/*3-1)ArrayList 이용해서 빨주노초파남보
수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
향상된 for문 이용해서 색상 출력하기
최 후 출력 빨 파 보*/

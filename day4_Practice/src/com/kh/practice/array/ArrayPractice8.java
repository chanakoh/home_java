package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요. : ");
		int num = sc.nextInt();
		int sum = 0;
		String[] add = new String[num];
		
		int addl = add.length;
		
		while(true) {
		for(int i=0; i<addl; i++){
			System.out.println((i+1) + "번째 문자열 : ");
			add[i] = sc.next();}
				
				System.out.println("더 값을 입력하시겠습니까?(Y/N)");
				char yorn = sc.next().charAt(0);
				if(yorn =='Y') {
					System.out.println("더 입력하고 싶은 개수 : ");
					int num2 = sc.nextInt();
					int second = add.length+num2;
					String[] newadd = new String[second];
						for(int j=(num-1); j<second; j++) {
						System.out.println((j+2) + "번째 문자열 : ");
						add[j] = sc.next();
					}
				}else {
					System.out.println("자바");
		
		}break;// 더이상 진행이 안됨.. ㅠ
		}
	}
	}

//}
/*사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.*/

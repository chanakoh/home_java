package com.kh.practice.chap02.loophard;

import java.util.Scanner;

public class LoopPractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 하나를 입력하세요.");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                count++;
            }
            else if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n2와 3의 공배수의 개수는 " + count + "개입니다.");
	
		
		/*	int count = 0;
		for(int i = 0; i<n; i++) {
			boolean isTrue = true;
			if(i%2==0);
				for(int j = 0; j<n; j++) {
					if(j%3==0);
					isTrue = false;
					break;
				}
		}	boolean isTrue;
		if(isTrue) {
				System.out.prinln(i+j+" ");
				count++;
		}
	}*/
}//for 문을 중복으로 써서 나타내려 했으나, if문에 중복적용을 했으면 간단하게 출력됬다ㅓ
}
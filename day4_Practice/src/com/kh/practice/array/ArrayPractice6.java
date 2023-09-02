package com.kh.practice.array;

public class ArrayPractice6 {

	public static void main(String[] args) {
		
		
		char[]num = {'1','2','3','4','5','6','-','1','2','3','4','5','6','7',};
		num[8] = '*'; 
		num[9] = '*';
		num[10] = '*';
		num[11] = '*';
		num[12] = '*';
		num[13] = '*';
		
		for(int i=0; i<num.length; i++) {
		System.out.print(num[i]);
	}
	}
}

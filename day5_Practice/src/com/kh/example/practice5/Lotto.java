package com.kh.example.practice5;

import java.util.Random;

public class Lotto {
	
	int[] lotto = new int[6];
	
	public Lotto() {
	}
	public void information() {
	Random tto = new Random();
	System.out.println("lotto number :");
	for(int i=0; i<6; i++) {
		lotto[i] = tto.nextInt(45)+1;
		System.out.printf("%d",lotto[i]);
	}
	}
	}
/*
int[] lotto = new int[6];

public lotto() {
*/
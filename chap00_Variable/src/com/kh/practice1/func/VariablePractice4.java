package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
//���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name;
    System.out.println("���ڿ��� �Է��ϼ��� : ");
    name = sc.nextLine();
    
    char first = name.charAt(0);
    char second = name.charAt(1);
    char third = name.charAt(2);
    
    System.out.println("ù ��° ���� : " + first);
	System.out.println("�� ��° ���� : " + second);
	System.out.println("�� ��° ���� : " + third);
    //�ñ��ؼ� �˻��غý��ϴ�..
	
	}

}

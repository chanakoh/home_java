package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
//Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
    double width,height;
    System.out.print("������ ���̴� ? ");
	width = sc.nextDouble();
    System.out.print("������ ���̴� ? ");
    height = sc.nextDouble();
    System.out.println("���� : " + width);
    System.out.println("���� : " + height);
    System.out.println("���� : " + width * height);
    System.out.println("�ѷ� : " + (width + height)*2);
	}

}
package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
    //�Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.�� �� ������ ����� ���������� ó���ϼ���.
    Scanner sc = new Scanner(System.in);
	
    double kor,eng,math;
    int sum,avg;
    
    System.out.println("���� ������ �Է��Ͻÿ� : ");
    kor = sc.nextDouble();
    System.out.println("���� ������ �Է� �Ͻÿ� : ");
    eng = sc.nextDouble();
    System.out.println("���� ������ �Է� �Ͻÿ� : ");
    math = sc.nextDouble();
    
    sum = (int) (kor+eng+math);
    avg = (int) (kor+eng+math)/3;
    
    System.out.println("���� : " + kor);
    System.out.println("���� : " + eng);
    System.out.println("���� : " + math);
    System.out.println("���� : " + sum);
    System.out.println("��� : " + avg);
    
	}

}

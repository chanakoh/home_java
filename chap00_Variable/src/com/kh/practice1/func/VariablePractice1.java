package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
//�̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name,sex;
    int age;
    double height;
    
    System.out.print("�̸��� �Է��ϼ��� : ");
    name = sc.next();
    System.out.print("������ �Է��ϼ���(��/��) : ");
    sex = sc.next();
    System.out.print("���̸� �Է��ϼ��� : ");
    age = sc.nextInt();
    System.out.print("Ű�� �Է��ϼ���(cm) : ");
    height = sc.nextDouble();
    
    System.out.println("Ű "+height+"cm�� "+age+"�� "+sex+" "+name+"�� �ݰ����ϴ�^^");
    
    
    
    
	}

}
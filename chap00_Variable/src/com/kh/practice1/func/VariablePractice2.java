package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	//Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
	public static void main(String[] args) {
   Scanner sc = new Scanner(System. in);
	 
	 int inum1, inum2;
	 System.out.println("������ �Է��ϼ���. :" );
	 inum1 = sc.nextInt();
	 System.out.println("�Ǵٸ� ������ �Է��ϼ���. :");
	 inum2 = sc.nextInt();
	 
	 System.out.print("���ϱ� ��� : " );
	 System.out.println(inum1 + inum2);
	 System.out.print("���� ��� : " );
	 System.out.println(inum1 - inum2);
	 System.out.print("���ϱ� ��� : " );
	 System.out.println(inum1 * inum2);
	 System.out.print("������ ��� : " );
	 System.out.println(inum1 / inum2);
	 
	}

}

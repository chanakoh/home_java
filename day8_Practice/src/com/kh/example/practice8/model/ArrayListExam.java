package com.kh.example.practice8.model;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");
		rainbow.add("��");
		rainbow.add("����");
		System.out.println("������ ���� :"+rainbow);
		rainbow.set(1,"��");
		rainbow.set(3,"����");
		rainbow.set(5,"�׸�");
		System.out.println("���� ������ ���� : "+rainbow);
		rainbow.clear();
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���ο�");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");//
		rainbow.add("�����Ķ�");
		rainbow.add("��");
		rainbow.add("����");//
		System.out.println("�߰� ������ ���� : "+rainbow);
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
/*3-1)ArrayList �̿��ؼ� ���ֳ����ĳ���
���� 3ȸ 1,3,5 ->��, ����, �׸� ����
���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
���� for�� �̿��ؼ� ���� ����ϱ�
�� �� ��� �� �� ��*/

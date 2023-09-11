package com.kh.homework;
import com.kh.homework.Student;
import com.kh.homework.StudentController;


public class StudentMenu {
		private StudentController ssm = new StudentController();
		
		public StudentMenu() {
			System.out.println("========== �л� ���� ��� ========== ");
			Student[] stdArr = ssm.printStudent();
			
			for(int i = 0; i < stdArr.length; i++) {
				System.out.println(stdArr[i].inform());
			}
			
			System.out.println("========== �л� ���� ��� ========== ");
			double[] dArr = ssm.avgScore();
			System.out.println("�л� ���� �հ� : " + (int)dArr[0]);
			System.out.println("�л� ���� ��� : " + dArr[1]);

			System.out.println("========== ���� ��� ��� ========== ");
			for(int i = 0; i < stdArr.length; i++) {
				if(stdArr[i].getScore() < StudentController.CUT_LINE) {
					System.out.println(stdArr[i].getName() + "�л��� ����� ����Դϴ�.");
				} else {
					System.out.println(stdArr[i].getName() + "�л��� ����Դϴ�.");
				}
			}
		}
	}


	
			

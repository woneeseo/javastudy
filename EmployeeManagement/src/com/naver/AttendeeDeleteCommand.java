package com.naver;

import java.util.Scanner;

public class AttendeeDeleteCommand implements Command {
	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("����� ������ �ʱ�ȭ�մϴ�.");
		System.out.println("�ʱ�ȭ �Ŀ��� ��� ��������� ������� ���α׷��� ����˴ϴ�.");
		System.out.println("������ �ʱ�ȭ �Ͻðڽ��ϱ�?");
		
		System.out.println("1: �ʱ�ȭ �ϱ�, 2: �޴��� ���ư���");
		
		int key = sc.nextInt();
		
		
		switch (key) {
		case 1:
			AttendeeDAO dao = new AttendeeDAO();
			dao.deleteAttendee();
			System.out.println("����� ������ �ʱ�ȭ �Ǿ����ϴ�..");
			sc.close();
			System.out.println("�ý����� ����˴ϴ�.");
			System.exit(0);
			
			break;
	
		case 2:
			
			System.out.println("�޴��� ���ư��ϴ�.");
			break;
		
		default:
			if(key>2) {
				key = 2;
			}
			break;
		}

	}

	@Override
	public String toString() {
		return "����� ���� �ʱ�ȭ";
	}
	
	

}

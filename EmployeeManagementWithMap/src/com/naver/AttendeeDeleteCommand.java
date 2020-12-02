package com.naver;

import java.util.Scanner;

public class AttendeeDeleteCommand implements Command {
	
	@Override
	public void execute(Scanner sc) {
		
		// DB�� ����� ����� ������ �ʱ�ȭ �ϴ� class
		// sql = "TRUNCATE TABLE attendee" �� �̿���
		// ���̺��� �÷��� ���������� ���ڵ常 �ѹ��� ������ �� �ֵ��� �Ͽ���,
		// �ʱ�ȭ�� �����ϸ� �ʱ�ȭ�� �Բ� �ý����� �����Ű�� �޼��带 ������
		
		
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
			} else {
				key = 1;
			}
			break;
		}

	}

	@Override
	public String toString() {
		return "����� ���� �ʱ�ȭ";
	}
	
	

}

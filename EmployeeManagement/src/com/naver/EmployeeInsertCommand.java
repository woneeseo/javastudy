package com.naver;

import java.util.Scanner;

public class EmployeeInsertCommand implements Command{
	
	// ��� ����ϴ� Ŭ�����Դϴ�.
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("��� ����� �����մϴ�.");
		String id;
		while (true) {
			System.out.println("��� ID�� �Է��ϼ���.");
			id = sc.nextLine();
			if(id.length() > 8) {
				System.out.println("��� ID�� ������ ���ڸ� ������ 8�� �̳��� �Է����ּ���.");
			} else {
				break;
			}
		}
		
		System.out.println("��� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���.");
		String position = sc.nextLine();
		
		EmployeeDTO dto = new EmployeeDTO(id, name, position);
		EmployeeDAO dao = new EmployeeDAO();
		
		dao.insertEmployee(dto);
		
		System.out.println("��� ����� �Ϸ�Ǿ����ϴ�.");
		
	}

	@Override
	public String toString() {
		return "��� ���";
	}
	
	
	

}

package com.naver;

import java.util.Scanner;

public class EmployeeUpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("���ID�� �Է��Ͻÿ�.");
		String id = sc.nextLine();
		System.out.println("������ �̸��� �Է��Ͻÿ�.");
		String name = sc.nextLine();
		System.out.println("������ ������ �Է��Ͻÿ�.");
		String position = sc.nextLine();
		
		
		EmployeeDTO dto = new EmployeeDTO(id, name, position);
		EmployeeDAO dao = new EmployeeDAO();	
		dao.update(dto);
		
		
	}

	@Override
	public String toString() {
		return "������� ����";
	}

}
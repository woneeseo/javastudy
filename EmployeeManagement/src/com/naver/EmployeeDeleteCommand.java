package com.naver;

import java.util.Scanner;

public class EmployeeDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ �����ȣ�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		EmployeeDTO dto = new EmployeeDTO(id, null, null);
		EmployeeDAO dao = new EmployeeDAO();
		dao.delete(dto);
		
		System.out.println("��� ������ �����Ǿ����ϴ�.");
	}
	
	@Override
	public String toString() {
		return "��� ����";
	}

	
}
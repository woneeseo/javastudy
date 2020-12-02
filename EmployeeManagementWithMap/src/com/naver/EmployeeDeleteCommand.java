package com.naver;

import java.util.Scanner;

public class EmployeeDeleteCommand implements Command {
	
	// ����� ��� ������ �����ϴ� class
	// �����ȣ�� ��ȸ�Ͽ�, �����ȣ�� ������ ��ϵ��� �ʾҴٴ� ��Ʈ�� ���� �޴��� ���ư�

	@Override
	public void execute(Scanner sc) {
		EmployeeDAO dao = new EmployeeDAO();
		
		System.out.println("������ �����ȣ�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		EmployeeDTO dto = dao.selectById(id);
		
		if (dto != null) {
			
			dto = new EmployeeDTO(id, null, null);
			dao = new EmployeeDAO();
			dao.delete(dto);
			System.out.println("��� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("��ϵ��� ���� ID�Դϴ�.");
			System.out.println("�ٽ� �õ����ּ���.");
		}
	}
	
	@Override
	public String toString() {
		return "��� ����";
	}

	
}
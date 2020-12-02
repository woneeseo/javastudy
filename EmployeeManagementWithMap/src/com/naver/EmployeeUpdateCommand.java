package com.naver;

import java.util.Scanner;

public class EmployeeUpdateCommand implements Command{
	
	// ��� ������ ������ �� �ִ� class
	// ��� id�� �Է��ϸ� �̸��� ������ �����Ͽ� ������ �� �ֵ��� ��
	// ������ a~e���� �Է��� �����ϰ�
	// �Էµ� ���ĺ� ���� �������� ������ ��µǵ��� ������

	@Override
	public void execute(Scanner sc) {
		
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = null;
		
		System.out.println("���ID�� �Է��Ͻÿ�.");
		String id = sc.nextLine();
		EmployeeDTO oDto = dao.selectById(id);
		
		
		System.out.println("���� �� �޴��� �����ϼ���.");
		System.out.println("1: �̸�, 2: ����");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
			System.out.println("���� �� �̸��� �Է��ϼ���.");
			String nName = sc.nextLine();
			dto = new EmployeeDTO(id, nName,oDto.getPosition());
			dao.update(oDto);
			System.out.println("�̸��� "+nName+"���� �����Ǿ����ϴ�.");
			break;
			
		case 2:
			System.out.println("���� �� ������ �Է��ϼ���.");
			String nPosition = sc.nextLine();
			dto = new EmployeeDTO(id, oDto.getName(), nPosition);
			dao.update(oDto);
			
			if(nPosition.contains("a")) {
				dto.setPosition("����");
			} else if(nPosition.contains("b")) {
				dto.setPosition("����");
			} else if(nPosition.contains("c")) {
				dto.setPosition("����");
			} else if(nPosition.contains("d")) {
				dto.setPosition("�븮");
			} else if(nPosition.contains("e")) {
				dto.setPosition("���");
			} else {
				System.out.println("����");
			}
			
			System.out.println("������ "+dto.getPosition()+"���� ����Ǿ����ϴ�.");
			break;
			
		default:
			System.out.println("�޴��� �ٽ� �����ϼ���.");
			break;
		}
		

	}

	@Override
	public String toString() {
		return "������� ����";
	}

}
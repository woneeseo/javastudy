package com.naver;

import java.util.List;
import java.util.Scanner;

public class EmployeeSelectCommand implements Command{
	
	// ��ü ����� ��ȸ�� �� �ִ� class
	// �޴����� ������ ��ȸ�� ���ΰ�, ��ü ����� ��ȸ�� ������ ������ �� �ְ�
	// ���� ��ȸ�� �����ϸ� id/�̸����� ���� ��ȸ�� �� �ֵ��� ������
	

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1: ���� ��ȸ, 2: ��ü ��ȸ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		EmployeeDAO dao = new EmployeeDAO();
		List<EmployeeDTO> list = dao.select();
		
		if(menu == 2) {
			
			for (int i = 0; i < list.size() ; i++) {
				EmployeeDTO dto = list.get(i);
				
				String position = dto.getPosition();
				
				if(position.contains("a")) {
					dto.setPosition("����");
				} else if(position.contains("b")) {
					dto.setPosition("����");
				} else if(position.contains("c")) {
					dto.setPosition("����");
				} else if(position.contains("d")) {
					dto.setPosition("�븮");
				} else if(position.contains("e")) {
					dto.setPosition("���");
				} else {
					System.out.println("����");
				}
				
				System.out.println(dto);
			}
		} else if (menu == 1) {
			
			System.out.println("1: ���ID�� ��ȸ, 2: �̸����� ��ȸ");
			int menu2 = sc.nextInt();
			sc.nextLine();
			
			switch (menu2) {
			
			case 1:
				
				EmployeeDTO dto;
				String position;
				
				try {
					System.out.println("�˻��� ID�� �Է��ϼ���.");
					String id = sc.nextLine();
					
					dto = dao.selectById(id);
					position = dto.getPosition();
					
					if(position.contains("a")) {
						dto.setPosition("����");
					} else if(position.contains("b")) {
						dto.setPosition("����");
					} else if(position.contains("c")) {
						dto.setPosition("����");
					} else if(position.contains("d")) {
						dto.setPosition("�븮");
					} else if(position.contains("e")) {
						dto.setPosition("���");
					} else {
						System.out.println("����");
					}
					
					System.out.println(dto);
					
				} catch (Exception e) {
					System.out.println("��ϵ��� ���� ��� ID�Դϴ�.");
				}
				
				break;
				
			case 2:
				
				System.out.println("�˻��� ��� �̸��� �Է��ϼ���.");
				String name = sc.nextLine();
				
				List<EmployeeDTO> nameList = dao.selectByName(name);
				
				for (int i = 0; i < nameList.size(); i++) {
					
					dto = nameList.get(i);
					position = dto.getPosition();
					
					if (position.contains("a")) {
						dto.setPosition("����");
					} else if (position.contains("b")) {
						dto.setPosition("����");
					} else if (position.contains("c")) {
						dto.setPosition("����");
					} else if (position.contains("d")) {
						dto.setPosition("�븮");
					} else if (position.contains("e")) {
						dto.setPosition("���");
					} else {
						System.out.println("����");
					}
					
					System.out.println(dto);
					
				} 

				break;
				
			default:
				if(menu2>2) {
					menu2 = 2;
				} else if(menu2<1) {
					menu2 = 1;
				}
				
				break;
			}
			
			
			
		} else {
			if(menu>2) {
				menu = 2;
			} else if(menu<1) {
				menu = 1;
			}
		}
	
		}

	@Override
	public String toString() {
		return "��� ��ȸ";
	}
		
	
}

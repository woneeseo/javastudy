package com.naver;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInsertCommand implements Command{
	
	// ��� ����ϴ� Ŭ�����Դϴ�.
	// ��� id�� ������ ���ڷθ� �Է¹��� �� �ְ� ������
	// 8�ڸ��� �ʰ��� ��� ����� ���� �ʰ�
	// �Է�â�� �ݺ��ǵ��� ó����.
	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("��� ����� �����մϴ�.");
		String id;
		while (true) {
			System.out.println("��� ID�� �Է��ϼ���.");
			id = sc.nextLine();
			
			// ��� ID�� ������ ���ڷθ� �Է¹��� �� �ְ� �߾��
			String p = "^[a-zA-Z0-9]*$";
			boolean i = Pattern.matches(p, id);
			
			if(id.length() > 8) {
				System.out.println("��� ID�� 8�� �̳��� �Է����ּ���.");
			} else if(id.length()<9 && i == false){
				// ���ǽ��� true (i = �Է¹��� id�� ������ ���ڷθ� �̷���� ������ true)�� �ƴϸ�
				// syso(������̵� ��¼��)�� ��µ˴ϴ�.
				
				System.out.println("��� ID�� ������ ���ڷθ� �Է����ּ���.");
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
		
	}

	@Override
	public String toString() {
		return "��� ���";
	}
	
	
	

}

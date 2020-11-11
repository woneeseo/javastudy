package com.naver;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("ID�� �Է��ϼ���");
		String id = sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		sc.nextLine();
		
		
		MemberDTO dto = new MemberDTO(id, name, age);
		
		DB.db.add(dto);
		
	}
	
	
	
}

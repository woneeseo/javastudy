package com.naver;

import java.util.Scanner;

public class Deletecommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		
		if(b) {
			System.out.println("���� ����");
			
		}else {
			System.out.println("���� ����");
		}
	}

	@Override
	public String toString() {
		return "ȸ������";
	}
	
	

}

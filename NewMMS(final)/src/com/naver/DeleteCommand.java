package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ ID�� �Է��ϼ���.");
		String mid = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(mid);
		
		System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.");

	}

	@Override
	public String toString() {
		return "����";
	}
	
	

}

package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ ID�� �Է��ϼ���.");
		String mid = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(mid);

	}

	@Override
	public String toString() {
		return "����";
	}
	
	

}

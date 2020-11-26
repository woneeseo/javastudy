package com.naver;

import java.sql.Date;
import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("����� ID�� �Է��ϼ���.");
		String mid = sc.nextLine();
		
		System.out.println("����� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		System.out.println("����� ������ �Է��ϼ���.");
		String job = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���.(���� - 19900101)");
		String date = sc.nextLine();
		Date birth = dao.stringTransformDate(date);
		
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		dao.insert(dto);
		
		System.out.println(mid+"��, ȸ���� �ǽ� ���� �����մϴ�.");
	}

	@Override
	public String toString() {
		return "���";
	}
	
	

}

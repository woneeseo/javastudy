package com.naver;

import java.sql.Date;
import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		
		
		System.out.println("������ ID�� �Է��ϼ���.");
		String mid = sc.nextLine();
		MemberDTO odto = dao.selectByMid(mid);
		
		System.out.println("���� �� �޴��� �����ϼ���.");
		System.out.println("1 : �̸� ����, 2 : ���� ����, 3 : ���� ����");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
			
			System.out.println("������ �̸��� �Է��ϼ���.");
			String nName = sc.nextLine();
			dto = new MemberDTO(mid, nName, odto.getJob(), odto.getBirth());
			dao.update(dto);
			System.out.println("�̸��� "+nName+"���� �����Ǿ����ϴ�.");
			break;
			
		case 2:
			System.out.println("������ ������ �Է��ϼ���.");
			String nJob = sc.nextLine();
			dto = new MemberDTO(mid, odto.getName(), nJob, odto.getBirth());
			dao.update(dto);
			System.out.println("������ "+nJob+"���� �����Ǿ����ϴ�.");
			break;

		case 3:
			System.out.println("������ ��������� �Է��ϼ���.");
			String date = sc.nextLine();
			Date birth = dao.stringTransformDate(date);
			dto = new MemberDTO(mid, odto.getName(), odto.getJob(), birth);
			dao.update(dto);
			System.out.println("������ "+birth+"�� �����Ǿ����ϴ�.");
			break;
			
		
		default:
			break;
		}
		
		
	}

	@Override
	public String toString() {
		return "����";
	}
	
	

}

package com.naver;

import java.sql.Date;
import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("등록할 ID를 입력하세요.");
		String mid = sc.nextLine();
		
		System.out.println("등록할 이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("등록할 직업을 입력하세요.");
		String job = sc.nextLine();
		
		System.out.println("생일을 입력하세요.");
		String date = sc.nextLine();
		Date birth = dao.stringTransformDate(date);
		
		
		MemberDTO dto = new MemberDTO(mid, name, job, birth);
		dao.insert(dto);
	}

	@Override
	public String toString() {
		return "등록";
	}
	
	

}

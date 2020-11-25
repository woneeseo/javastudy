package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("삭제할 ID를 입력하세요.");
		String mid = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(mid);

	}

	@Override
	public String toString() {
		return "삭제";
	}
	
	

}

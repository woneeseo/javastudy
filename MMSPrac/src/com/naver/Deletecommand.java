package com.naver;

import java.util.Scanner;

public class Deletecommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("삭제할 ID를 입력하세요.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		
		if(b) {
			System.out.println("삭제 성공");
			
		}else {
			System.out.println("삭제 실패");
		}
	}

	@Override
	public String toString() {
		return "회원삭제";
	}
	
	

}

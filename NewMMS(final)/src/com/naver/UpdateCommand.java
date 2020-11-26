package com.naver;

import java.sql.Date;
import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		
		
		System.out.println("수정할 ID를 입력하세요.");
		String mid = sc.nextLine();
		MemberDTO odto = dao.selectByMid(mid);
		
		System.out.println("수정 할 메뉴를 선택하세요.");
		System.out.println("1 : 이름 수정, 2 : 직업 수정, 3 : 생일 수정");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
			
			System.out.println("수정할 이름을 입력하세요.");
			String nName = sc.nextLine();
			dto = new MemberDTO(mid, nName, odto.getJob(), odto.getBirth());
			dao.update(dto);
			System.out.println("이름이 "+nName+"으로 수정되었습니다.");
			break;
			
		case 2:
			System.out.println("수정할 직업을 입력하세요.");
			String nJob = sc.nextLine();
			dto = new MemberDTO(mid, odto.getName(), nJob, odto.getBirth());
			dao.update(dto);
			System.out.println("직업이 "+nJob+"으로 수정되었습니다.");
			break;

		case 3:
			System.out.println("수정할 생년월일을 입력하세요.");
			String date = sc.nextLine();
			Date birth = dao.stringTransformDate(date);
			dto = new MemberDTO(mid, odto.getName(), odto.getJob(), birth);
			dao.update(dto);
			System.out.println("생일이 "+birth+"로 수정되었습니다.");
			break;
			
		
		default:
			break;
		}
		
		
	}

	@Override
	public String toString() {
		return "수정";
	}
	
	

}

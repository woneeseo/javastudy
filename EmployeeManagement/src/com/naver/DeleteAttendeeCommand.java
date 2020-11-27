package com.naver;

import java.util.Scanner;

public class DeleteAttendeeCommand implements AttendeeCommand{

	@Override
	public void execute(Scanner sc) {
		
		sc.close();
		System.out.println("출퇴근 정보가 초기화됩니다.");
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "종료";
	}
	
	

	
}

package com.naver;

import java.util.Scanner;

public class DeleteAttendeeCommand implements AttendeeCommand{

	@Override
	public void execute(Scanner sc) {
		
		sc.close();
		System.out.println("����� ������ �ʱ�ȭ�˴ϴ�.");
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "����";
	}
	
	

	
}

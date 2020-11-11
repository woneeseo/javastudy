package com.naver;

import java.util.Scanner;

public class InsertCommand extends Menu implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		
	}
	
	

}

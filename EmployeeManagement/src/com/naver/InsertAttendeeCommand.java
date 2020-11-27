package com.naver;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class InsertAttendeeCommand implements AttendeeCommand{

	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("출근 시간을 등록합니다.");
		System.out.println("사원 ID를 입력하세요.");
		
		String id = sc.nextLine();
		
		AttendeeDTO dto = new AttendeeDTO(id, null, null, null);
		String name = dto.getName();
		
		
		System.out.println(name+"님 안녕하세요.");
		System.out.println("출근 시간을 등록합니다.");
		Calendar cal = Calendar.getInstance();
		long intime = cal.getTimeInMillis();
		
		DateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH=24h, hh=12h
		
		String str = df.format(intime);
		  
		Date date = new Date(intime);
		
		System.out.println("현재시간 : "+intime);
		
		AttendeeDAO dao = new AttendeeDAO();
		dto = new AttendeeDTO(id, name, date, null);
		dao.insertIntime(dto);
		
		System.out.println("출근시간이 등록되었습니다.");
		
		
	}

}

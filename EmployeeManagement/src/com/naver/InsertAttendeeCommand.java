package com.naver;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class InsertAttendeeCommand implements AttendeeCommand{

	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("��� �ð��� ����մϴ�.");
		System.out.println("��� ID�� �Է��ϼ���.");
		
		String id = sc.nextLine();
		
		AttendeeDTO dto = new AttendeeDTO(id, null, null, null);
		String name = dto.getName();
		
		
		System.out.println(name+"�� �ȳ��ϼ���.");
		System.out.println("��� �ð��� ����մϴ�.");
		Calendar cal = Calendar.getInstance();
		long intime = cal.getTimeInMillis();
		
		DateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH=24h, hh=12h
		
		String str = df.format(intime);
		  
		Date date = new Date(intime);
		
		System.out.println("����ð� : "+intime);
		
		AttendeeDAO dao = new AttendeeDAO();
		dto = new AttendeeDTO(id, name, date, null);
		dao.insertIntime(dto);
		
		System.out.println("��ٽð��� ��ϵǾ����ϴ�.");
		
		
	}

}

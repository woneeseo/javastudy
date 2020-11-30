package com.naver;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AttendeeInsertCommand implements Command{
	
	// employeeDTO�� �ִ� id�� �����ͼ�
	// �Է¹��� id�� employeeDTO�� �ִ� id�� ������ ��ٽð��� �Է��ϰ� ���� Ŭ�����Դϴ�


	
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("��� �ð��� ����մϴ�.");
		System.out.println("��� ID�� �Է��ϼ���.");
		
		String id = sc.nextLine();
		
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO odto = dao.selectById(id);
		AttendeeDAO aDao = new AttendeeDAO();
		AttendeeDTO aDto =aDao.selectById(id);
		
		
		
		
		try {
			if (id == odto.getId()) {
				
				System.out.println(odto.getName() + "�� �ȳ��ϼ���.");
				
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				java.util.Date date = new java.util.Date();
				String intime = df.format(date);
				aDto = new AttendeeDTO(id, odto.getName(), intime, null);
				
				aDao.insertIntime(aDto);
			
			}
			
		} catch (Exception e) {

			System.out.println("��ϵ��� ���� ��� ID�Դϴ�.");
			System.out.println("��� ����� ó������ �ٽ� �õ����ּ���.");
			
		} 

	}

	@Override
	public String toString() {
		return "��� ���";
	}
	
	

}

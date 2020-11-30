package com.naver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AttendeeExitCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("��� ID�� �Է��ϼ���.");
		String id = sc.nextLine();
		
		AttendeeDAO oDao = new AttendeeDAO();
		AttendeeDTO oDto = oDao.selectById(id);
		
		
		try {
			if (oDto.getIntime() != null) {
				
				if (oDto.getExittime() == null) {
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date time = new Date();
					String exittime = format.format(time);
					
					AttendeeDTO dto = new AttendeeDTO(id, oDto.getName(), oDto.getIntime(), exittime);
					oDao.exittime(dto);
					System.out.println("��ٽð��� ��ϵǾ����ϴ�.");
					System.out.println("�����ϼ̽��ϴ�.");
				
				} else {
				
					System.out.println("�̹� ����� ����Դϴ�.");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("��ϵ��� ���� ��� ID�Դϴ�.");
			System.out.println("��� ����� ó������ �ٽ� �������ּ���.");
		}
		
		
		
	}

	@Override
	public String toString() {
		return "��� ���";
	}

}
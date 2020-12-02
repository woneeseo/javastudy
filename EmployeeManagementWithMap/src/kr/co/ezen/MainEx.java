package kr.co.ezen;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.naver.Command;
import com.naver.EmployeeDeleteCommand;
import com.naver.AttendeeDeleteCommand;
import com.naver.AttendeeExitCommand;
import com.naver.AttendeeInsertCommand;
import com.naver.AttendeeSelectCommand;
import com.naver.EmployeeInsertCommand;
import com.naver.EmployeeSelectCommand;
import com.naver.EmployeeUpdateCommand;
import com.naver.ProgramCloseCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ���� ���α׷��� main�� map���� ������
		Map<Integer, Command> map = new HashMap<Integer, Command>();
		
		map.put(0, new AttendeeInsertCommand());
		map.put(1, new AttendeeExitCommand());
		map.put(2, new AttendeeSelectCommand());
		map.put(3, new AttendeeDeleteCommand());
		
		map.put(4, new EmployeeInsertCommand());
		map.put(5, new EmployeeUpdateCommand());
		map.put(6, new EmployeeSelectCommand());
		map.put(7, new EmployeeDeleteCommand());
		
		map.put(8, new ProgramCloseCommand());
		
		
		boolean isTrue = true;
		
		
		while (isTrue) {
			System.out.println();
			System.out.println("====����� ��� �ý���====");
			for(int i=0; i<map.size(); i++) {
				
				
				System.out.print(i+": ");
				System.out.println(map.get(i));
			}
			System.out.println("=====================");
			System.out.println();
			
			try {
			
				int menu = sc.nextInt();
				sc.nextLine();
				map.get(menu).execute(sc);
			
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("�ý����� �ٽ� �������ּ���.");
				break;
			} 
		}
		
		
	}

}

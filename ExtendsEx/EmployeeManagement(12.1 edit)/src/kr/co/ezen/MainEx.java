package kr.co.ezen;

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
		
		Command[] coms = {
				new AttendeeInsertCommand(),
				new AttendeeSelectCommand(),
				new AttendeeExitCommand(),
				new AttendeeDeleteCommand(),
				new EmployeeInsertCommand(),
				new EmployeeSelectCommand(),
				new EmployeeUpdateCommand(),
				new EmployeeDeleteCommand(),
				new ProgramCloseCommand()
				
		};
		
		boolean isTrue = true;
		while (isTrue) {
			System.out.println();
			System.out.println("====����� ��� �ý���====");
			for(int i=0; i<coms.length; i++) {
				System.out.print(i+": ");
				System.out.println(coms[i]);
			}
			System.out.println("=====================");
			System.out.println();
			
			try {
			
				int menu = sc.nextInt();
				sc.nextLine();
				coms[menu].execute(sc);
			
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("�ý����� �ٽ� �������ּ���.");
				break;
			}
		}
		
		sc.close();
		
		
		
	}

}

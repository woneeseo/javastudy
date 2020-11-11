package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.InsertCommand;
import com.naver.User;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Command[] coms = {
				new InsertCommand()
		};
		
		Command c;
		
		User user = new User();
		
		boolean isOK = true;
		int idx = -1;
		
		while(isOK) {
			System.out.println("메뉴를 선택하세요.");
			for(int i =0; i<coms.length; i++) {
				System.out.println(i);
				System.out.println(": "+coms[i]+", ");
			}
			idx = sc.nextInt();
			sc.nextLine();
			c = coms[idx];
			user.changeMenu(idx);
			
		}
		
		sc.close();

	}

}

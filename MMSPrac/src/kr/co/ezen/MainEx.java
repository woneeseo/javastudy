package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.Deletecommand;
import com.naver.Endcommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;


public class MainEx {
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		
	Command[] coms = {
			new InsertCommand(), new SelectCommand()
			, new UpdateCommand(), new Deletecommand()
			, new Endcommand()
			
	};
	
	Command c = coms[0];

	
	boolean isOK = true;
	int idx = -1;
	
	while (isOK) {
		
		System.out.println("메뉴를 선택하세요.");
		for(int i=0; i<coms.length; i++) {
			System.out.print(i);
			System.out.print(" : "+coms[i]+", ");
		}
		System.out.println();
		idx = sc.nextInt();
		sc.nextLine();
		coms[idx].execute(sc);
		
	}

	sc.close();
	
	
	}

}

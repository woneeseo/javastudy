package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
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
		
		
	List<Command> coms = new ArrayList<Command>();
	
	coms.add(new InsertCommand());
	coms.add(new SelectCommand());
	coms.add(new UpdateCommand());
	coms.add(new Deletecommand());
	coms.add(new Endcommand());

	
	boolean isOK = true;
	int idx = -1;
	
	try {
		while (isOK) {
			
			System.out.println("메뉴를 선택하세요.");
			
			for(int i=0; i<coms.size(); i++) {
				System.out.print(i);
				System.out.print(" : "+coms.get(i));
				if(i != coms.size()-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
			
			
			idx = sc.nextInt();
			sc.nextLine();
			
			coms.get(idx).execute(sc);
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		sc.close();
	}

	
	
	
	}

}

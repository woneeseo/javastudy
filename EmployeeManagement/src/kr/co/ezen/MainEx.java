package kr.co.ezen;

import java.util.Scanner;

import com.naver.InsertAttendeeCommand;

public class MainEx {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InsertAttendeeCommand intime = new InsertAttendeeCommand();
		
		intime.execute(sc);
		
		sc.close();
		
	}

}

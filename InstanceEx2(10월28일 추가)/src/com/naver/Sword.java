package com.naver;

public class Sword {

	public void attack(Sword sword, Monster mon) {
		
		System.out.println("������ "+mon+"�� �����մϴ�.");
		Shild shild = new Shild();
		System.out.println("������ �������ϴ�.");
		shild.shildFromMon(mon);
		
	}

}

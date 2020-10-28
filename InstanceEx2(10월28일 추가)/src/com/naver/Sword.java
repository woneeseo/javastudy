package com.naver;

public class Sword {

	public void attack(Sword sword, Monster mon) {
		
		System.out.println("검으로 "+mon+"를 공격합니다.");
		Shild shild = new Shild();
		System.out.println("공격이 끝났습니다.");
		shild.shildFromMon(mon);
		
	}

}

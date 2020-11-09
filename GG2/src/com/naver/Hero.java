package com.naver;

public class Hero {
	
	Weapon[] weapons;
	Weapon w;
	
	public Hero() {
		
		weapons = new Weapon[] {new Bow("Ȱ", 1), new Sword("��", 5), new Gun("��", 10)};
		w = weapons[0];
		
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public void changeWeapon(int weapIdx) {
		if(weapIdx>=weapons.length || weapIdx<0) {
			weapIdx = weapons.length-1;
			
		}w= weapons[weapIdx];
		System.out.println("���⸦ "+w+"���� ��ü�մϴ�. ");
	}
	

}

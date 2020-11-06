package com.naver;

public class Hero {
	
	Weapon[] weapons ;
	Weapon w;
	
	
	public Hero() {
		weapons = new Weapon[] {new Bow("Ȱ", 1), 
				new Sword("��",5), new Gun("��", 10), new Ax("����", 8)};
		
		w = weapons[2];
	}
	
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	public void attack(Monster mon) {
		System.out.println("���͸� �����մϴ�.");
		w.attack(mon);
	}
	
	public void changeWeapon(int weaponIdx) {
		if(weaponIdx>=weapons.length || weaponIdx<0) {
			weaponIdx = weapons.length-1;
		}
		w = weapons[weaponIdx];
		System.out.println("���Ⱑ "+w+ "(��)�� ����Ǿ����ϴ�.");
		
	}

}

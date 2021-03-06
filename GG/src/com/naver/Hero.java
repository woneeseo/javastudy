package com.naver;

public class Hero {
	
	Weapon[] weapons ;
	Weapon w;
	
	
	public Hero() {
		weapons = new Weapon[] {new Bow("활", 1), 
				new Sword("검",5), new Gun("총", 10), new Ax("도끼", 8)};
		
		w = weapons[2];
	}
	
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	public void attack(Monster mon) {
		System.out.println("몬스터를 공격합니다.");
		w.attack(mon);
	}
	
	public void changeWeapon(int weaponIdx) {
		if(weaponIdx>=weapons.length || weaponIdx<0) {
			weaponIdx = weapons.length-1;
		}
		w = weapons[weaponIdx];
		System.out.println("무기가 "+w+ "(으)로 변경되었습니다.");
		
	}

}

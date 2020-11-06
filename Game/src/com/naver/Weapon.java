package com.naver;

public class Weapon {
	
	private String weapon;
	private int power;
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}

	public Weapon(String weapon, int power) {
		super();
		this.weapon = weapon;
		this.power = power;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
	public void attack(Monster mon) {
		
		int bHp = mon.getHp();
		int aHp = bHp-power;
		mon.setHp(aHp);
		System.out.println("Monster의 HP :"+aHp);
		if(aHp==0) {
			System.out.println("몬스터를 처치했습니다.");
		}
			
	}
	
	@Override
	public String toString() {
		return getWeapon();
	}
	
	

}

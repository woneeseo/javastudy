package com.naver;

public class Weapon {
	
	
	
	private String name;
	private int power;
	
	public Weapon() {
		
	}

	public Weapon(int power) {
		super();
		this.power = power;
	}
	
	public Weapon(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		System.out.println("Monster�� HP: "+aHp);
		if(aHp ==0) {
			System.out.println("���͸� óġ�߽��ϴ�.");
		}
		
		
	}

	@Override
	public String toString() {
		return getName();
	}
	
	


}

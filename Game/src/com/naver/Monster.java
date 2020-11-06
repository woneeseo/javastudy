package com.naver;

public class Monster {
	
	private int hp;
	private int attack;

	
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(int hp, int attack) {
		super();
		this.hp = hp;
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void attackHero(int attack) {
		if(hp%10==0) {
			attackHero(30);
		}
	}
	

	

}

package com.naver;

public class Hero {
	
	private Bow bow;
	private Sword sword;
	private Spear spear;
	private Shild shild;
	private exAttack exAttack;
	
	
	public exAttack getExAttack() {
		return exAttack;
	}

	public void setExAttack(exAttack exAttack) {
		this.exAttack = exAttack;
	}

	public Hero(Bow bow, Sword sword, Spear spear, Shild shild, com.naver.exAttack exAttack) {
		super();
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
		this.shild = shild;
		this.exAttack = exAttack;
	}

	public Shild getShild() {
		return shild;
	}

	public void setShild(Shild shild) {
		this.shild = shild;
	}

	public Hero(Bow bow, Sword sword, Spear spear, Shild shild) {
		super();
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
		this.shild = shild;
	}

	public Hero() {
		
	}

	public Hero(Bow bow, Sword sword, Spear spear) {
		super();
		this.bow = bow;
		this.sword = sword;
		this.spear = spear;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}
	
	public void attack(Monster mon) {
		bow.attack(mon);
		
	}
	
	public void attack(Sword sword, Monster mon) {
		this.sword = sword;
		sword.attack(sword,mon);

	}
	
	public void attakcBySpear(Monster mon) {
		spear.attackBySpear(mon);
	}
	
	public void shildFromMon(Monster mon) {
		shild.shildFromMon(mon);
	}
	
	public void extreamAttack(Monster mon) {
		exAttack.extreamAttack(mon);
		
	}
	
	
	

}

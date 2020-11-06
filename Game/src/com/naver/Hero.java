package com.naver;

public class Hero {
	
//	Bow bow = new Bow();
//	Sword sword = new Sword();
//	Axe axe = new Axe();
//	Gun gun = new Gun();
//	
	// 생각해보니 기능이 다 같아 -> 몬스터를 공격하는데 씀
	// 공격하겠다
	// 무기를 바꾸겠다
	
	Weapon[] weapon;
	// 멤버변수로 weapon을 하나 선언해줘
	// 이 안에 들어갈 내용은 생성자에서 변경할 수 있음
	// 왜 배열의 형태로 선언해? => 무기 여러개를 가질 수 있으니까?
	
	Weapon w;
	// 이거는 초반에 게임 시작했을 때 가지고 있을 무기를 설정해주려고 변수만듦?
	
	public Hero() {
		
		weapon = new Weapon[] {new Axe("도끼", 6), new Bow("활", 2), 
				new Gun("총", 10), new Sword("검", 5)};
		
		w = weapon[2];
		
		}

	public Hero(Weapon[] weapon, Weapon w) {
		super();
		this.weapon = weapon;
		this.w = w;
	}

	public Weapon[] getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon[] weapon) {
		this.weapon = weapon;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}
	
	public void attack(Monster mon) {
		System.out.println("몬스터를 공격합니다.");
		w.attack(mon);
	}
	
	public void changeWeapon(int weaponIdx) {
		if(weaponIdx>=weapon.length || weaponIdx<0) {
			weaponIdx = weapon.length-1;
		}
		w = weapon[weaponIdx];
		System.out.println("무기가 "+w +"(으)로 변경되었습니다.");
	}
	
	
	
	

}

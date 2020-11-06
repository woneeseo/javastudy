package com.naver;

public class Hero {
	
//	Bow bow = new Bow();
//	Sword sword = new Sword();
//	Axe axe = new Axe();
//	Gun gun = new Gun();
//	
	// �����غ��� ����� �� ���� -> ���͸� �����ϴµ� ��
	// �����ϰڴ�
	// ���⸦ �ٲٰڴ�
	
	Weapon[] weapon;
	// ��������� weapon�� �ϳ� ��������
	// �� �ȿ� �� ������ �����ڿ��� ������ �� ����
	// �� �迭�� ���·� ������? => ���� �������� ���� �� �����ϱ�?
	
	Weapon w;
	// �̰Ŵ� �ʹݿ� ���� �������� �� ������ ���� ���⸦ �������ַ��� ��������?
	
	public Hero() {
		
		weapon = new Weapon[] {new Axe("����", 6), new Bow("Ȱ", 2), 
				new Gun("��", 10), new Sword("��", 5)};
		
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
		System.out.println("���͸� �����մϴ�.");
		w.attack(mon);
	}
	
	public void changeWeapon(int weaponIdx) {
		if(weaponIdx>=weapon.length || weaponIdx<0) {
			weaponIdx = weapon.length-1;
		}
		w = weapon[weaponIdx];
		System.out.println("���Ⱑ "+w +"(��)�� ����Ǿ����ϴ�.");
	}
	
	
	
	

}

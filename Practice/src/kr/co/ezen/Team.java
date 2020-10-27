package kr.co.ezen;

import com.naver.Person;

public class Team {
	
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team() {
		
	}

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}

	public void fightCap(Team bTeam) {
		
		String aCapName = this.captain.getName();
		String bCapName = bTeam.captain.getName();
		
		System.out.println(aCapName+"��(��) "+bCapName+"��(��) �ο��.");
		
	}

	public void mem1CarSpeedRun(Team aTeam) {
		
		String bMem1CarName = this.member1.getCar().getModelName();
		String aMem1CarName = aTeam.member1.getCar().getModelName();
		
		String bMem1CarSpeed = this.member1.getCar().run(80);
		String aMem1CarSpeed = aTeam.member1.getCar().run(70);
		
		System.out.println(bMem1CarName+"�� "+bMem1CarSpeed);
		System.out.println(aMem1CarName+"�� "+aMem1CarSpeed);
		
	}

	public void mem2CarPrice(Team bTeam) {
		String mem2Name = this.member2.getName();
		String bMem2Name = bTeam.member2.getName();
		
		String mem2CarName = this.member2.getCar().getModelName();
		String bMem2CarName = bTeam.member2.getCar().getModelName();
		
		
		int mem2CarPrice = this.member2.getCar().getPrice();
		int bMem2CarPrice = bTeam.member2.getCar().getPrice();
		
		System.out.println(mem2Name+"�� "+mem2CarName+" ������ "+mem2CarPrice+"���� �̰�, "
				+ ""+bMem2Name+"�� "+bMem2CarName+"�� ������ "+bMem2CarPrice+"���� �̴�.");
	}
	
	
	
	
	
	
	
	

}

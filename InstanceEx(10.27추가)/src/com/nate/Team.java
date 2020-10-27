package com.nate;

import java.util.Date;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;
import kr.co.ezen.MainEx;

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
	
	public void showCaptainCarPrice() {
		Car capCar = captain.getK7();
		capCar.showMePrice();
		
	}
	
	public void mem1Sleep(String where) {
		String msg = member1.getHappy().sleep("��");
		System.out.println(msg);
	}
	
	
	
	
	
	
	
	
	public void capRunSpeed(int speed) {
		captain.getK7().run(speed);
		// ĸƾ�� ���� ���� nn�ӵ��� �޸���
	}
	
	public void capCarNo() {
		String cn = captain.getK7().getCarNo();
		System.out.println(cn);
		// ĸƾ�� ���� ���� ��ȣ
	}
	
	public void mem2DogName() {
		String m2dn = member2.getHappy().getName();
		System.out.println(m2dn);
		// ���2�� ���� �������� �̸�
	}
	
	public void mem2Sleep(String where) {
		member2.getHappy().sleep(where);
		System.out.println(member2.getHappy().sleep(where));
		// ���2�� ���� �������� where���� �ܴ�.
		
	}
	
	public void capDogName() {
		String dn = captain.getHappy().getName();
		System.out.println(dn);
		// ĸƾ�� ���� �������� �̸�
	}
	
	public void mem2CarPrice() {
		member2.getK7().showMePrice();
		// ���2�� ������ �ִ� ���� ����
	}
	
	public void mem2PrintCarModelName() {
		
		// Car car = member2.getk7();
		// String mn = car.getModelName();
		// System.out.println(mn);
		
		String m2mn = member2.getK7().getModelName();
		System.out.println(m2mn);
		// ���2�� ������ �ִ� ���� �𵨸�
		
	}
	
	public void mem1PrintCarModelName() {
		member1.printCarModelName();
		// ���1�� �� ���̸�.
	}
	
	public void capPrintCarModelName() {
		captain.printCarModelName();
		// ĸƾ�� �� �𵨸�.
	}
	
	public void mem1DogBirth() {
		Date bd = member1.getHappy().getBirth();
		System.out.println(bd);
		// ���1�� ������ �ִ� �������� ����
	}
	
	public void mem2CarSpeed(int speed) {
		member2.getK7().run(speed);
		// ��� 2�� ���� speed �ӵ��� �޸��� �� ��ȯ
		
	}
	
	public char getCaptainCarModelNameFirstChar() {
		String cn = captain.getK7().getModelName();
		char a= cn.charAt(0);
		return a;
		// ĸƾ�� ������ �ִ� �ڵ��� �𵨸��� ù��°����
		
	}
	
	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
		// ���1�� �����ִ� ���� �ܺο��� �Է��ϴ� ���� ����
		// �ܺο��� �Է��Ѵ� => �Ķ���Ͱ� �ִ�
	}
	
	public void changeMem1DogName(String name) {
		Dog dog = member1.getHappy();
		dog.setName(name);
	    // ���1�� ������ �ִ� ���� �̸��� �ܺ����� �Է��ϴ� �̸����� ����
		// ���� ���1�� ���� �������� Dog dog = member1.getHappy();
		// ���1�� ���� �̸��� ������ ������ ���� �� �ֵ��� set�޼��带 ���
		// dog.setName(name);
	}

	public void fight(Team bTeam) {
		String a = this.captain.getName();
		// this.captain.getName(); = a�������� �̸��� ���´�
		// ���ο��� �� �޼��带 ȣ���� ��ü�� aTeam �̶�
		// ���⼭ this �� aTeam �� ����Ų��.
		
		String b = bTeam.captain.getName();
		// bTeam.captain.getName(); = b�������� �̸��� ���´�

		
		System.out.println(a+"�� "+b+"�� �ο�ϴ�.");
		
	}

	public void fightMem1(Team otherTeam) {
		
		String atm1 = this.member1.getName();
		String otherMem1 = otherTeam.member1.getName();
		System.out.println(atm1+"�� "+otherMem1+"�� �ο��.");
	}

	public void fightMem2Dog(Team otherTeam) {
		String m2dn = this.member2.getHappy().getName();
		String otherDn = otherTeam.member2.getHappy().getName();
		
		System.out.println(m2dn+"�� "+otherDn+"�� ���ο��� �մϴ�.");
	}

	public void fightMem1Car(Team otherTeam) {
		String carName = this.member1.getK7().getModelName();
		System.out.println(carName);
		// ���⼭ this �� bTeam�� �ǹ��� 
		// �׷��� �� �Ĵ�� ȣ���ϴϱ� b�� ���3�� �� k5�� ��µ�
		String otherCarName = otherTeam.member1.getK7().getModelName();
		System.out.println(otherCarName);
		// otherTeam�� Ÿ�� �� �� �̸��� ����غô��� 
		// a�� ���1�� ���� BMW�� ��µ�
		
		// ��? ����ex���� fightMem1Car�� ȣ���� ��ü�� bTeam�̱� ������
		// this�� �Է��� Ÿ�� ����
		// b���� ���� ������ �����°ž�		
	}

	public void figheCapCar(Team bTeam) {
		
		String capCar = this.captain.getK7().getModelName();
		// a�� ĸƾ�� �� �𵨸��� ȣ����
		String cap2Car = bTeam.captain.getK7().getModelName();
		// b�� ĸƾ�� �� �𵨸��� ȣ����
		
		System.out.println(capCar+"��(��) "+cap2Car+"�� �ڵ��� ���ָ� �Ѵ�.");
	}

	public void fightMem2(Team aTeam) {
		String mem2Name = this.member2.getName();
		String mem4Name = aTeam.member2.getName();
		
		System.out.println(mem2Name+"��(��) "+mem4Name+"��(��) �ο�ϴ�.");
	}

	public void capDogFight(Team bTeam) {
		
		String aCapDogName = this.captain.getHappy().getName();
		// a������ �� �ż��带 ȣ�������ϱ�, ���⼭ ȣ���� ������ �̸���
		// a�� ĸƾ�� ������ �̸�
		String bCapDogName = bTeam.captain.getHappy().getName();
		
		System.out.println(aCapDogName+"��(��) "+bCapDogName+"��(��) ���ο��� �Ѵ�.");
		
	}

	public void fightMem1Dog(Team aTeam) {
		String mem1Dog = this.member1.getHappy().getName();
		String mem3Dog = aTeam.member1.getHappy().getName();
		
		System.out.println(mem1Dog+"��(��) "+mem3Dog+"��(��) �������� ���.");
		
		
	}

	public void fightMem2Car(Team bTeam) {
		String mem2Car = this.member2.getK7().getModelName();
		String mem4Car = bTeam.member2.getK7().getModelName();
		
		System.out.println(mem2Car+"��(��) "+mem4Car+"��(��) �ڵ��� ���ָ� �Ѵ�.");
		
	}

	public void fightCapMem1(Team bTeam) {
		String aTeamCap = this.captain.getName();
		String bTeamMem1 = bTeam.member1.getName();
		
		System.out.println(aTeamCap+"��(��) "+bTeamMem1+"��(��) �ο��� �մϴ�.");	
		
	}

	public void fightMem(Team aTeam) {
		
		String bTeamMem1 = this.member1.getName();
		String bTeamMem2 = this.member2.getName();
		
		String aTeamMem1 = aTeam.member1.getName();
		String aTeamMem2 = aTeam.member2.getName();
		
		System.out.println(aTeamMem1+"�� "+aTeamMem2+"�� ���� ���� "+bTeamMem1+"�� "+bTeamMem2+"�� �����ƽ��ϴ�.");
		
		
	}

	public void fightMemandDog(Team bTeam) {
		String me1Name = this.member1.getName();
		String me1DogName = this.member1.getHappy().getName();
		
		String me3Name = bTeam.member1.getName();
		String me3DogName = bTeam.member1.getHappy().getName();
		
		System.out.println(me1Name+"�� ������ "+me1DogName+"�� "+me3Name+"�� ������ "+me3DogName+"�� �������� ��� �ֽ��ϴ�.");
		
	}

	public void teamFight(Team aTeam) {
		String bTeamCap = this.captain.getName();
		String bTeamMem1 = this.member1.getName();
		String bTeamMem2 = this.member2.getName();
		
		String aTeamCap = aTeam.captain.getName();
		String aTeamMem1 = aTeam.member1.getName();
		String aTeamMem2 = aTeam.member2.getName();
		
		System.out.println("B���� ������ "+bTeamCap+"�̰�, B���� ����δ� "+bTeamMem1+"�� "+bTeamMem2+"�� �ִ�. "
				+ "������� A���̰�, �� ���� ������ "+aTeamCap+" �̸� ����δ� "+aTeamMem1+"�� "+aTeamMem2+"�� �ִ�.");
		
	}

	public void fightCapCarRunSpeed(Team bTeam) {
		
		String aCapCarSpeed = this.captain.getK7().run(50);
		String bCapCarSpeed = bTeam.captain.getK7().run(60);
		
		System.out.println(this.captain.getK7().getModelName()+"�� "+aCapCarSpeed);
		System.out.println(bTeam.captain.getK7().getModelName()+"�� "+bCapCarSpeed);
	}

	public void capCarPrice(Team aTeam) {
		this.captain.getK7().showMePrice();
		aTeam.captain.getK7().showMePrice();
	}
	
	public char mem1CarModelName() {
		char a = member1.getK7().getModelName().charAt(0);
		return a;
	}
	
	public void mem1DogChange(Dog dog) {
		member1.setHappy(dog);
		// �� ��ü�� ����
	}
	
	public void mem1DogNameChange(String name) {
		member1.getHappy().setName(name);
		// �� �̸��� ����	
	}

	public void fightCapDog(Team bTeam) {
		String aTeamCapDog = this.captain.getHappy().getName();
		String bTeamCapDog = bTeam.captain.getHappy().getName();
		
		System.out.println(aTeamCapDog+"�� "+bTeamCapDog+"�� �Բ� ���.");
		
	}

	public void fightMem2CarSpeed(Team aTeam) {
		
		String m2CarName = this.member2.getK7().getModelName();
		String m1CarName = aTeam.member2.getK7().getModelName();
		
		String mem2CarSpeed = this.member2.getK7().run(90);
		String mem1CarSpeed = aTeam.member2.getK7().run(85);
		
		System.out.println(m2CarName+"�� "+mem2CarSpeed);
		System.out.println(m1CarName+"�� "+mem1CarSpeed);
		
		
	}

	public void dogSleep(Team bTeam) {
		String master = this.captain.getName();
		String dogName = this.captain.getHappy().getName();
		String b = this.captain.getHappy().sleep("��");
		
		System.out.println(master+"�� ������ "+dogName+"�� "+b);
		// b�� ������ ������ happy�� ������ �ܴ� => �� ��� 
		System.out.println();
		
		String master2 = bTeam.captain.getName();
		String dName = bTeam.captain.getHappy().getName();
		String a = bTeam.captain.getHappy().sleep("��");
		
		System.out.println(master2+"�� ������ "+dName+"�� "+a);
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	
	
	
	
	

}

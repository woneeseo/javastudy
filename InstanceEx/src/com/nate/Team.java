package com.nate;

import java.util.Date;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

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
	
	

}

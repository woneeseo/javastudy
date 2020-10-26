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
		String msg = member1.getHappy().sleep("방");
		System.out.println(msg);
	}
	
	
	
	
	
	
	
	
	public void capRunSpeed(int speed) {
		captain.getK7().run(speed);
		// 캡틴이 가진 차가 nn속도로 달린다
	}
	
	public void capCarNo() {
		String cn = captain.getK7().getCarNo();
		System.out.println(cn);
		// 캡틴이 가진 차의 번호
	}
	
	public void mem2DogName() {
		String m2dn = member2.getHappy().getName();
		System.out.println(m2dn);
		// 멤버2가 가진 강아지의 이름
	}
	
	public void mem2Sleep(String where) {
		member2.getHappy().sleep(where);
		System.out.println(member2.getHappy().sleep(where));
		// 멤버2가 가진 강아지는 where에서 잔다.
		
	}
	
	public void capDogName() {
		String dn = captain.getHappy().getName();
		System.out.println(dn);
		// 캡틴이 가진 강아지의 이름
	}
	
	public void mem2CarPrice() {
		member2.getK7().showMePrice();
		// 멤버2가 가지고 있는 차의 가격
	}
	
	public void mem2PrintCarModelName() {
		
		// Car car = member2.getk7();
		// String mn = car.getModelName();
		// System.out.println(mn);
		
		String m2mn = member2.getK7().getModelName();
		System.out.println(m2mn);
		// 멤버2가 가지고 있는 차의 모델명
		
	}
	
	public void mem1PrintCarModelName() {
		member1.printCarModelName();
		// 멤버1의 차 모델이름.
	}
	
	public void capPrintCarModelName() {
		captain.printCarModelName();
		// 캡틴의 차 모델명.
	}
	
	public void mem1DogBirth() {
		Date bd = member1.getHappy().getBirth();
		System.out.println(bd);
		// 멤버1이 데리고 있는 강아지의 생일
	}
	
	public void mem2CarSpeed(int speed) {
		member2.getK7().run(speed);
		// 멤버 2의 차가 speed 속도로 달린다 를 반환
		
	}
	
	

}

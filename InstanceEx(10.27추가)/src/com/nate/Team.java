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
	
	public char getCaptainCarModelNameFirstChar() {
		String cn = captain.getK7().getModelName();
		char a= cn.charAt(0);
		return a;
		// 캡틴이 가지고 있는 자동차 모델명의 첫번째글자
		
	}
	
	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
		// 멤버1이 갖고있는 개를 외부에서 입력하는 개로 변경
		// 외부에서 입력한다 => 파라미터가 있다
	}
	
	public void changeMem1DogName(String name) {
		Dog dog = member1.getHappy();
		dog.setName(name);
	    // 멤버1이 가지고 있는 개의 이름을 외보에서 입력하는 이름으로 변경
		// 먼저 멤버1의 개를 지정해줌 Dog dog = member1.getHappy();
		// 멤버1의 개의 이름을 변경해 가지고 있을 수 있도록 set메서드를 사용
		// dog.setName(name);
	}

	public void fight(Team bTeam) {
		String a = this.captain.getName();
		// this.captain.getName(); = a팀주장의 이름이 나온다
		// 메인에서 이 메서드를 호출한 객체가 aTeam 이라
		// 여기서 this 는 aTeam 을 가리킨다.
		
		String b = bTeam.captain.getName();
		// bTeam.captain.getName(); = b팀주장의 이름이 나온다

		
		System.out.println(a+"와 "+b+"가 싸웁니다.");
		
	}

	public void fightMem1(Team otherTeam) {
		
		String atm1 = this.member1.getName();
		String otherMem1 = otherTeam.member1.getName();
		System.out.println(atm1+"과 "+otherMem1+"이 싸운다.");
	}

	public void fightMem2Dog(Team otherTeam) {
		String m2dn = this.member2.getHappy().getName();
		String otherDn = otherTeam.member2.getHappy().getName();
		
		System.out.println(m2dn+"와 "+otherDn+"이 개싸움을 합니다.");
	}

	public void fightMem1Car(Team otherTeam) {
		String carName = this.member1.getK7().getModelName();
		System.out.println(carName);
		// 여기서 this 는 bTeam을 의미함 
		// 그래서 이 식대로 호출하니까 b팀 멤버3의 차 k5가 출력됨
		String otherCarName = otherTeam.member1.getK7().getModelName();
		System.out.println(otherCarName);
		// otherTeam을 타고 들어가 차 이름을 출력해봤더니 
		// a팀 멤버1의 차가 BMW가 출력됨
		
		// 왜? 메인ex에서 fightMem1Car를 호출한 객체가 bTeam이기 때문에
		// this를 입력해 타고 들어가면
		// b팀에 관한 정보가 나오는거야		
	}

	public void figheCapCar(Team bTeam) {
		
		String capCar = this.captain.getK7().getModelName();
		// a팀 캡틴의 차 모델명을 호출함
		String cap2Car = bTeam.captain.getK7().getModelName();
		// b팀 캡틴의 차 모델명을 호출함
		
		System.out.println(capCar+"와(과) "+cap2Car+"가 자동차 경주를 한다.");
	}

	public void fightMem2(Team aTeam) {
		String mem2Name = this.member2.getName();
		String mem4Name = aTeam.member2.getName();
		
		System.out.println(mem2Name+"와(과) "+mem4Name+"이(가) 싸웁니다.");
	}

	public void capDogFight(Team bTeam) {
		
		String aCapDogName = this.captain.getHappy().getName();
		// a팀으로 이 매서드를 호출했으니까, 여기서 호출한 강아지 이름은
		// a팀 캡틴의 강아지 이름
		String bCapDogName = bTeam.captain.getHappy().getName();
		
		System.out.println(aCapDogName+"와(과) "+bCapDogName+"이(가) 개싸움을 한다.");
		
	}

	public void fightMem1Dog(Team aTeam) {
		String mem1Dog = this.member1.getHappy().getName();
		String mem3Dog = aTeam.member1.getHappy().getName();
		
		System.out.println(mem1Dog+"와(과) "+mem3Dog+"이(가) 사이좋게 논다.");
		
		
	}

	public void fightMem2Car(Team bTeam) {
		String mem2Car = this.member2.getK7().getModelName();
		String mem4Car = bTeam.member2.getK7().getModelName();
		
		System.out.println(mem2Car+"와(과) "+mem4Car+"이(가) 자동차 경주를 한다.");
		
	}

	public void fightCapMem1(Team bTeam) {
		String aTeamCap = this.captain.getName();
		String bTeamMem1 = bTeam.member1.getName();
		
		System.out.println(aTeamCap+"와(과) "+bTeamMem1+"이(가) 싸움을 합니다.");	
		
	}

	public void fightMem(Team aTeam) {
		
		String bTeamMem1 = this.member1.getName();
		String bTeamMem2 = this.member2.getName();
		
		String aTeamMem1 = aTeam.member1.getName();
		String aTeamMem2 = aTeam.member2.getName();
		
		System.out.println(aTeamMem1+"과 "+aTeamMem2+"가 힘을 합쳐 "+bTeamMem1+"와 "+bTeamMem2+"를 물리쳤습니다.");
		
		
	}

	public void fightMemandDog(Team bTeam) {
		String me1Name = this.member1.getName();
		String me1DogName = this.member1.getHappy().getName();
		
		String me3Name = bTeam.member1.getName();
		String me3DogName = bTeam.member1.getHappy().getName();
		
		System.out.println(me1Name+"의 강아지 "+me1DogName+"과 "+me3Name+"의 강아지 "+me3DogName+"가 사이좋게 놀고 있습니다.");
		
	}

	public void teamFight(Team aTeam) {
		String bTeamCap = this.captain.getName();
		String bTeamMem1 = this.member1.getName();
		String bTeamMem2 = this.member2.getName();
		
		String aTeamCap = aTeam.captain.getName();
		String aTeamMem1 = aTeam.member1.getName();
		String aTeamMem2 = aTeam.member2.getName();
		
		System.out.println("B팀의 주장은 "+bTeamCap+"이고, B팀의 멤버로는 "+bTeamMem1+"과 "+bTeamMem2+"가 있다. "
				+ "상대팀은 A팀이고, 이 팀의 주장은 "+aTeamCap+" 이며 멤버로는 "+aTeamMem1+"과 "+aTeamMem2+"가 있다.");
		
	}

	public void fightCapCarRunSpeed(Team bTeam) {
		
		String aCapCarSpeed = this.captain.getK7().run(50);
		String bCapCarSpeed = bTeam.captain.getK7().run(60);
		
		System.out.println(this.captain.getK7().getModelName()+"가 "+aCapCarSpeed);
		System.out.println(bTeam.captain.getK7().getModelName()+"가 "+bCapCarSpeed);
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
		// 개 자체를 변경
	}
	
	public void mem1DogNameChange(String name) {
		member1.getHappy().setName(name);
		// 개 이름만 변경	
	}

	public void fightCapDog(Team bTeam) {
		String aTeamCapDog = this.captain.getHappy().getName();
		String bTeamCapDog = bTeam.captain.getHappy().getName();
		
		System.out.println(aTeamCapDog+"와 "+bTeamCapDog+"가 함께 논다.");
		
	}

	public void fightMem2CarSpeed(Team aTeam) {
		
		String m2CarName = this.member2.getK7().getModelName();
		String m1CarName = aTeam.member2.getK7().getModelName();
		
		String mem2CarSpeed = this.member2.getK7().run(90);
		String mem1CarSpeed = aTeam.member2.getK7().run(85);
		
		System.out.println(m2CarName+"가 "+mem2CarSpeed);
		System.out.println(m1CarName+"가 "+mem1CarSpeed);
		
		
	}

	public void dogSleep(Team bTeam) {
		String master = this.captain.getName();
		String dogName = this.captain.getHappy().getName();
		String b = this.captain.getHappy().sleep("집");
		
		System.out.println(master+"의 강아지 "+dogName+"는 "+b);
		// b팀 주장의 강아지 happy는 집에서 잔다 => 를 출력 
		System.out.println();
		
		String master2 = bTeam.captain.getName();
		String dName = bTeam.captain.getHappy().getName();
		String a = bTeam.captain.getHappy().sleep("밖");
		
		System.out.println(master2+"의 강아지 "+dName+"는 "+a);
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	
	
	
	
	

}

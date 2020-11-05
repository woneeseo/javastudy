package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;
//10월 26일 사용자 생성자로 객체 생성하기 학습 
//+메서드 호출 먼저-> 매서드 생성
//+매서드의 객체 구분하기
//+Team ohterTeam 파라미터 이용해서 두 객체에 존재하는 내용 하나의 메서드로 불러오기 
public class MainEx {

	public static void main(String[] args) {
		
		Car car1 = new Car("K7", "서울34자1234", 4000);
		// car1.showMePrice();
		
		Car car2 = new Car("BMW", "서울33사9876", 5000);
		Car car3 = new Car("SM5", "경기31자1234", 4000);
		
		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "marry", new Date());
		Dog dog3 = new Dog(3, "백구", new Date(Calendar.getInstance().getTimeInMillis()));
		
		// 객체를 미리 만들어서 변수로 사용할 수도 있고
		Person captain = new Person("p1", "a팀주장", dog1, car1);
		
		// 아래처럼 익명의 변수를 사용해도 된다.
		// Person captain = new Person("p1", "주장", new Dog(did, name, birth), new Car(modelName, carNo, price));
		
		Person member1 = new Person("p2", "김유신", dog2, car2);
		Person member2 = new Person("p3", "이순신", dog3, car3);
		
		Dog dog4 = new Dog(4, "황구", new Date());
		Dog dog5 = new Dog(5, "땡칠이", new Date());
		Dog dog6 = new Dog(6, "봄", new Date());
		
		Car car4 = new Car("벤츠", "4", 5000);
		Car car5 = new Car("k5", "5", 5000);
		Car car6 = new Car("bmw", "6", 5000);
		
		Person captain2 = new Person("p4","b팀주장", dog4, car4);
		Person member3 = new Person("p5", "풍신수길", dog5, car5);
		Person member4 = new Person("p6", "이토", dog6, car6);
		
		
		Team aTeam = new Team(captain, member1, member2);
		Team bTeam = new Team(captain2, member3, member4);
		
		aTeam.fight(bTeam);
		
		bTeam.fightMem1(aTeam);
		
		aTeam.fightMem2Dog(bTeam);
		
		bTeam.fightMem1Car(aTeam);
		
		aTeam.figheCapCar(bTeam);
		
		bTeam.fightMem2(aTeam);
		
		aTeam.capDogFight(bTeam);
		
		bTeam.fightMem1Dog(aTeam);
		
		aTeam.fightMem2Car(bTeam);
		
		aTeam.fightCapMem1(bTeam);
		
		bTeam.fightMem(aTeam);
		
		aTeam.fightMemandDog(bTeam);
		
		bTeam.teamFight(aTeam);
		
		aTeam.fightCapCarRunSpeed(bTeam);
		
		bTeam.capCarPrice(aTeam);
		
		aTeam.fightCapDog(bTeam);
		
		bTeam.fightMem2CarSpeed(aTeam);
		
		aTeam.dogSleep(bTeam);
	
	
	}


}

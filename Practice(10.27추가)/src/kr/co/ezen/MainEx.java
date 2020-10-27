package kr.co.ezen;

import java.util.Date;

import com.naver.Dog;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", 6000, "가1234");
		Car car2 = new Car("K7", 5000, "나4567");
		Car car3 = new Car("미니쿠퍼", 8000, "다6789");
		
		Dog dog1 = new Dog("백구", new Date());
		Dog dog2 = new Dog("황구", new Date());
		Dog dog3 = new Dog("흑구", new Date());
		
		Person p1 = new Person("김일식", 20, "대학생", dog1, car1);
		Person p2 = new Person("김두식", 18, "고등학생", dog2, car2);
		Person p3 = new Person("김삼식", 16, "중학생", dog3, car3);
		
		
		Team aTeam = new Team(p1, p2, p3);
		
		Car car4 = new Car("K5", 5000, "라3456");
		Car car5 = new Car("마티즈", 2000, "마4589");
		Car car6 = new Car("모닝", 2000, "바1678");
		
		Dog dog4 = new Dog("돌돌이", new Date());
		Dog dog5 = new Dog("딸기", new Date());
		Dog dog6 = new Dog("재롱이", new Date());
		
		Person p4 = new Person("박네식", 22, "직장인", dog4, car4);
		Person p5 = new Person("박오식", 26, "경찰", dog5, car5);
		Person p6 = new Person("박육식", 28, "자영업", dog6, car6);
		
		Team bTeam = new Team(p4, p5, p6);
		
		
		aTeam.fightCap(bTeam);
		
		bTeam.mem1CarSpeedRun(aTeam);
		
		aTeam.mem2CarPrice(bTeam);
		
		
		

	}

}

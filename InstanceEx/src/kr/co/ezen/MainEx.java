package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;
//10�� 26�� ����� �����ڷ� ��ü �����ϱ� �н� 
//+�޼��� ȣ�� ����-> �ż��� ����
//+�ż����� ��ü �����ϱ�
//+Team ohterTeam �Ķ���� �̿��ؼ� �� ��ü�� �����ϴ� ���� �ϳ��� �޼���� �ҷ����� 
public class MainEx {

	public static void main(String[] args) {
		
		Car car1 = new Car("K7", "����34��1234", 4000);
		// car1.showMePrice();
		
		Car car2 = new Car("BMW", "����33��9876", 5000);
		Car car3 = new Car("SM5", "���31��1234", 4000);
		
		Dog dog1 = new Dog(1, "happy", new Date(11));
		Dog dog2 = new Dog(2, "marry", new Date());
		Dog dog3 = new Dog(3, "�鱸", new Date(Calendar.getInstance().getTimeInMillis()));
		
		// ��ü�� �̸� ���� ������ ����� ���� �ְ�
		Person captain = new Person("p1", "a������", dog1, car1);
		
		// �Ʒ�ó�� �͸��� ������ ����ص� �ȴ�.
		// Person captain = new Person("p1", "����", new Dog(did, name, birth), new Car(modelName, carNo, price));
		
		Person member1 = new Person("p2", "������", dog2, car2);
		Person member2 = new Person("p3", "�̼���", dog3, car3);
		
		Dog dog4 = new Dog(4, "Ȳ��", new Date());
		Dog dog5 = new Dog(5, "��ĥ��", new Date());
		Dog dog6 = new Dog(6, "��", new Date());
		
		Car car4 = new Car("����", "4", 5000);
		Car car5 = new Car("k5", "5", 5000);
		Car car6 = new Car("bmw", "6", 5000);
		
		Person captain2 = new Person("p4","b������", dog4, car4);
		Person member3 = new Person("p5", "ǳ�ż���", dog5, car5);
		Person member4 = new Person("p6", "����", dog6, car6);
		
		
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

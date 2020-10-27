package kr.co.ezen;

import java.util.Date;

import com.naver.Dog;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", 6000, "��1234");
		Car car2 = new Car("K7", 5000, "��4567");
		Car car3 = new Car("�̴�����", 8000, "��6789");
		
		Dog dog1 = new Dog("�鱸", new Date());
		Dog dog2 = new Dog("Ȳ��", new Date());
		Dog dog3 = new Dog("�汸", new Date());
		
		Person p1 = new Person("���Ͻ�", 20, "���л�", dog1, car1);
		Person p2 = new Person("��ν�", 18, "����л�", dog2, car2);
		Person p3 = new Person("����", 16, "���л�", dog3, car3);
		
		
		Team aTeam = new Team(p1, p2, p3);
		
		Car car4 = new Car("K5", 5000, "��3456");
		Car car5 = new Car("��Ƽ��", 2000, "��4589");
		Car car6 = new Car("���", 2000, "��1678");
		
		Dog dog4 = new Dog("������", new Date());
		Dog dog5 = new Dog("����", new Date());
		Dog dog6 = new Dog("�����", new Date());
		
		Person p4 = new Person("�ڳ׽�", 22, "������", dog4, car4);
		Person p5 = new Person("�ڿ���", 26, "����", dog5, car5);
		Person p6 = new Person("������", 28, "�ڿ���", dog6, car6);
		
		Team bTeam = new Team(p4, p5, p6);
		
		
		aTeam.fightCap(bTeam);
		
		bTeam.mem1CarSpeedRun(aTeam);
		
		aTeam.mem2CarPrice(bTeam);
		
		
		

	}

}

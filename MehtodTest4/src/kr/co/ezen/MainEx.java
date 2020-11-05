package kr.co.ezen;

import com.naver.CarRegistManagementService;
import com.naver.DogRegistManagementService;

public class MainEx {
	public static void main(String[] args) {
		
		CarRegistManagementService crms = new CarRegistManagementService();
		
		crms.setCarName("K7");
		
		String carName = crms.getCarName();
		System.out.println(carName);
		
		CarRegistManagementService crms2 = new CarRegistManagementService();
		

		long result = crms2.add(2100000000, 500000000);
		System.out.println(result);
		// ������ �ʰ��ؼ� �����÷ο찡 �Ͼ
		// ��谪 �׽�Ʈ . �׽�Ʈ�� ���� ����� ��.
		
		DogRegistManagementService drms = new DogRegistManagementService();
		
		Dog d1 = drms.makeDog("happy", 3);
		System.out.println(d1);
		
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		
		Cat c = new Cat();
		System.out.println(c);
		System.out.println(c.makeCat("��ʶ�", 10));
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		Cat cc = c.makeCat("��߿�", 12);
		
		System.out.println(cc);
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		
		
		
	}

}

package kr.co.ezen;

import com.naver.Bmw;
import com.naver.Car;
import com.naver.K7;
import com.naver.Sm5;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sonata sonata1 = new Sonata();
		Bmw bmw1 = new Bmw();
	//	Car car1 = new Car(); => x (�θ�Ŭ�����δ� ��ü �����ϸ� �ȵ�)
		
		Car sonata2 = new Sonata();
		// �θ��ڷ��� ������(��ü��) = new �ڽĻ�����();
		Car bmw2 = new Bmw();
		
		
		sonata1.run();
		sonata2.run();
		
		
		Car[] arrCar = {sonata1, bmw1, sonata2, bmw2};
		
		sonata1.equals(sonata2);
		// equals() �޼����� �Ķ���� �ڷ����� Object
		// Object�� �ֻ��� Ŭ������ ��� �ڷ����� �ƿ츦 �� �ִ�
		// ��? ������ �ڽ�Ŭ�������� carŬ�����κ��� ����� �ް� �ְ�
		// �ڽ�Ŭ������ �ƿ츣�� carŬ������
		// ��� Ŭ������ ����Ŭ����(super class)�� Object��
		// ����� �ް� �ֱ� ������
		// Object�� �ƿ﷯�� �� �ִ�.
		// ���������� ������ ��ü�� 
		// �Ϲ������� ��ü�� ������ ��ü�� �����ϰ�
		// ������ Ŭ������ �ۼ��� �ż��忡 ������ �� ����
		
		sonata1.run();
		bmw1.run();
		
		sonata1.only();
		
		Sonata s = null;
		
		if(sonata2 instanceof Car) {
			// sonata2�� sonata�� instance�� ������� ��ü��?
			s = (Sonata)sonata2;
			
		}
		s.only();
		System.out.println();
		if(sonata2 instanceof Sonata) {
			// sonata2�� sonata�� instance�� ������� ��ü��?
			s = (Sonata)sonata2;
			
		}
		Sonata ss = null;
		if(sonata2.getClass()==Sonata.class) {
			// sonata2�� ���� Ŭ������ �����ͼ� Sonata Ŭ������ ������ ���ϼ� �񱳸� ��
			ss = (Sonata)sonata2;
			ss.only();
		}
		
		
		
		
		
	
		
		
		

		


	}

}

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
	//	Car car1 = new Car(); => x (부모클래스로는 객체 생성하면 안됨)
		
		Car sonata2 = new Sonata();
		// 부모자료형 변수명(객체명) = new 자식생성자();
		Car bmw2 = new Bmw();
		
		
		sonata1.run();
		sonata2.run();
		
		
		Car[] arrCar = {sonata1, bmw1, sonata2, bmw2};
		
		sonata1.equals(sonata2);
		// equals() 메서드의 파라미터 자료형이 Object
		// Object는 최상위 클래스로 모든 자료형을 아우를 수 있다
		// 왜? 각각의 자식클래스들은 car클래스로부터 상속을 받고 있고
		// 자식클래스를 아우르는 car클래스는
		// 모든 클래스의 상위클래스(super class)인 Object의
		// 상속을 받고 있기 때문에
		// Object로 아울러질 수 있다.
		// 다형성으로 생성된 객체는 
		// 일반적으로 객체를 생성된 객체와 동일하게
		// 각각의 클래스에 작성된 매서드에 접근할 수 있음
		
		sonata1.run();
		bmw1.run();
		
		sonata1.only();
		
		Sonata s = null;
		
		if(sonata2 instanceof Car) {
			// sonata2는 sonata의 instance로 만들어진 객체니?
			s = (Sonata)sonata2;
			
		}
		s.only();
		System.out.println();
		if(sonata2 instanceof Sonata) {
			// sonata2는 sonata의 instance로 만들어진 객체니?
			s = (Sonata)sonata2;
			
		}
		Sonata ss = null;
		if(sonata2.getClass()==Sonata.class) {
			// sonata2를 만든 클래스를 가져와서 Sonata 클래스와 같은지 동일성 비교를 해
			ss = (Sonata)sonata2;
			ss.only();
		}
		
		
		
		
		
	
		
		
		

		


	}

}

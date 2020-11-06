package com.naver;

public class Person {
	
	private Car[] arrCar;

	
	// 부모클래스로부터 상속 받은 클래스들은 자료형이 어떻든
	// 부모 클래스의 자료형으로 통일된다.
	// 따라서 car 클래스의 자원을 상속받은 sonata, sm5, k7은
	// car클래스의 자료형인 car로 통일되어
	// car[] 의 요소값으로 사용이 가능하다.
	
	// car car1 = new sonata;
	// car car2 = new sm5;
	// car car3 = new k7; 
	
	// 처럼 다형성이 가능하기 때문에
	// car라는 배열로 묶어도 문제가 생기지 않는다.
	// car클래스의 정보를 상속받아 만들어지는 새로운 클래스가 있어도
	// 상속받은 부모 클래스가 같기 때문에 
	// arrCar에 추가할 수 있다.
	
//	private Sonata[] sonata;
//	private Sm5[] sm5;
//	private K7[] k7;
	

}

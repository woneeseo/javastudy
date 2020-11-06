package com.naver;

public class Sm5 extends Car {
	
	public Sm5() {
		// TODO Auto-generated constructor stub
		run();
	}

	@Override
	public void run() {
		// super.run(); 부모클래스가 가지고있는 메서드를 호출하는 것이고
		
		System.out.println("SM5의 run()");
		// 메서드내용을 바꿔 오버라이딩 해준다.
	}







	public Sm5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}

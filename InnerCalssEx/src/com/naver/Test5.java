package com.naver;

public class Test5 {
	
	private int a;
	
	public Inter1 ano = new Inter1() {
	// 익명의 내부 클래스 
		// 가짜 익명의 내부 클래스 = 변수를 선언하고 사용함 
		// 외부에서 호출이 가능함!
		@Override
		public void me1() {
			// TODO Auto-generated method stub
			System.out.println("Test5의 me1입니다");
		}
	
	};

}

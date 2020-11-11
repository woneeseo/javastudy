package com.naver;

public class Test6 {
	
	public Test6() {
		// 진짜 익명의 내부클래스. 외부에서 호출이 불가능.
		// 변수 선언 없이 사용하는 익명의 내부 클래스
		// 디폴트 생성자 안에 익명의 내부클래스를 생성했다.
		
		new Inter1() {
			// 메서드가 하나인 인터페이스 -> functional interface
			
			@Override
			public void me1() {
				System.out.println("Test6의 me1입니다.");
				
			}
		}.me1(); /* 객체를 만들고 곧바로 메서드를 불러와서 사용하는 형식*/
		// 외부에서 호출이 안되고 로컬 영역에서 선언해서 사용함. 
		
	}

}

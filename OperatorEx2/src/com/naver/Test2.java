package com.naver;

public class Test2 {
	
	private int a=0;
	private boolean b=false;
	
	public void k1(boolean a, boolean b) {
		boolean result = a && b;
		// 연산에 참여한 데이터가 전부 true일 경우에만 true값이 출력된다.
		// 하나라도 false가 있으면 false값을 반환함
		System.out.println(result);
	
	}
	
	public void k2(boolean a, boolean b) {
		 boolean result = a || b ;
		 System.out.println(result);
		 // 연산에 참여한 데이터중 하나만 true 여도 true값을 출력한다.
		
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
		// 변수 값을 반전
		// 만약 a = true; 일 경우에 !a 를 실행하면
		// a의 값은 false가 된다.
	}
	
	public void switchInt() {
		a = 1-a;
		System.out.println(a);
		// 0과 1을 반복하는 스위치 메서드
	}
	
	public void switchBoolean() {
		b = !b;
		System.out.println(b);
		// true와 false를 반복하는 스위치 메서드
		
	}

}

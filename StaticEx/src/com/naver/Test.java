package com.naver;

public class Test {
	
	public int a;
	public static int b;
	
	public void me2() {
		// static이 아닌 일반 메서드는 
		// instance변수 a와 마찬가지로 객체가 선언된 이후에나 사용이 가능하기 때문에
		// 현재 a도, me2메서드도 활성화가 되어있지 않기 때문에
		// 오류가 생기지 않음
		// 어짜피 객체 없어서 실행 못함
		System.out.println(a);
		System.out.println(Test.b);
	}
	
	public static void me1() {
	// static 메서드는 불러오는 동시에 이미 활성화가 되어있기 때문에
	// 객체가 없이 쓰여진 a는 활성화가 되지 않아 사용될 수 없다.
		// a는 instance변수이기 때문에 쓰려면 객체를 만들어줘야 한다
		//System.out.println(a); => 오류 발생
		
		Test t1 = new Test();
		// instance변수 a를 쓰기 위해 객체를 설정
		System.out.println(t1.a);
		System.out.println(Test.b);
		// instance변수 a는 객체가 없으면 사용할 수 없다.
		// static변수인 b는 객체가 없어도 사용할 수 있기 때문에
		// 오류가 발생하지 않음 
		
	}
	
	// static 변수를 사용하는 이유 => 보안이 중요할 때 사용함
	

}

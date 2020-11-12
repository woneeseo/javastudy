package com.naver;

public class Test {
	
	public void me5() {
		String msg = "h";
		char c = msg.charAt(0);
		System.out.println(c);
		// char 는 charAt() 매서드를 이용한다.
	}
	
	
	public void me41() {
		
		String msg = "false";
		boolean b = Boolean.parseBoolean(msg);
		System.out.println(b);
		
		// boolean c = Boolean.valueOf(msg);
		// valueOf 라는 메서드도 있으나 잘 사용하지 않음.
	}
	
	
	public void me4() {
		String msg = "123";
		int i = Integer.parseInt(msg);
		System.out.println(i+10);
		System.out.println(msg+10);
	}
	
	public void me3() {
		// auto unboxing
		boolean a = new Boolean(false);
		Character b = new Character('C');
		char bb = b;
		// 자동으로 객체에서 풀려나는 것
		
	}
	
	public void me2() {
		
		// 기본자료형의 wrapper class의 자료형
		// 기본자료형에 객체를 부여해주는 wrapper class이다
		// 자바 컬렉션 프레임워크에서는 참조자료형으로 만든
		// 객체만 사용이 가능하기 때문에
		// new 객체를 만들어 줄 수 없는 기본자료형은
		// 래퍼클래스를 통해 auto boxing 해 준다. (객체화 한다)
		
		
		Boolean a = false;
		Character b = ' ';
		Byte c = 0;
		Short d = 0;
		Integer e = 0;
		Long f = 0L;
		Float g = 0.0F;
		Double h = 0.0;
		
		
	}
	
	public void me1() {
		
		boolean a = false;
		char b =' ';
		byte c = 0;
		short d = 0;
		int e = 0;
		long f = 0L;
		float g = 0.0F;
		double h = 0.0;
		
	}

}

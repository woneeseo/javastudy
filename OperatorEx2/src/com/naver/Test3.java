package com.naver;

public class Test3 {
	private int a;
	private int b;
	
	public Test3() {
		a = 0;
		b = 0;
	}
	
	public void plus21() {
		System.out.println(b++);
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void plus2() {
		System.out.println(b);
		b++;
		// 변수 뒤에 ++이 오면 다음 호출시에 +1된 값이 반영됨 => 현재까지는 0임
		System.out.println(b);
		// b가 호출 되어서 이제 값이 1이 됨
		
	}
	
	public void plus1() {
		System.out.println(a);
		++a;
		// 변수 앞에 ++이 있을 경우에는 
		// +1 값이 바로 반영됨
		System.out.println(a);
	}
	
	public void plus11() {
		System.out.println(++a);
		// a가 1씩 증가함
		
	}
	
	public void minus1() {
		System.out.println(--a);
		// a가 1씩 감소함
	}

}

package com.naver;

public class Test2 {
	
	int a = 1;
	
	public void switchAl() {
		a = 1-a;
		System.out.println(a);
	// ����ġ �˰��� (0,1�� ������ ��µǴ� �޼���)	
	}
	
	public void s5() {
		int a = 3;
		int b = 4;
		
		a %= b;
		// a = a % b; a�� b�� ���� ���� �������� a�� ����
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void s4() {
		int a = 3;
		int b = 4;
		
		a /= b;
		// a = a / b; a�� b�� ���� ���� ���� a�� ����
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	public void s3() {
		int a = 3;
		int b = 4;
		
		a *= b;
		// a = a * b;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void s2() {
		int a = 3;
		int b = 4;
		
		a -= b;
		// a = a - b;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void s12() {
		
		int a = 3;
		int b = 4;
		
		b += a;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void s1() {
		int a = 3;
		int b = 4;
		
		a += b;
		System.out.println(a);
		System.out.println(b);
		
	}

}

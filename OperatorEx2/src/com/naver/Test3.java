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
		// ���� �ڿ� ++�� ���� ���� ȣ��ÿ� +1�� ���� �ݿ��� => ��������� 0��
		System.out.println(b);
		// b�� ȣ�� �Ǿ ���� ���� 1�� ��
		
	}
	
	public void plus1() {
		System.out.println(a);
		++a;
		// ���� �տ� ++�� ���� ��쿡�� 
		// +1 ���� �ٷ� �ݿ���
		System.out.println(a);
	}
	
	public void plus11() {
		System.out.println(++a);
		// a�� 1�� ������
		
	}
	
	public void minus1() {
		System.out.println(--a);
		// a�� 1�� ������
	}

}

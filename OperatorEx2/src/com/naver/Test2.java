package com.naver;

public class Test2 {
	
	private int a=0;
	private boolean b=false;
	
	public void k1(boolean a, boolean b) {
		boolean result = a && b;
		// ���꿡 ������ �����Ͱ� ���� true�� ��쿡�� true���� ��µȴ�.
		// �ϳ��� false�� ������ false���� ��ȯ��
		System.out.println(result);
	
	}
	
	public void k2(boolean a, boolean b) {
		 boolean result = a || b ;
		 System.out.println(result);
		 // ���꿡 ������ �������� �ϳ��� true ���� true���� ����Ѵ�.
		
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
		// ���� ���� ����
		// ���� a = true; �� ��쿡 !a �� �����ϸ�
		// a�� ���� false�� �ȴ�.
	}
	
	public void switchInt() {
		a = 1-a;
		System.out.println(a);
		// 0�� 1�� �ݺ��ϴ� ����ġ �޼���
	}
	
	public void switchBoolean() {
		b = !b;
		System.out.println(b);
		// true�� false�� �ݺ��ϴ� ����ġ �޼���
		
	}

}

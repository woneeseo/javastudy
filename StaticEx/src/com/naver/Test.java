package com.naver;

public class Test {
	
	public int a;
	public static int b;
	
	public void me2() {
		// static�� �ƴ� �Ϲ� �޼���� 
		// instance���� a�� ���������� ��ü�� ����� ���Ŀ��� ����� �����ϱ� ������
		// ���� a��, me2�޼��嵵 Ȱ��ȭ�� �Ǿ����� �ʱ� ������
		// ������ ������ ����
		// ��¥�� ��ü ��� ���� ����
		System.out.println(a);
		System.out.println(Test.b);
	}
	
	public static void me1() {
	// static �޼���� �ҷ����� ���ÿ� �̹� Ȱ��ȭ�� �Ǿ��ֱ� ������
	// ��ü�� ���� ������ a�� Ȱ��ȭ�� ���� �ʾ� ���� �� ����.
		// a�� instance�����̱� ������ ������ ��ü�� �������� �Ѵ�
		//System.out.println(a); => ���� �߻�
		
		Test t1 = new Test();
		// instance���� a�� ���� ���� ��ü�� ����
		System.out.println(t1.a);
		System.out.println(Test.b);
		// instance���� a�� ��ü�� ������ ����� �� ����.
		// static������ b�� ��ü�� ��� ����� �� �ֱ� ������
		// ������ �߻����� ���� 
		
	}
	
	// static ������ ����ϴ� ���� => ������ �߿��� �� �����
	

}
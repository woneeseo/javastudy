package com.naver;

public class Test4 {
	private int a;
	private int b;
	
	public Test4() {
		a = 4;
		b = 11;
		
	}
	
	public int me1() {
		return 3;
	}
	
	public void me2() {
		System.out.println(44);
		
	}
	// con5 �޼���
	// ����c�� �������� �Ķ���͸� �Ѱ� �޾Ƽ�,
	// � �л��� ������ 90�� �̻��� ��, A
	// 80�� �̻� 90�� �̸��� ��, B
	// 70�� �̻� 80�� �̸��� ��, C
	// 60�� �̻� 70�� �̸��� ��, D
	// 60�� �̸��� ��� F�� ������ ������
	// ���� c�� �����Ͻÿ�.
	
	public void con5(int score){
		char c = score >= 90 ? 'A' 
				: score >=80 ? 'B' 
						: score >=70 ? 'C' 
								: score >= 60 ? 'D' 
										: 'F';
		// false �� ���� ������ �ʿ��� ����ؼ� ���׿����ڸ� ���� �� ����.
		System.out.println(c);						
		
		
	}
	public void con4() {
		// con4 �޼���
		// ���� c�� a�� b�� 2�� ���� �� ���� ������ me1() �̶�� �޼��带 ������ ������
		// �׷��� ������ a�� ������ ������.
		// ���� c�� �����Ͻÿ�.
		int c = a < b*2 ? me1() : a;
		
	}
	public void con1() {
		// con1 �޼���
		// ���� c�� a�� b���� ũ�ų� ������ 'a', �׷��� ������ 'z'�� ���´�.
		// ���� c�� �����Ͻÿ�.
		
		char c = a >= b ? 'a' : 'z';
		
	}
	
	public void con2() {
		// con2 �޼���
		// ���� c�� a�� b���� �� ������ new String("hello")
		// �׷��� ������ new String("no")�� ���´�.
		// ���� c�� �����Ͻÿ�.
		
		String c = a != b ? new String("hello") : new String("no");
	}
	
	public void con3() {
		// con3 �޼���
		// ���� c�� a�� b���� �۰ų� ������ new StringBuffer("hello")
		// �׷��� ������ new StringBuffer("no")�� ���´�.
		// ���� c�� �����Ͻÿ�.
		
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
	}
	
	public void printScore(int grade) {
		char c = grade <= 10 ? '��' : grade <= 20 ? '��' : grade <=35 ? '��' : grade <=45 ? '��':'��';
		System.out.println(c);
		
	}
	
	

}

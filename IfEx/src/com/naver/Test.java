package com.naver;
// 10�� 29�� if�� 
public class Test {
	public char me7(int score) {
		// score�� 90 �̻��̸� '��'
		// �׷��� �ʰ� 80�̻��̸� '��'
		// �׷��� �ʰ� 70�̻��̸� '��'
		// �׷��� �ʰ� 60�̻��̸� '��'
		// �׷��� ������ '��' �� ��ȯ�Ͽ���.
		if(score >= 90) {
			// char result = '��'; �� �ʱ�ȭ�� ���� ��
			// result ��� ������ ���°͵� ����
			// �� ������ 
			// ������ else�� �ڿ��� result�� return���ָ� ��
			return '��';
		}else if(score >= 80) {
			return '��';
		}else if(score >=70) {
			return '��';
		}else if(score >=60) {
			return '��';
		}else {
			return '��';
		}
		
	}
	
	public void me6(int a) {
		// a�� 2�� ����̸� sysout(2);
		// �׷��� �ʰ� 3�� ����̸� sysout(3);
		// �׷��� �ʰ� 5�� ����̸� sysout(5);
		// �׷��� ������ sysout(0);
		if( a % 2 == 0) {
			System.out.println(2);
		}else if( a % 3 == 0){
			System.out.println(3);
		}else if( a % 5 == 0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		} //���� if��
	}
	
	public void me5(int x) {
		// x�� 0���� ������ 3
		// �׷��� ������ -3
		if(x < 0) {
			System.out.println(3);
		}else {
			System.out.println(-3);
		}
	}
	
	public String me4(int a) {
		// a�� 10���� �۰ų� ������ 
		// return "ok"; �׷��� ������ return "no";
		if(a <= 10) {
			return "OK";
		}else {
			return "NO";
		}
		
	}
	// �ܼ� if��
	public void me1() {
		int a = 10;
		// a �� 5�� ����̸� sysout(5);
		if(a%5 == 0) {
			System.out.println(5);
		}
	}
	
	public void me2(int a) {
		// a �� 5�� ����̸鼭 6�� ����̸� sysout(30);
		if(a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}	
	}
	
	public void me3(int a) {
		// a�� 4�� �ƴϸ� sysout(true);
		if(a != 4) {
			System.out.println(true);
		}
		
	}

}

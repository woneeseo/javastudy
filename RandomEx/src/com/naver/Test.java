package com.naver;

import java.util.Random;

public class Test {
	
	// random class
	
	public void me6() {
		Random rnd1 = new Random(3);
		Random rnd2 = new Random(3);
		
		int num1 = rnd1.nextInt(10000);
		int num2 = rnd2.nextInt(10000);
		
		System.out.println(num1 == num2);
		// �����ϸ� true���� ���´�.
		// seed�� ���� �̻� ����Ŭ������ �ټ��� ������ ����� ������ѵ�
		// ���� ����. (���� ������ ����ǥ�� �̿��ϱ� ������)
		System.out.println(num2);
		
		
	}
	
	public void me5(int start, int end) {
		// start~end ������ �ִ� ���ڰ� ���Ƿ� �������� ���α׷��� �ϼ���
		Random ran = new Random();
		int num = ran.nextInt(end-start+1)+start;
		System.out.println(num);
	}
	
	
	public void me4() {
		// ������ ���� ������ 3~10������ ���ڰ� �ǵ��� ���α׷��� �ϼ���
		Random ran = new Random();
		for(int i=3; i<11; i++) {
			int num = ran.nextInt(8)+3;
			System.out.println(num);
		}
		
	}
	
	public void me3() {
		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			int num = ran.nextInt(100);
			System.out.println(num);
		}
		
	}
	
	
	public void me2() {
		Random ran = new Random(System.currentTimeMillis());
	}
	
	
	public void me1() {
		Random rnd = new Random();
		
	}

}

package com.naver;


public class Test {
	
	
	public void halfDiamond() {
		int n =10;
		
		for (int i = 0; i < n; i++) {
			if(i<n/2) {
				me5(i+1);
			}else {
				me5(n-i-1);
			}
			
		}
	}
	
	
	
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		// 10���� 0���� ����	
		}
		
	}
	
	
	public void printStar(int n) {
		// *�� *����=*�ټ��� ����ϴ� �ݺ���
		for (int i = 0; i < n; i++) {
			me5(i+1);
		}
		
	}
	
	public void printStar() {
		// *�� *����=*�ټ��� ����ϴ� �ݺ���
		for (int i = 0; i < 5; i++) {
			me5(i+1);
		}
		
	}
	
	
	public void gugudan() {
		// 2�ܺ��� 9�ܱ��� ������ ��ü�� ���� �ݺ���
		for (int i = 2; i <10; i++) {
			System.out.println(i+"��-------");
			dan(i);
			// ������ �� ���� �� �� �ִ� dan �޼��带 �̿���
			// dan �޼��� �ȿ� for���� ���ԵǾ� ����
			// ���� for���� 
		}
	}
	// * n���� ���� �ݺ���
	public void me5(int a) {
		for(int i =0; i<a; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	// * 10���� ���� �ݺ���
	public void me5() {
		for(int i = 0; i<10; i++) {
				System.out.print("*");
		}
		System.out.println();
		
	}
	// �Ҽ��� ���� �ݺ���
	// �Ҽ��� �ƴ� ��쿡�� "�Ҽ��� �ƴմϴ�."�� ���
	public void isSosu(int num) {
		for(int i = 2; i<num+1; i++) {
			if(num%i==0) {
				// num�� �Ҽ��Դϴٸ� ����� ���,
				// 1. i�� num�� ��������� num�� �ƴ� ��Ȳ => num�� �Ҽ��ƴ�
				// 2. i == num; : �Ҽ�
				if(i == num){
					System.out.println("�Ҽ��Դϴ�.");
				}else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				}
			}
		}
		
	}
	// �������� ���� �ݺ���
	public void dan(int dan) {
		for(int i =1; i<10; i++) {
			int a = dan*i;
			System.out.println(dan+"x"+i+"="+a);
		}
		
	}
	// 0���� n���� �� �߿� Ȧ������ ���� �ݺ���
	public void me4(int n) {
		for(int i =0; i<n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
		
	}
	// 0���� 100���� �� �߿� Ȧ������ ���� �ݺ���
	public void me4() {
		for(int i = 0; i<51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
		
	}
	// 0���� 100���� �� �߿� ¦������ ���� �ݺ���
	public void me3() {

		for(int i=0; i<51 ; i++) {
			
			int a = i* 2;
			
			System.out.println(a);
		}
		
	}
	// 0���� 100���� ���ڸ� ���� �ݺ���
	public void me2() {
		for(int i =0; i<101; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void me1() {
		for(int i=0; i<10; i++) {
			System.out.println("hello world");
		}
		// i�� 0���� �����ؼ� 
		// i�� 10���� �۳�? -> 0�̴ϱ� ���� -> true
		// �߰�ȣ ���� �����ڵ� ����
		// ������
		// ���ǽ����� ���� ��
		// i�� 10���� �۳�? -> 1�̴ϱ� ���� -> true
		// �߰�ȣ ���� �����ڵ� ����...
		// i�� 10���� ���� ���� ��(i>=10)���� �ݺ��ϴٰ�
		// i�� 10�� �Ǹ� �ݺ����� ����������
	}

}

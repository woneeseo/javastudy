package com.naver;

public class Test2 {
	
	public void name() {
		for( int i = 0; i <10 ; i++){
			System.out.println("hello world");}

	}
	
	public void me1() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		
	}
	
	public void me2() {
		for (int i = 0; i <51 ; i++) {
			int a = i*2;
			System.out.println(a);
		}
	}
	
	public void me3() {
		for (int i = 0; i < 51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void me3(int n) {
		for (int i = 0; i < n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
	}
	
	public void gugudan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" x "+i+" = "+(dan*i));
		}
	}
	
	public void isSossu(int n) {
		for (int i = 2; i < n+1; i++) {
			// �Ҽ��� ���� -> 1�� �ڱ� �ڽ����θ� ������ �������� ��
			// ����������� => �������� 0
			// �������� 0�� �Ǵ� �ֵ��߿��� �Ҽ��� �ƴ� �ֵ鵵 ����
			// 1. �������� 0�̳� �ƴϳ�
			// 2. �������� 0�̸� ��������� ���� �ڱ� �ڽ����� ������ �������ų�
			// (�����ؼ� 1�� �ڱ��ڽ����θ� ������ �������ٰ� ���µ�
			// i�� 2���� ���������ϱ� �Ҽ��� i = n �̾�)
			if(n%i==0) {
				if(i == n) {
					System.out.println("�Ҽ��Դϴ�.");
				}else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				}
			}
		}
	}
	
	
	public void me4() {
		for (int i = 0; i < 10; i++) {
			System.out.print('*');
		}
	}
	
	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}System.out.println();
	}
	
	public void gugudanDa() {
		for (int i = 2; i < 10; i++) {
			System.out.println("----"+i+" ��----");
			gugudan(i);
			System.out.println();
			
		}
		
	}
	
	public void halfDiamond() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			if(i<n/2) {
				me4(i+1);
			}else {
				me4(n-i-1);
			}
		
		}
		
	}
	
	public void me7(int n) {
		
		for (int i = 0; i < n; i++) {
			if(i<n/2) {
				me4(i+1);
			}else {
				me4(n-i-1);
			}
		}
	}
	
	public void dan(int dan) {
		for(int i = 1; i<9; i++) {
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
	}
	
	public void gugu() {
		for(int i =2; i<10; i++) {
			System.out.println("----"+i+"��----");
			dan(i);
			System.out.println();
		}
	}
	
	public void star(int n) {
		for(int i =0; i<n; i++) {
			System.out.print("��");
		}System.out.println();
	}
	
	public void starTriangle(int a) {
		
		
		for (int i = 0; i < a; i++) {
			if(i<a/2) {
				star(i+1);
			}else {
				star(a-i-1);
			}
		}
	}
	
	
	public void isSosu(int a) {
		for(int i = 2; i<a+1; i++) {
			if(a%i==0) {
				if(a==i) {
					System.out.println("�Ҽ�");
				}else {
					System.out.println("�Ҽ��� �ƴ�");
					break;
				}
			}
		}
	}
	
	
}

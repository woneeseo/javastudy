package com.naver;

public class WhileEx {
	
	public void me1() {
		// 0���� 100������ ����� �� ����
		int i = 0;
		while(i<101){
			System.out.println(i);
			i++;
		}
	}
	
	public void me11() {
		// 100���� 0������ ����� �� ����
		int i = 100;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}
	
	public void me2() {
		// 0 2 4.. 46���� ¦���� ����ϱ�
		int i = 0;
		while(i<47) {
			System.out.println(i);
			i = i+2;
		}
	}
	
	public void me22() {
		// 1 3 5 .. 45���� Ȧ���� ����ϱ� 
		int i = 1;
		while(i<47) {
			System.out.println(i);
			i +=2;
		}
		
	}
	
	public void me21() {
		// 99���� 21���� Ȧ���� ����ϱ� 
		int i = 99;
		while(i>=21) {
			System.out.println(i);
			i-=2;
		}
	}
	
	public void me211() {
		int i = 99;
		while(i>=21) {
			
			if(i%2==0) {
				continue;
			}
			
			System.out.println(i);
			i--;
		
		}
	}
	
	
	public void dan(int dan) {
		int i = 1;
		while(i<10) {
			StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append(" x ");
			sb.append(i);
			sb.append(" = ");
			sb.append(dan*i);
			String m = sb.toString();
			System.out.println(m);
			
			i++;
			
		}
	}
	
	public void me3() {
		int i =0;
		while(i<10) {
			System.out.print('*');
			i++;
		}
	}
	
	public void me31(int n) {
		int i = 0;
		while(i<n) {
			System.out.print('*');
			i++;
		}System.out.println();
	}
	
	public void gugudan() {
		int i = 2;
		while(i<10) {
			System.out.println("-----"+i+"��-----");
			dan(i);
			i++;
		}
	}
	
	public void printStar(int n) {
		int i = 0;
		while(i<n) {
			me31(i+1);
			i++;
		}
	}
	
	public void printPibo() {
		int a = 1;
		int b = 1;
		
		for(int i =0; i<15; i++) {
			int c = a+b;
			System.out.println(c);
			
			a = b;
			b = c;
			
		}
	}
	
	public void me() {
		
		int i = 0;
		while(i<27337) {
			if(i%3==00) {
				System.out.println(i);
			}
			
			i++;
		}
		
	}
	
	public void me369(int n){
		for(int i = 1; i<n; i++) {
			if(i%3==0) {
				continue;
				
			}else {
				System.out.println(i);
			}
		}
	}
	

}
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
			// 소수의 조건 -> 1과 자기 자신으로만 나누어 떨어지는 수
			// 나누어떨어진다 => 나머지가 0
			// 나머지가 0이 되는 애들중에는 소수가 아닌 애들도 있음
			// 1. 나머지가 0이냐 아니냐
			// 2. 나머지가 0이면 나누어떨어진 수가 자기 자신으로 나누어 떨어진거냐
			// (시작해서 1과 자기자신으로만 나누어 떨어진다고 헀는데
			// i를 2부터 시작했으니까 소수면 i = n 이야)
			if(n%i==0) {
				if(i == n) {
					System.out.println("소수입니다.");
				}else {
					System.out.println("소수가 아닙니다.");
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
			System.out.println("----"+i+" 단----");
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
			System.out.println("----"+i+"단----");
			dan(i);
			System.out.println();
		}
	}
	
	public void star(int n) {
		for(int i =0; i<n; i++) {
			System.out.print("★");
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
					System.out.println("소수");
				}else {
					System.out.println("소수가 아님");
					break;
				}
			}
		}
	}
	
	
}


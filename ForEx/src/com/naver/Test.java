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
		// 10부터 0까지 찍어내기	
		}
		
	}
	
	
	public void printStar(int n) {
		// *을 *갯수=*줄수로 출력하는 반복문
		for (int i = 0; i < n; i++) {
			me5(i+1);
		}
		
	}
	
	public void printStar() {
		// *을 *갯수=*줄수로 출력하는 반복문
		for (int i = 0; i < 5; i++) {
			me5(i+1);
		}
		
	}
	
	
	public void gugudan() {
		// 2단부터 9단까지 구구단 전체를 찍어내는 반복문
		for (int i = 2; i <10; i++) {
			System.out.println(i+"단-------");
			dan(i);
			// 구구단 한 단을 찍어낼 수 있는 dan 메서드를 이용함
			// dan 메서드 안에 for문이 포함되어 있음
			// 다중 for문임 
		}
	}
	// * n개를 찍어내는 반복문
	public void me5(int a) {
		for(int i =0; i<a; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	// * 10개를 찍어내는 반복문
	public void me5() {
		for(int i = 0; i<10; i++) {
				System.out.print("*");
		}
		System.out.println();
		
	}
	// 소수를 찍어내는 반복문
	// 소수가 아닐 경우에는 "소수가 아닙니다."를 출력
	public void isSosu(int num) {
		for(int i = 2; i<num+1; i++) {
			if(num%i==0) {
				// num이 소수입니다를 출력할 경우,
				// 1. i가 num의 약수이지만 num은 아닌 상황 => num은 소수아님
				// 2. i == num; : 소수
				if(i == num){
					System.out.println("소수입니다.");
				}else {
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
		}
		
	}
	// 구구단을 찍어내는 반복문
	public void dan(int dan) {
		for(int i =1; i<10; i++) {
			int a = dan*i;
			System.out.println(dan+"x"+i+"="+a);
		}
		
	}
	// 0부터 n까지 수 중에 홀수만을 찍어내는 반복문
	public void me4(int n) {
		for(int i =0; i<n; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
		
	}
	// 0부터 100까지 수 중에 홀수만을 찍어내는 반복문
	public void me4() {
		for(int i = 0; i<51; i++) {
			int a = i*2+1;
			System.out.println(a);
		}
		
	}
	// 0부터 100까지 수 중에 짝수만을 찍어내는 반복문
	public void me3() {

		for(int i=0; i<51 ; i++) {
			
			int a = i* 2;
			
			System.out.println(a);
		}
		
	}
	// 0부터 100까지 숫자를 찍어내는 반복문
	public void me2() {
		for(int i =0; i<101; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void me1() {
		for(int i=0; i<10; i++) {
			System.out.println("hello world");
		}
		// i는 0부터 시작해서 
		// i가 10보다 작냐? -> 0이니까 작지 -> true
		// 중괄호 안의 실행코드 실행
		// 증감식
		// 조건식으로 가서 비교
		// i가 10보다 작냐? -> 1이니까 작지 -> true
		// 중괄호 안의 실행코드 실행...
		// i가 10보다 작지 않을 때(i>=10)까지 반복하다가
		// i가 10이 되면 반복문을 빠져나간다
	}

}

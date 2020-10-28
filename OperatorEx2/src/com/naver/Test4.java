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
	// con5 메서드
	// 변수c는 정수형의 파라미터를 넘겨 받아서,
	// 어떤 학생의 성적이 90점 이상일 때, A
	// 80점 이상 90점 미만일 때, B
	// 70점 이상 80점 미만일 때, C
	// 60점 이상 70점 미만일 때, D
	// 60점 미만일 경우 F를 값으로 가진다
	// 변수 c를 선언하시오.
	
	public void con5(int score){
		char c = score >= 90 ? 'A' 
				: score >=80 ? 'B' 
						: score >=70 ? 'C' 
								: score >= 60 ? 'D' 
										: 'F';
		// false 의 값을 가지는 쪽에는 계속해서 삼항연산자를 붙일 수 있음.
		System.out.println(c);						
		
		
	}
	public void con4() {
		// con4 메서드
		// 변수 c는 a가 b에 2를 곱한 값 보다 작으면 me1() 이라는 메서드를 값으로 가지고
		// 그렇지 않으면 a를 값으로 가진다.
		// 변수 c를 선언하시오.
		int c = a < b*2 ? me1() : a;
		
	}
	public void con1() {
		// con1 메서드
		// 변수 c는 a가 b보다 크거나 같으면 'a', 그렇지 않으면 'z'를 갖는다.
		// 변수 c를 선언하시오.
		
		char c = a >= b ? 'a' : 'z';
		
	}
	
	public void con2() {
		// con2 메서드
		// 변수 c는 a가 b보다 안 같으면 new String("hello")
		// 그렇지 않으면 new String("no")를 갖는다.
		// 변수 c를 선언하시오.
		
		String c = a != b ? new String("hello") : new String("no");
	}
	
	public void con3() {
		// con3 메서드
		// 변수 c는 a가 b보다 작거나 같으면 new StringBuffer("hello")
		// 그렇지 않으면 new StringBuffer("no")를 갖는다.
		// 변수 c를 선언하시오.
		
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
	}
	
	public void printScore(int grade) {
		char c = grade <= 10 ? '수' : grade <= 20 ? '우' : grade <=35 ? '미' : grade <=45 ? '양':'가';
		System.out.println(c);
		
	}
	
	

}

package com.naver;
// 10월 29일 if문 
public class Test {
	public char me7(int score) {
		// score가 90 이상이면 '수'
		// 그렇지 않고 80이상이면 '우'
		// 그렇지 않고 70이상이면 '미'
		// 그렇지 않고 60이상이면 '양'
		// 그렇지 않으면 '가' 를 반환하여라.
		if(score >= 90) {
			// char result = '수'; 로 초기화를 해준 뒤
			// result 라는 변수를 쓰는것도 좋음
			// 이 때에는 
			// 마지막 else문 뒤에서 result를 return해주면 됨
			return '수';
		}else if(score >= 80) {
			return '우';
		}else if(score >=70) {
			return '미';
		}else if(score >=60) {
			return '양';
		}else {
			return '가';
		}
		
	}
	
	public void me6(int a) {
		// a가 2의 배수이면 sysout(2);
		// 그렇지 않고 3의 배수이면 sysout(3);
		// 그렇지 않고 5의 배수이면 sysout(5);
		// 그렇지 않으면 sysout(0);
		if( a % 2 == 0) {
			System.out.println(2);
		}else if( a % 3 == 0){
			System.out.println(3);
		}else if( a % 5 == 0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		} //다중 if문
	}
	
	public void me5(int x) {
		// x가 0보다 작으면 3
		// 그렇지 않으면 -3
		if(x < 0) {
			System.out.println(3);
		}else {
			System.out.println(-3);
		}
	}
	
	public String me4(int a) {
		// a가 10보다 작거나 같으면 
		// return "ok"; 그렇지 않으면 return "no";
		if(a <= 10) {
			return "OK";
		}else {
			return "NO";
		}
		
	}
	// 단순 if문
	public void me1() {
		int a = 10;
		// a 가 5의 배수이면 sysout(5);
		if(a%5 == 0) {
			System.out.println(5);
		}
	}
	
	public void me2(int a) {
		// a 가 5의 배수이면서 6의 배수이면 sysout(30);
		if(a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}	
	}
	
	public void me3(int a) {
		// a가 4가 아니면 sysout(true);
		if(a != 4) {
			System.out.println(true);
		}
		
	}

}

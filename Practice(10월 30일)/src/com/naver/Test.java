package com.naver;

public class Test {
	
	public void me1(int a) {
		if(a % 5 == 0) {
			System.out.println(5);
		}
		
	}
	
	public void me2(int a) {
		if(a % 5 == 0 && a % 6 == 0) {
			System.out.println(30);
		}
	}
	
	public void me3(int a) {
		if(a != 4) {
			System.out.println("true");
		}
		
	}
	
	public String me4(int a) {
		if(a <= 10) {
			return "OK";
		}else {
			return "NO";
		}
	}
	// 다중if문
	public void me5(int a) {
		if(a % 2 == 0) {
			System.out.println(2);
		}else if(a % 3 == 0) {
			System.out.println(3);
		}else if(a % 5 == 0) {
			System.out.println(5);
		}else {
			System.out.println(0);
		}
	}
	
	public void printScore(int score) {
		if(score>=90) {
			System.out.println("수");
		}else if(score>=80) {
			System.out.println("우");	
			}else if(score>=70) {
				System.out.println("미");
			}else if(score>=60) {
				System.out.println("양");
			}else {
				System.out.println("가");
			}

	}
	// switch ~ case문
	
	public void printScore1(int score) {
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;

		default:
			System.out.println("가");
			break;
		}
		
	}
	
	public void printMonth(int month) {
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지 있습니다.");
			break;
		case 2:
			System.out.println("28일 까지 있습니다.");

		default:
			System.out.println("31일 까지 있습니다.");
			break;
		}
		// break 없이 case부분 마무리하기
		// 월의 수 처럼 동일한 결과를 내는 변수가 많다? => break 없이 써보자!
		
	}
	
	

}

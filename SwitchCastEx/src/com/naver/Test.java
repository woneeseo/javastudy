package com.naver;
// 10월 29일 switch ~ case 문
// 치환알고리즘과 누적알고리즘의 기초
public class Test {
	
	private int sum = 0;
	
	
	
	
	
	
	
	
	public void tt() {
		System.out.println("hello world");
		System.out.println("안녕하세요.");
		System.out.println("gooten");
	}
	
	
	public void func3() {
		tt();
		sum -= 3;
	}
	
	
	public void func2() {
		tt();
		sum *= 3;
	}
	
	
	
	public void func1() {
		tt();
		sum += 3;
		System.out.println(sum);
		
	}
	
	public void me9(int a) {
		// 누적 알고리즘
		// sum이라는 변수에 int a의 값을 더해 그 값을 누적하는 알고리즘
		// 연산자 += 사용 (좌항과 우항의 합을 우항에 대입한다)
		
		sum += a;
		System.out.println(sum);
		
	}
	
	public void me8(String a, String b) {
		// a라는 변수에 b의 값을 대입하고
		// b변수에는 a의 값을 대입하려고 한다
		// ==> 치환 알고리즘 
		// 가상의 변수를 하나 선언해서
		// a의 값을 대입해준다 => a와 동일한 값을 c도 갖게됨
		// b의 값을 a에 대입해준다 => b와 동일한 값을 a도 갖게 됨
		// c의 값을 b에 대입해준다 => a는 이미 b의 값을 갖고있게 되었기 때문에
		// a가 원래의 값을 가지고 있을 때 값을 복사해 넘겨준 c로부터
		// b가 값을 넘겨받는다
		
		String c = null;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		System.out.println(c);
		
	}
	
	public void me7(int score) {
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
	
	public void me6(int month) {
		// 달력
		// 1,3,5,7,8,10,12 =>31일까지
		// sysout("31일까지 있습니다.");
		// 2월은 sysout("28일까지 있습니다.");
		// 나머지는 30일 sysout("30일까지 있습니다.")
		System.out.println(month+"월은 ");
		
		switch (month) {
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지 있습니다.");
			break;
		case 2:
			System.out.println("28일 까지 있습니다.");
			break;
		default:
			System.out.println("31일 까지 있습니다.");
			break;
//		case 1:
//			System.out.println("31일까지 있습니다");
//			break;
//		case 2:
//			System.out.println("28일까지 있습니다.");
//			break;
//		case 3:
//			System.out.println("31일까지 있습니다.");
//			break;
//		case 4:
//			System.out.println("30일까지 있습니다.");
//			break;
//		case 5:
//			System.out.println("31일까지 있습니다.");
//			break;
//		case 6:
//			System.out.println("30일까지 있습니다.");
//			break;
//		case 7:
//			System.out.println("31일까지 있습니다.");
//		case 8:
//			System.out.println("31일까지 있습니다.");
//		case 9:
//			System.out.println("30일까지 있습니다.");
//		case 10:
//			System.out.println("31일까지 있습니다.");
//			break;
//		case 11:
//			System.out.println("30일까지 있습니다.");
//
//		default:
//			System.out.println("31일까지 있습니다.");
//			break;
		}
	}
	
	
//	public void me5(long a) {
	// switch case문에서는 long형의 변수를 받을 수 없다.
	// int, String, enum의 세가지 자료형만 사용할 수 있음
//		switch (a) {
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//	}
	
	
	
	
//	public void me4(int a) {
//		
//		switch (a) {
//		
//		int a = 10;
//		// switch와 case사이에는 변수선언, 초기화 x
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
	public void me31(int a) {
		int data = a/10;
		// 연산식을 data 값으로 받아서 사용할 수도 있다.
		switch (data) {
		case 1:
			System.out.println("10~19");
			break;

		default:
			break;
		}
	}
	
	public void me3(int a) {
		switch (a/10) {
		// 연산식을 변수 대신에 사용할 수도 있음
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}
		System.out.println("***********");
	}
	
	public void me2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);

		default:
			System.out.println(999);
			break;
		}
		System.out.println("@>-----");
	}
	
	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
		// a가 3이냐? 라고 묻는 연산임
		// switch case문에서는 == 연산만 가능하기 때문에!!!!
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;

		default:
			System.out.println("fine");
			break;
		}
		
	}

}

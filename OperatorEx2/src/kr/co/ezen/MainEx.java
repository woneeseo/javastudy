package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;
// 10월 28일 연산자 학습

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		// t1 은 Test 클래스의 객체(=인스턴스)
		// 하나의 설계도로 인스턴스를 여러개 만들어 낼 수 있음
		// 자동차 설계도 한장으로 자동차 100대를 만들 수 있는 것과 같음
		
		boolean result = t1.me1(3, 4);
		System.out.println(result);
		
		boolean result1 = t1.me2(300L, 400L);
		System.out.println(result1);
		
		// byte형 파라미터로도 오류 안나게 입력하는 법
		// 1. byte형 변수를 먼저 설정해주기
		// byte a = 3; / byte b = -5;
		// boolean result2 = t1.me4(3, -5);
		
		// 2. 명시적 형변환 ((자료형)이용)
		boolean result2 = t1.me4((byte)3,(byte)-5);
		// int형으로 표기되는 파라미터에 (byte)3 의 형식으로 입력하면
		// 파라미터 형식을 byte로 변경 할 수 있음.
		// 실무에서는 2번을 더 많이 쓴다. 
		// 정수의 기본형이 int기 때문에 byte형으로 파라미터를 줬어도
		// 따로 처리해주지 않는 이상 정수를 입력하면 int형으로 받는다.
		
		t1.me5((short)4, (short)9);
		
		t1.me6(true, false);
		
		System.out.println("@>---'---------");
		
		Test2 t2 = new Test2();
		
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		
		System.out.println();
		t2.k2(true, true);
		t2.k2(true, false);
		t2.k2(false, true);
		t2.k2(false, false);
		
		System.out.println("@>-->------");
		t2.k3(true);
		
		boolean e = false;
		t2.k3(e);
		
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		System.out.println();
		System.out.println();
		
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		
		
		System.out.println();
		Test3 t3= new Test3();
		t3.plus1();
		t3.plus11();
		System.out.println();
		
		t3.plus2();
		t3.plus21();
		
		System.out.println(t3.getB());
		
		t3.minus1();
		t3.minus1();
		
		Test4 t4 = new Test4();
		
		t4.con5(94);
		t4.con5(66);
		t4.con5(87);
		
		t4.printScore(5);
		t4.printScore(10);
		t4.printScore(25);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		Test5 t5 = new Test5();
		t5.h1();
		
		t5.h2();
		
		t5.h3();
		
		t5.h4();
		
		t5.h5(4);
		System.out.println("############");
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		t5.h6(3);
		t5.h6(4);
	}

}


package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		t1.a = 100;
		System.out.println(t1.a);
		
		Test.b = 500;
		System.out.println(Test.b);
		
		Test t2 = new Test();
		t2.a = 200;
		System.out.println(t2.a);
		
		System.out.println(Test.b);
		System.out.println();
		Test.me1();
		
		// static 변수는 객체가 몇개든 한번만 선언할 수 있다.

	}

}

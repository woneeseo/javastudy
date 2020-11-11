package com.naver;


		// 11월 11일 예외처리



import java.io.Serializable;
import java.util.ArrayList;


public class Test {

	
	public void me72(String msg) throws Exception {
		if (msg.equals("개새끼")) {
			throw new DoNotSwearException1("욕설 금지");
		}
			System.out.println(msg);
	} // 사용자 정의 Exception을 생성할 때,
	  //Exception 을 상속받게 되면 무조건 throws를 선언해야 한다. 
	
	
	
	public void me71(String msg) {
		if (msg.equals("개새끼")) {
			throw new DoNotSwearException2("욕설 금지");
		}
			System.out.println(msg);
	}// throw는 설정해놓은 오류가 발견되면 오류메세지를 출력하며 메서드를 멈춤
	
	
	
	public void me7(String msg) {
		if (msg.equals("개새끼")) {
			throw new RuntimeException("욕설 금지");
		}
			System.out.println(msg);
	}// throw는 설정해놓은 오류가 발견되면 오류메세지를 출력하며 메서드를 멈춤
	
	
	public void me61() {
		int a = 4;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			System.out.println("0으로 나누어서 예외처리가 되었습니다.");
			return;
		}finally {
			System.out.println("성공하든 실패하든 무조건 실행");
			System.out.println("return보다 더 강력하다. ");
		}// return이 있어도 finally문이 반드시 실행된다.
		
		System.out.println("me61() end.");
		// return을 만나 출력되지 않았음.
	}
	
	public void me6(int num) {
		
		int a = 4;
		try {
			System.out.println(a/num);
		} catch (Exception e) {
			System.out.println("0으로 나누면 안 됩니다.");
		}finally {
			System.out.println("성공하든/실패하든 반드시 실행되는 코드");
			System.out.println("return보다 더 강력하다.");
		}
		
		System.out.println("me6() end.");
	}
	
	
	
	
	
	public void me5(int idx) throws Exception {
		String msg = "hi";
		System.out.println(msg.charAt(idx));
		// throws 키워드를 입력해줌으로써 메인메서드에서 예외를 어떻게 처리할것인지
		// 오류메세지를 띄우게 됨

	}
	
	
	public void me4(int weaponIdx) {
		String[] arr = {"활", "검", "총"};
		try {
			System.out.println(arr[weaponIdx]);
		} catch (Exception e) {
			System.out.println("사용자가 잘못된 값을 입력했습니다.");
			// catch부 => 프로젝트를 의뢰하는 곳에서 지정해줌.
		}
	}
	
	public void me3() {
		Serializable t1 = new String("hello");
		Serializable t2 = new ArrayList<Object>();
		
		try {
			String msg = (String) t2;
			// try = exception이 발생하는 코드를 입력
		} catch (Exception e) {
			// 비정상적인 예외가 발생했다 => catch부의 실행식이 실행됨
			System.out.println("뭔가가 문제가 있지만 무시하겠음.");
		}
		// 예외가 없으면 try-catch문을 빠져가남
	}
	
	
	
	
	// me1, me2는 예외처리를 한 것이 아니라 오류를 수정한 것이다.
	
	public void me2() {
		int[] arr = {3,6,9};
		System.out.println(arr[arr.length-1]);
	}
	
	public void me1() {
		
		String msg = null;
		System.out.println(msg.length());
	}

}

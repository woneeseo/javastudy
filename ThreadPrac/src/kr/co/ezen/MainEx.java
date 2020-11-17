package kr.co.ezen;

import com.naver.Test1;
import com.naver.Test2;
import com.naver.Test3;

public class MainEx {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		
		t1.start();
		
		
		Test2 r2 = new Test2();
		Test3 r3 = new Test3();
		// test2/ test3은 Runnable인터페이스를 구현한 클래스이기 때문에
		// Thread가 아니다.
		// r2/ r3을 이용해서 Thread를 구현하기 위해서
		
		Thread t2 = new Thread(r2);
		// Target으로 Runnable형의 객체를 원하는
		// Thread 객체를 생성해, 위에서 생성한 Runnable 인터페이스를
		// 구현해서 만들어낸 객체를 넣어준다.
		
		t2.start();
		// 정상적으로 Thread 객체가 되었다.
		// Thread 객체가 아닌 경우 .start() 가 절대 실행되지 않는다.
		// r3.start(); -> 에러발생
		
		Thread t3 = new Thread(r3);
		t3.start();
		
		// Thread 만들기 세번째 방법
		// 익명의 내부클래스를 만들어서 Runnable 객체를 생성
		// 자동으로 overiding 된 run() 안에 실행내용을 입력
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("통신 사용중");
				// 익명의 내부클래스는 그냥 두면 절대 실행되지 않는다.
			}
		}).start();;
		// 맨 마지막 세미콜론 앞에 커서를 두고 .메서드명 방식으로 사용해야지
		// 실행되는 것을 확인할 수 있다. 
	}

}

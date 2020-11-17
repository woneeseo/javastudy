package com.naver;

public class Test2 extends Unit implements Runnable{
// unit 클래스를 상속하면서, runnable 인터페이스를 구현해 Thread를 만드는 방법
// 자바는 단일상속만 지원하기 때문에, Thread 클래스를 Unit 클래스와 함께 상속할 수 없음

	@Override
	public void run() {
	// Runnable인터페이스를 구현하면, unimplement메서드를 구현하라고 하는데
	// 생성하기를 누르면 run()이 자동으로 오버라이딩 된다.
	// 오버라이딩 된 run()에 실행하고자 하는 내용 입력
		
		for(int i=0; i<10; i++) {
			System.out.println("Test2 : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}

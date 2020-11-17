package com.naver;

public class Test1 extends Thread {
	// Thread 만들기 첫번째방법
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		me1();
	}
	// 반드시 run() 오버라이딩 할 것!
	// 안그럼 thread 실행 안됨
	
	public void me1() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Test1 : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}

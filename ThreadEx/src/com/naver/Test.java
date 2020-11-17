package com.naver;

public class Test extends Thread{
// thread 클래스를 상속시키고 -> run()를 오버라이딩
	@Override
	public void run() {
		// TODO Auto-generated method stub
		me1();
		// 실행시키고 싶은 메서드를 run메서드 안에 옮겨줌
	}

	public void me1() {
		for(int i=0; i<10; i++) {
			System.out.println("Test1 : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

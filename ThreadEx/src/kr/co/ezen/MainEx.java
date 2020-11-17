package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;

public class MainEx {

	public static void main(String[] args) {
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name);
//		// 현재 쓰레드의 이름을 확인할 수 있음 
		// 1. Test클래스를 Thread클래스로 만들었다 (extends Thread)
		// 2. Test클래스를 이용해서 Thread객체를 만들었다.(Test t1 = new Test();)
		// 3. Test클래스를 이용해서 Thread를 만들겠다.(t1.start();)
		// 4. 현재 Thread는 2가지가 존재함 (main Thread(t2) / 사용자 Thread(t1)
		
		
		System.out.println("main start");
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		// r3, r4 는 Runnable class임

		Thread t3 = new Thread(r3);
		// Runnable을 참조로 하는 Thread 객체가 생성됨
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("통신 등을 구현할 때, 자주 쓰는 스레드");
				
			}
		}).start();

	}

}

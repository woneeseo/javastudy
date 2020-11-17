package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread ct = Thread.currentThread();
		System.out.println(ct.getName());
		
		System.out.println("main start");
		
		Test t1 = new Test("문도");
		Test t2 = new Test("로봇");
		
		ZZZ t3 = new ZZZ(t1, "미니언");
				
		t1.start();
		t2.start();
		// Thread 생성과 동시에 runnable 상태가 됨
		
		// 문도 Thread / 로봇 Thread가 main Thread보다
		// 항상 먼저 dead가 되도록 하려면??
		// join() 사용
		// join()을 호출한 스레드는 다른 스레드보다 먼저 dead상태에 빠진다.
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// join() -> try catch 해줌
		
		// t1스레드가 t3스레드보다 먼저 dead상태가 되게하려면?
		// t3스레드의 영역에 먼저 dead상태로 만들고 싶은 스레드를
		// 스레드.join()->try~catch를 해준다.
	
	
		System.out.println("main end");
		
		

	}

}

package kr.co.ezen;

import com.naver.Sum;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		System.out.println("main start");
		Sum sum = new Sum();
		// 어차피 디폴트값이 0이기때문에 디폴트생성자 써도 됨 : 디폴트값 0
		
		// Test t1 = new Test(sum, 1, 10000);
		Test t1 = new Test(sum, 1, 5000);
		Test t2 = new Test(sum, 5001, 10000);
		// sum이라는 데이터를 공유하고 있기 때문에 
		// 동기화 문제가 발생한다
		// 문제가 발생하는 class에서 synchronized 로 동기화 해 문제를 해결해준다.
		
		t1.start();
		t2.start();
		// 1부터 10000까지의 누적 합
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum.getNum());
		System.out.println(sum.getTes());
		

	}

}

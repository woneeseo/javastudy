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
//		// ���� �������� �̸��� Ȯ���� �� ���� 
		// 1. TestŬ������ ThreadŬ������ ������� (extends Thread)
		// 2. TestŬ������ �̿��ؼ� Thread��ü�� �������.(Test t1 = new Test();)
		// 3. TestŬ������ �̿��ؼ� Thread�� ����ڴ�.(t1.start();)
		// 4. ���� Thread�� 2������ ������ (main Thread(t2) / ����� Thread(t1)
		
		
		System.out.println("main start");
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		// r3, r4 �� Runnable class��

		Thread t3 = new Thread(r3);
		// Runnable�� ������ �ϴ� Thread ��ü�� ������
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��� ���� ������ ��, ���� ���� ������");
				
			}
		}).start();

	}

}

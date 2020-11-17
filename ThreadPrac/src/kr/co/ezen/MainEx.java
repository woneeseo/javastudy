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
		// test2/ test3�� Runnable�������̽��� ������ Ŭ�����̱� ������
		// Thread�� �ƴϴ�.
		// r2/ r3�� �̿��ؼ� Thread�� �����ϱ� ���ؼ�
		
		Thread t2 = new Thread(r2);
		// Target���� Runnable���� ��ü�� ���ϴ�
		// Thread ��ü�� ������, ������ ������ Runnable �������̽���
		// �����ؼ� ���� ��ü�� �־��ش�.
		
		t2.start();
		// ���������� Thread ��ü�� �Ǿ���.
		// Thread ��ü�� �ƴ� ��� .start() �� ���� ������� �ʴ´�.
		// r3.start(); -> �����߻�
		
		Thread t3 = new Thread(r3);
		t3.start();
		
		// Thread ����� ����° ���
		// �͸��� ����Ŭ������ ���� Runnable ��ü�� ����
		// �ڵ����� overiding �� run() �ȿ� ���೻���� �Է�
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��� �����");
				// �͸��� ����Ŭ������ �׳� �θ� ���� ������� �ʴ´�.
			}
		}).start();;
		// �� ������ �����ݷ� �տ� Ŀ���� �ΰ� .�޼���� ������� ����ؾ���
		// ����Ǵ� ���� Ȯ���� �� �ִ�. 
	}

}

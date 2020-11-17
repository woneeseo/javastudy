package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread ct = Thread.currentThread();
		System.out.println(ct.getName());
		
		System.out.println("main start");
		
		Test t1 = new Test("����");
		Test t2 = new Test("�κ�");
		
		ZZZ t3 = new ZZZ(t1, "�̴Ͼ�");
				
		t1.start();
		t2.start();
		// Thread ������ ���ÿ� runnable ���°� ��
		
		// ���� Thread / �κ� Thread�� main Thread����
		// �׻� ���� dead�� �ǵ��� �Ϸ���??
		// join() ���
		// join()�� ȣ���� ������� �ٸ� �����庸�� ���� dead���¿� ������.
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// join() -> try catch ����
		
		// t1�����尡 t3�����庸�� ���� dead���°� �ǰ��Ϸ���?
		// t3�������� ������ ���� dead���·� ����� ���� �����带
		// ������.join()->try~catch�� ���ش�.
	
	
		System.out.println("main end");
		
		

	}

}

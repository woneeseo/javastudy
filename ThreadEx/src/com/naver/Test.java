package com.naver;

public class Test extends Thread{
// thread Ŭ������ ��ӽ�Ű�� -> run()�� �������̵�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		me1();
		// �����Ű�� ���� �޼��带 run�޼��� �ȿ� �Ű���
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

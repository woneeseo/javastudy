package com.naver;

public class Test2 extends Unit implements Runnable{
// unit Ŭ������ ����ϸ鼭, runnable �������̽��� ������ Thread�� ����� ���
// �ڹٴ� ���ϻ�Ӹ� �����ϱ� ������, Thread Ŭ������ Unit Ŭ������ �Բ� ����� �� ����

	@Override
	public void run() {
	// Runnable�������̽��� �����ϸ�, unimplement�޼��带 �����϶�� �ϴµ�
	// �����ϱ⸦ ������ run()�� �ڵ����� �������̵� �ȴ�.
	// �������̵� �� run()�� �����ϰ��� �ϴ� ���� �Է�
		
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

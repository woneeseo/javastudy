package com.naver;

public class Test1 extends Thread {
	// Thread ����� ù��°���
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		me1();
	}
	// �ݵ�� run() �������̵� �� ��!
	// �ȱ׷� thread ���� �ȵ�
	
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

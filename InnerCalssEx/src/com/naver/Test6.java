package com.naver;

public class Test6 {
	
	public Test6() {
		// ��¥ �͸��� ����Ŭ����. �ܺο��� ȣ���� �Ұ���.
		// ���� ���� ���� ����ϴ� �͸��� ���� Ŭ����
		// ����Ʈ ������ �ȿ� �͸��� ����Ŭ������ �����ߴ�.
		
		new Inter1() {
			// �޼��尡 �ϳ��� �������̽� -> functional interface
			
			@Override
			public void me1() {
				System.out.println("Test6�� me1�Դϴ�.");
				
			}
		}.me1(); /* ��ü�� ����� ��ٷ� �޼��带 �ҷ��ͼ� ����ϴ� ����*/
		// �ܺο��� ȣ���� �ȵǰ� ���� �������� �����ؼ� �����. 
		
	}

}

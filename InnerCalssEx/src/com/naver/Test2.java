package com.naver;

public class Test2 {
	// ����Ŭ����
	
	
	private String msg;
	private int price;
	
	public class MemberClass{
		// ��� ���� Ŭ����
		// �����ڳ� �޼���ó�� Ŭ���� ���ο� �ִ� Ŭ������ 
		// ��� ���� Ŭ������� �θ���. 
		// ����ϴ� ���� �� ������ ���Ӱ����Ҷ� ���� ��! 
		
		private int age;
		
		public void mc1() {
			
			
			System.out.println("mc1");
			// ����Ŭ�������� �޼��带 �����ؼ� �� ���� �ְ�.
			// ����Ŭ�������� ������ �����ϰų� getters and setters����
			// �޼��嵵 ����� ����� �����ϴ�.
			
			
			
			System.out.println(price);
			System.out.println(msg);
			me1();
			// ���� Ŭ������ ǰ���ִ� Ŭ������ �ʵ� �������� ������ �������̳� �ż������
			// ���� ��ü�� �������� �ʾƵ� ����Ŭ���� �ȿ��� ����� �����ϴ�.
			
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		// �Ϲ� Ŭ������ ���� ����� ��
		
	}
	
	public void me1() {
		
	}

}

package kr.co.ezen;

public class Test1 {
	
	public Test1() {
		System.out.println("��ü�� �����Ǿ����ϴ�.");
		
				
	}
	
	public Test1(long a) {
		
		this(); // ���� Ŭ���� ������ ����Ʈ �����ڸ� ȣ���� ��
		System.out.println(a);
	
	}
	
	public Test1(int a, int b) {
		System.out.println(111);
		System.out.println(a+b);
	}
	
	public void me1() {
		System.out.println("��ü�� �����Ǿ����ϴ�.");
		
	}

}

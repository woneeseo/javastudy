package com.naver;
// 10�� 29�� switch ~ case ��
// ġȯ�˰���� �����˰����� ����
public class Test {
	
	private int sum = 0;
	
	
	
	
	
	
	
	
	public void tt() {
		System.out.println("hello world");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("gooten");
	}
	
	
	public void func3() {
		tt();
		sum -= 3;
	}
	
	
	public void func2() {
		tt();
		sum *= 3;
	}
	
	
	
	public void func1() {
		tt();
		sum += 3;
		System.out.println(sum);
		
	}
	
	public void me9(int a) {
		// ���� �˰���
		// sum�̶�� ������ int a�� ���� ���� �� ���� �����ϴ� �˰���
		// ������ += ��� (���װ� ������ ���� ���׿� �����Ѵ�)
		
		sum += a;
		System.out.println(sum);
		
	}
	
	public void me8(String a, String b) {
		// a��� ������ b�� ���� �����ϰ�
		// b�������� a�� ���� �����Ϸ��� �Ѵ�
		// ==> ġȯ �˰��� 
		// ������ ������ �ϳ� �����ؼ�
		// a�� ���� �������ش� => a�� ������ ���� c�� ���Ե�
		// b�� ���� a�� �������ش� => b�� ������ ���� a�� ���� ��
		// c�� ���� b�� �������ش� => a�� �̹� b�� ���� �����ְ� �Ǿ��� ������
		// a�� ������ ���� ������ ���� �� ���� ������ �Ѱ��� c�κ���
		// b�� ���� �Ѱܹ޴´�
		
		String c = null;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		System.out.println(c);
		
	}
	
	public void me7(int score) {
		switch (score/10) {
		
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:	
			System.out.println("��");
			break;
			
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
	}
	
	public void me6(int month) {
		// �޷�
		// 1,3,5,7,8,10,12 =>31�ϱ���
		// sysout("31�ϱ��� �ֽ��ϴ�.");
		// 2���� sysout("28�ϱ��� �ֽ��ϴ�.");
		// �������� 30�� sysout("30�ϱ��� �ֽ��ϴ�.")
		System.out.println(month+"���� ");
		
		switch (month) {
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�� ���� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("28�� ���� �ֽ��ϴ�.");
			break;
		default:
			System.out.println("31�� ���� �ֽ��ϴ�.");
			break;
//		case 1:
//			System.out.println("31�ϱ��� �ֽ��ϴ�");
//			break;
//		case 2:
//			System.out.println("28�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 3:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 4:
//			System.out.println("30�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 5:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 6:
//			System.out.println("30�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 7:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//		case 8:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//		case 9:
//			System.out.println("30�ϱ��� �ֽ��ϴ�.");
//		case 10:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//			break;
//		case 11:
//			System.out.println("30�ϱ��� �ֽ��ϴ�.");
//
//		default:
//			System.out.println("31�ϱ��� �ֽ��ϴ�.");
//			break;
		}
	}
	
	
//	public void me5(long a) {
	// switch case�������� long���� ������ ���� �� ����.
	// int, String, enum�� ������ �ڷ����� ����� �� ����
//		switch (a) {
//		case 10L:
//			
//			break;
//
//		default:
//			break;
//		}
//		
//	}
	
	
	
	
//	public void me4(int a) {
//		
//		switch (a) {
//		
//		int a = 10;
//		// switch�� case���̿��� ��������, �ʱ�ȭ x
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
//	}
	
	public void me31(int a) {
		int data = a/10;
		// ������� data ������ �޾Ƽ� ����� ���� �ִ�.
		switch (data) {
		case 1:
			System.out.println("10~19");
			break;

		default:
			break;
		}
	}
	
	public void me3(int a) {
		switch (a/10) {
		// ������� ���� ��ſ� ����� ���� ����
		case 1:
			System.out.println("10~19");
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}
		System.out.println("***********");
	}
	
	public void me2(int a) {
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);

		default:
			System.out.println(999);
			break;
		}
		System.out.println("@>-----");
	}
	
	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
		// a�� 3�̳�? ��� ���� ������
		// switch case�������� == ���길 �����ϱ� ������!!!!
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;

		default:
			System.out.println("fine");
			break;
		}
		
	}

}

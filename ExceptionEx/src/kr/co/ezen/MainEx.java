package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		
		
		t1.me2();
		
		
		// try~catch
		t1.me3();
		t1.me4(100);
		
		// throws�� ȣ��� ������ try~catch�� ����
		try {
			t1.me5(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("100�� �Է��ߴ��� ������ �߻�����.");
		}// ������ ����� �����޼���+100�� �Է��ߴ��� ������ �߻�����.�� ���
		
		try {
			t1.me5(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// �����޼����� ����ִ� �޼���
			System.out.println("0�� �Է��ߴ��� ������ ������.");
		}// ������ �����Ƿ� h��� ����� �� ���� �������
		
		
		// try~catch~finally
		
		t1.me6(0);
		// finally���� �ִ� �ڵ�� �ݵ�� ����ȴ�.
		// ������ try~finally�� �ۿ� �Էµ� �ڵ�� ������� �ʴ´�
		// catch������ ����� return ������ �޼��带 ���������� ����
		t1.me61();
		System.out.println();
		
		// throw �����س��� ������ �߰ߵǸ� �����޼����� ����ϸ� �޼��带 ����
		t1.me7("hi");
		// t1.me7("������");
		
		// runtime exception�� ��ӹ��� ����� ���� ����ó����
		// �����޼����� ��µǸ� ����� ���������.
		// t1.me71("������");
		 
		// ����� ���� ����ó���� �� ��, Exception�� ����ϰ� �Ѵ�.
		// try~catch�� ���ָ� ������ �ʰ� ����Ǳ⶧����
		// ����� ���� ����ó���� �� ���� exception�� ��ӹ޴°��� ����.
		
		 try {
			t1.me72("������");
		} catch (Exception e) {
			System.out.println("�弳 ����");
		}
		
		 
		 t1.me71("������");
		 try {
			t1.me72("������");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		 
				

	}

}

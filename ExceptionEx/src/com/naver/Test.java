package com.naver;


		// 11�� 11�� ����ó��



import java.io.Serializable;
import java.util.ArrayList;


public class Test {

	
	public void me72(String msg) throws Exception {
		if (msg.equals("������")) {
			throw new DoNotSwearException1("�弳 ����");
		}
			System.out.println(msg);
	} // ����� ���� Exception�� ������ ��,
	  //Exception �� ��ӹް� �Ǹ� ������ throws�� �����ؾ� �Ѵ�. 
	
	
	
	public void me71(String msg) {
		if (msg.equals("������")) {
			throw new DoNotSwearException2("�弳 ����");
		}
			System.out.println(msg);
	}// throw�� �����س��� ������ �߰ߵǸ� �����޼����� ����ϸ� �޼��带 ����
	
	
	
	public void me7(String msg) {
		if (msg.equals("������")) {
			throw new RuntimeException("�弳 ����");
		}
			System.out.println(msg);
	}// throw�� �����س��� ������ �߰ߵǸ� �����޼����� ����ϸ� �޼��带 ����
	
	
	public void me61() {
		int a = 4;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			System.out.println("0���� ����� ����ó���� �Ǿ����ϴ�.");
			return;
		}finally {
			System.out.println("�����ϵ� �����ϵ� ������ ����");
			System.out.println("return���� �� �����ϴ�. ");
		}// return�� �־ finally���� �ݵ�� ����ȴ�.
		
		System.out.println("me61() end.");
		// return�� ���� ��µ��� �ʾ���.
	}
	
	public void me6(int num) {
		
		int a = 4;
		try {
			System.out.println(a/num);
		} catch (Exception e) {
			System.out.println("0���� ������ �� �˴ϴ�.");
		}finally {
			System.out.println("�����ϵ�/�����ϵ� �ݵ�� ����Ǵ� �ڵ�");
			System.out.println("return���� �� �����ϴ�.");
		}
		
		System.out.println("me6() end.");
	}
	
	
	
	
	
	public void me5(int idx) throws Exception {
		String msg = "hi";
		System.out.println(msg.charAt(idx));
		// throws Ű���带 �Է��������ν� ���θ޼��忡�� ���ܸ� ��� ó���Ұ�����
		// �����޼����� ���� ��

	}
	
	
	public void me4(int weaponIdx) {
		String[] arr = {"Ȱ", "��", "��"};
		try {
			System.out.println(arr[weaponIdx]);
		} catch (Exception e) {
			System.out.println("����ڰ� �߸��� ���� �Է��߽��ϴ�.");
			// catch�� => ������Ʈ�� �Ƿ��ϴ� ������ ��������.
		}
	}
	
	public void me3() {
		Serializable t1 = new String("hello");
		Serializable t2 = new ArrayList<Object>();
		
		try {
			String msg = (String) t2;
			// try = exception�� �߻��ϴ� �ڵ带 �Է�
		} catch (Exception e) {
			// ���������� ���ܰ� �߻��ߴ� => catch���� ������� �����
			System.out.println("������ ������ ������ �����ϰ���.");
		}
		// ���ܰ� ������ try-catch���� ��������
	}
	
	
	
	
	// me1, me2�� ����ó���� �� ���� �ƴ϶� ������ ������ ���̴�.
	
	public void me2() {
		int[] arr = {3,6,9};
		System.out.println(arr[arr.length-1]);
	}
	
	public void me1() {
		
		String msg = null;
		System.out.println(msg.length());
	}

}

package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;
// 10�� 28�� ������ �н�

public class MainEx {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		// t1 �� Test Ŭ������ ��ü(=�ν��Ͻ�)
		// �ϳ��� ���赵�� �ν��Ͻ��� ������ ����� �� �� ����
		// �ڵ��� ���赵 �������� �ڵ��� 100�븦 ���� �� �ִ� �Ͱ� ����
		
		boolean result = t1.me1(3, 4);
		System.out.println(result);
		
		boolean result1 = t1.me2(300L, 400L);
		System.out.println(result1);
		
		// byte�� �Ķ���ͷε� ���� �ȳ��� �Է��ϴ� ��
		// 1. byte�� ������ ���� �������ֱ�
		// byte a = 3; / byte b = -5;
		// boolean result2 = t1.me4(3, -5);
		
		// 2. ����� ����ȯ ((�ڷ���)�̿�)
		boolean result2 = t1.me4((byte)3,(byte)-5);
		// int������ ǥ��Ǵ� �Ķ���Ϳ� (byte)3 �� �������� �Է��ϸ�
		// �Ķ���� ������ byte�� ���� �� �� ����.
		// �ǹ������� 2���� �� ���� ����. 
		// ������ �⺻���� int�� ������ byte������ �Ķ���͸� ��
		// ���� ó�������� �ʴ� �̻� ������ �Է��ϸ� int������ �޴´�.
		
		t1.me5((short)4, (short)9);
		
		t1.me6(true, false);
		
		System.out.println("@>---'---------");
		
		Test2 t2 = new Test2();
		
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(false, true);
		t2.k1(false, false);
		
		System.out.println();
		t2.k2(true, true);
		t2.k2(true, false);
		t2.k2(false, true);
		t2.k2(false, false);
		
		System.out.println("@>-->------");
		t2.k3(true);
		
		boolean e = false;
		t2.k3(e);
		
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		System.out.println();
		System.out.println();
		
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		
		
		System.out.println();
		Test3 t3= new Test3();
		t3.plus1();
		t3.plus11();
		System.out.println();
		
		t3.plus2();
		t3.plus21();
		
		System.out.println(t3.getB());
		
		t3.minus1();
		t3.minus1();
		
		Test4 t4 = new Test4();
		
		t4.con5(94);
		t4.con5(66);
		t4.con5(87);
		
		t4.printScore(5);
		t4.printScore(10);
		t4.printScore(25);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		Test5 t5 = new Test5();
		t5.h1();
		
		t5.h2();
		
		t5.h3();
		
		t5.h4();
		
		t5.h5(4);
		System.out.println("############");
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		t5.h6(3);
		t5.h6(4);
	}

}


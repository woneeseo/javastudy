package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;
import com.naver.MethodTest4;


public class MainEx {
	
	public static void main(String[] args) {
		
		// MethodTest ���� ���� �ż��带 ����ϰ� ���� ��,
		// ���� MethodTest class�� ��ü�� �ϳ� ��������� �Ѵ�.
		
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		
		mt2.sitDown();
		mt2.callName("������");
		
		mt2.printDan(3);
		mt2.printScore(new String("ȫ�浿"),100);
		
		mt2.trueFalse("6+2=7", true);
		
		mt2.score("��浿", "��ȸ", '��');
		mt2.score("Ȳ���", "����", '��');
		
		mt2.guguDan(3);
		
		mt2.pai("������", 3.14);
		mt2.soccer("ȫ�浿", 6.5);
		
		mt2.testScore("ȫ��", "����", '��', 98);
		mt2.testScore("��ī��", "����", '��', 89);
		mt2.testScore("��Ŀ��", "����", '��', 50);
		mt2.testScore("�豸��", "����", '��', 42);
		
		Test12 m3 = new Test12();
		// Ŭ������� ���赵�� ����ϱ� ���ؼ��� �ǹ�(��ü)�� �������� �Ѵ�.
		// ��ü ������ ��������� ����� �� �ִ°ž�.
		
		m3.sayHello();
		m3.printScore("ȫ�浿", 100);
		
		System.out.println();
		
		m3.testScore("ȫ�浿", '��', 85);
		
		MethodTest2 m4 = new MethodTest2();
		
		int re1 = m4.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = m4.giveMeTheMoney();
		
		System.out.println(m4.giveMeTheMoney());
		// ����ȯ�̴ϱ� ����� ��
		System.out.println();
		// ����ȯ�̶� ��µ��� ����
		
		MethodTest3 mt7 = new MethodTest3();
		
		mt7.getTest12();
		
		Test12 re4 = mt7.getTest12();
		
		MethodTest4 mt8 = new MethodTest4();
		
		Test12 re5 = mt8.getTest12();
		
		mt8.getTest13();
		System.out.println(mt8.getTest13());
		
		int re8 = mt8.getTest13();
		
		System.out.println(re8);
		
		System.out.println(mt8.score(56));
		
		String re9 = mt8.name("�䲤", 80);
		System.out.println(re9);
		
		
		mt8.getboolean(true);
		
		boolean ac = mt8.getboolean(true);
		System.out.println(ac);
		
		char ab = mt8.getchar('��');
	
		System.out.println(ab);
		
		MethodTest4 mt0 = new MethodTest4();
		
		int cc = mt0.getint(165);

		System.out.println(cc);
		
		long dd = mt0.getlong(561231564561321654L);
		
		System.out.println(dd);
		
		double ee = mt0.getDouble(53445.23564);
		
		System.out.println(ee);
		
		mt0.getDog();
		
		System.out.println(mt0.getDog());
		
		float ff = mt0.getFloat(1234564.45645564F);
		
		System.out.println(ff);
		
		MethodTest4 m9 = new MethodTest4();
		
		m9.getTest15();
		
		System.out.println(m9.getTest15());
		
		Test12 ll = m9.getTest15();
		
		System.out.println(ll);
		
		MethodTest4 vv = new MethodTest4();
	
		// �Ķ���͸� ������ �����س����� ����ex���� ������ ����� ������ �� �ְ� ��
		// �������� �Ű������� �����ϰ� ������ ���߿� �迭���� ����ؾ� ��
		
		boolean gg = vv.getboolean(true);
		// ���� �������شٰ� �����ϸ� ��
		// gg = true; �� �����
		
		System.out.println("�̰��� ���̴� �� "+gg+"�̴�.");
		
		
		System.out.println("######################");
		MethodTest4 net = new MethodTest4();
		
		Dog d1 = net.getDog2();
		System.out.println(d1);
		System.out.println();
		MethodTest2 y = net.getM2();
		System.out.println(y);
		
		
		byte mm = net.getByte2((byte)127);
		
		System.out.println(mm);
		
		// �ֿܼ��� byte���� ȣ���ϰ� ������ �Ű�����â�� ((byte)����); �̷��� �����
		
		
		
	}

}

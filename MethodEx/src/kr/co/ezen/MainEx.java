package kr.co.ezen;

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
	
		
		
	
	}

}

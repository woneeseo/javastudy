package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		Method m = new Method();
		
		m.hello();
		
		System.out.println();
		
		m.score("ȫ�浿", "����", 89);
		m.score("���Ͻ�", "����", 95);
		m.score("���̽�", "����", 50);
		m.score("����", "��ȸ", 100);
		m.score("���䲤", "����", 100);
		m.score("�ں���", "ü��", 85);
		
		System.out.println();
		
		System.out.println("#######");
		
		System.out.println();
		
		m.printDan(15);
		
		System.out.println();
		
		m.melon();
		
		System.out.println();
		
		m.winnigScore("��ȭ�̱۽�", 3.454);
		
		System.out.println();
		
		m.hobby(new String("ȫ�浿"), new String("����"));
		m.hobby(new String("������"), new String("���ǰ���"));
		
		
		System.out.println();
		Method n = new Method();
		
		
		n.melon();
		
		System.out.println();
		
		n.testScore("����", '��');
		
		System.out.println();
		
		n.winnigScore("���", 2.445);
		
		System.out.println();
		
		n.fruitLike("�̰��", "����");
		
		System.out.println();
		
		n.testResult("ȫ�浿", "����", '��', 98);
		n.testResult("���䲤", "����", '��', 89);
		n.testResult("�ں���", "��ȸ", '��', 45);
		
		System.out.println();
		
		n.realFake("�̰��� ���̴�", true);
		n.realFake("�̰��� ���̴�", false);
		
		System.out.println();
		
		// �޼��� ����� MainEx�� ȣ���ϱ⸦ �����.
		// MainEx Ŭ������ �����, �߰��� Ŭ������ �ϳ� �� ����� MethodTest
		// MainEx Ŭ�������� main �Լ��� ������ְ�
		// MethodTest Ŭ�������� �����ڸ� �����
		// �����ڴ� public MethodTest(Ŭ�����̸�) () {}
		// ������ �� �ʵ忡 �޼��带 ������ش�.
		// �޼��� ����� ���� 
		//   public   void  �޼����̸� () {}
		// (����������) (��ȯ��)
		// �޼��� �̸� �� �Ұ�ȣ���� �Ķ���͸� �༭ ���ϴ� ���ǿ� �°� ������ �� �� ����
		
		
		// �޼��� ȣ���ϱ�
		// MainEx���� �޼��带 ȣ���Ϸ��� ��ü�� �ϳ� ���������Ѵ�.
		// MathodTest m = new MathodTest();
		// -Ŭ�����̸�- ������ = new �����ڸ� (); 
		// �����ڸ��� Ŭ���� �̸��� ����.
		
		Method g = new Method(); 
		
		// ������ ����������� ���� Mathod Ŭ������ �ִ� �޼��带 ȣ�� �� �� �ִ�.
		
		g.fruitLike("�ڶ���", "���");
		g.hello();
		
		System.out.println();
		
		g.test();
		g.test2(false);
	}

}
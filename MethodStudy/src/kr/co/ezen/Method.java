package kr.co.ezen;

public class Method {
	
	public Method() {
		
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
	public void score(String name, String text, int score) {
		System.out.println(name + "�� " + text + "������ " + score + "�� �̴�.");
	}
	
	public void printDan(int a) {
		System.out.println(a+"x1="+a*1);
		System.out.println(a+"x2="+a*2);
		System.out.println(a+"x3="+a*3);
		System.out.println(a+"x4="+a*4);
		System.out.println(a+"x5="+a*5);
		System.out.println(a+"x6="+a*6);
		System.out.println(a+"x7="+a*7);
		System.out.println(a+"x8="+a*8);
		System.out.println(a+"x9="+a*9);
	}
	
	public void melon() {
		System.out.println("���ִ� ���");
	}
	
	public void winnigScore(String team, double score) {
		System.out.println(team + "�� �̹����� ������ " + score + "�̴�.");
	}
	
	public void hobby(String name, String bb) {
		System.out.println(name + "�� ��̴� " + bb + "�̴�.");
		fruitLike(name, "���");
		
	}
	
	public void testScore(String text, char score) {
		System.out.println(text + " " + score );
	}
	
	public void fruitLike(String name, String fruit) {
		System.out.println(fruit + "�� " + name + "���� �����ϴ� �����̴�.");
		
	}
	
	public void testResult(String name, String text, char score1, int score2) {
		System.out.println(name + "�� " + text + "������ " + score1 + "�̰�, ������ ȯ���ϸ� " + score2 + "�� �̴�.");
	}
	
	public void realFake(String q, boolean a) {
		System.out.println(q + "�� " + a + "�̴�.");
	}
	
	
	// �ż��带 ���� ��, 
	// public (����������) void (��ȯ��) �ż����̸� (){}
	// �̷��� ����µ�
	// () �ȿ� �Ķ���͸� �ִ��� ���ִ��ķ� ���Ķ�/ ���Ķ� = ������� ������.
	// ����ȯ ���Ķ��� � Ŭ�������� ȣ��Ǿ ���� ������ �ʴ´�.
	
	public void test() {
		System.out.println("���� ������ �ʴ´�.");
	}
	// ����ȯ ���Ķ��� ȣ��� Ŭ�������� ���� �ֱ� ������ ���ϴ´�� �ٲ� �� �ִ�.
	
	public void test2(boolean c) {
		System.out.println("���� ������ �ʴ´� �� ���� " + c + "�̴�.");
	}
	
}
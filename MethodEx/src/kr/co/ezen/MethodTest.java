package kr.co.ezen;

public class MethodTest {
	
	int a;
	boolean b = true;
	
	
	public MethodTest() {
		
		
	}
	
	public void stand() {
		
		System.out.println("����ȯ ���Ķ� ���Ű�����");
		
		
	}
	
	public void sleep() {
		System.out.println("public : ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ�� �� �� ������ �ǹ���.");
		System.out.println("void : ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�. void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep : �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���������ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� �Ѵ�.");
		System.out.println("() : �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� �ȴ�. �Ķ���Ͱ� �ΰ� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{} : �޼����� ����. �޼��� ȣ�� �ÿ� �����ϰ� ���� �ڵ带 �ۼ�����.");
		System.out.println("�޼��� ȣ�� : �޼��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
	}
	
	
	
	public void sayHello() {
		
		System.out.println("Hello~");

	}
	
	
	public void sitDown() {
		
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
		
		
	}
	
	public void callName(String a) {
		
		System.out.println("�ȳ��ϼ���,"+a);
	}
	
	
	public void printDan(int e) {
		System.out.println(e+"x1="+e*1);
		System.out.println(e+"x2="+e*2);
		System.out.println(e+"x3="+e*3);
		System.out.println(e+"x4="+e*4);
		System.out.println(e+"x5="+e*5);
		System.out.println(e+"x6="+e*6);
		System.out.println(e+"x7="+e*7);
		System.out.println(e+"x8="+e*8);
		System.out.println(e+"x9="+e*9);
	}
	
	public void printScore(String name, int score) {
		System.out.println(name+ " " + score +" ��");
	}
	
	public void trueFalse(String it, boolean that) {
		System.out.println(it + " ��" + that + "�̴�.");
	}
	
	public void score(String name, String cl, char score) {
		System.out.println(name + "�� " + cl + "������ " + score + "�̴�.");
		
	}
	
	public void guguDan(int nb) {
		System.out.println(nb+"x1="+nb*1);
	}
	
	public void pai(String mm, double dd) {
		System.out.println(mm + "�� " + dd + "�̴�.");
	}
	
	public void soccer (String player, double score) {
		System.out.println(player + "�� �·��� " + score + "�̴�.");
	}
	
	public void testScore(String student, String text, char kk, int score) {
		System.out.println(student + "�� " + text + "������ " + kk + "�̰� ������ ȯ���ϸ� " + score + "�� �̴�.");
	}

}

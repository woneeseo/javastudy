package kr.co.ezen;

public class Cat {
	
	private String name;
	private int age;
	
	public Cat() {
		
	}
	// ����Ʈ�����ڿ��� ��������� ���� �ʱ�ȭ�����.
	// �׷� ���� name = ���䲤 / age = 23�̶�� ���� �� ����Ǵ°ž�
	// �� ������ Ŭ���� ��򰡿��� ȣ���ϸ� ���䲤, 23�̶�� ���� ��µǴ°���
	
	// �ٵ� ���� ������ �ٲٰ� ���� ���� ���ݾ�.
	// �׷� ����� �����ڸ� ����
	// ��������(�Ű�����)�� ����ؼ� ������ �������ָ� ��
	
	
	public Cat(String name) {
		this.name = name;
		
	}
	
	public Cat(int age) {
		this.age = age;
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// ���� ������ String ���� ������ int ���� ����
	// ���� name �� age�� �����ƾ� 

	
	// �ٵ� ��������� �� Ŭ���� �ȿ����� ���°� �ƴ϶�
	// ����� �ϰ� �Ϸ��� �ܺ� Ŭ���������� ������ ������ �����ϰ� �ؾ��ϴµ�
	// ����Ŭ�������� �� ������ ������ �ϸ� ������ ��
	// �ִ°� ������ �ҷ��� ���� ����, ���� �����ڸ� �� Ŭ���� ������ �����صױ� ������
	
	// �׷��� �ܺ� Ŭ���������� ��� ������ �����ϱ� ���ؼ�
	// get / set �޼��带 ����Ѵٴ� ���̾�.
	
	// Ŭ���� ȭ�� �ȿ��� ���콺 ������ Ŭ���ϸ�
	// source -> getters and setters -> sellect all ���ָ�
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// �̷��� get/set �޼��尡 �ڵ����� ���������
	// ���� �ܺ� Ŭ�������� ȣ�� �ؼ� ���� �ٲ� �� �ְ� �Ǿ���.
	
	
	public Cat makeCat(String name, int age) {
		return new Cat(name, age);
	}
		
}

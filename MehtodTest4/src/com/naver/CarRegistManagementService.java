package com.naver;

public class CarRegistManagementService {
	// ��������� 99.9% �ۺ�!
	private String carName;
	
	public CarRegistManagementService() {
		// ������ : ��������� �ʱ�ȭ �����. 
		carName = "�ҳ�Ÿ";
		// ����Ʈ �����ڷ� carName�� �ʱ�ȭ ���ָ� 
		// carName�� �׻� '�ҳ�Ÿ' �� ���´�. 
		
		// �ٵ� ��������� ���������ڸ� �����̺����� �س���
		// ���� ex���� �����ϴ� ���� ������ ������ �� ����.
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
		
		// �׷��� ��������� ����ex���� ������ְ� �;
		// ��������� ���������ڸ� �ۺ����� ������
		// carName �� ���� ex������ Ȯ���� �� �ֵ��� ���ش�
		
		// �ż��忡�� ���������� �Ű������� �����ϸ�
		// �� ���������� �Ű������� �켱�̱� ������
		// ���࿡ ��������� ���̳� ������ �����ϰ� ������
		// this.������� = ���� 
		// �� ����������Ѵ�.
		
	}
	
	public String getCarName() {
		return carName;
		
	}
	
	// ��������� ���� ex�� ����ϰ� ������ get set �޼��尡 �ʿ�!!
	
	
	public int getCountCarName(String carName) {
		
		int size = carName.length();
		
		return size;
		
	}
	
	public long add(int a, int b) {
		
		return (long)a +b;
		// ����ȯ : cast. int�� a�� �� ���� ������ ������ �� �ֵ��� ���� ��ȭ������ 
		// long a�� int b�� ���ϸ� long���� ������� ���� �� ����.
		
	}

}

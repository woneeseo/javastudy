package com.naver;

public class Test {
	
	// me1 �޼��� :
	// �ΰ��� ������ �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���ͺ��� ū�� ���θ� Ȯ���ϰ� ��ȯ�Ͻÿ�.
	
	public boolean me1(int a, int b) {
		 //boolean c = a > b;
		 //return c;
		return a > b;
		
	}
	
	// m2 �޼��� :
	// �ΰ��� long�� �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���ͺ��� ũ�ų� ������ ���θ� Ȯ���ϰ� ��ȯ�Ͻÿ�.
	public boolean me2(long a, long b) {
		return a >= b;
		
	}
	// me3�޼��� :
	//�ΰ��� float�� �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù��° �Ķ���Ͱ� �ι��� �Ķ���ͺ��� ������ ���θ� Ȯ���ϰ�
	// ���� �۴ٸ�, ok�� ����ϰ� �׷��� ������ no�� ��ȯ�ϴ� �ż��带 �����϶�.
	public String me3(float a, float b) {
		
		boolean result = a < b;
		if(result) {
		// result �� true��?
			return new String("Ok");
			// �׷� ok ����ض�
		}
		else {
		// �׷��� �ʰ�	
		// result �� false��?
			return new String("NO");
			// �׷� no ����ض�
			}
	}
	// me31 �޼��� :
	// �ΰ��� int�� �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���ͺ��� ū�� ���θ� Ȯ���ϰ�
	// ���� true ��� 'a', �׷��� ������ 'z'�� ��ȯ�ϴ� ����� �ϴ� �ż��带 �����ض�
	public char me31(int a, int b) {
		
		if(a > b) {
			return 'a';
		}
		else {
			return 'z';
		}
		
	}
	
	// me4 �ż��� ;
	// �ΰ��� byte�� �Ķ���͸� �Ѱܹ޾Ƽ�,
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���ͺ��� �۰ų� ������ ���θ� Ȯ���ϰ�
	// �� ����� ��ȯ�Ͻÿ�.
	public boolean me4(byte a, byte b) {
		return a <= b;	
	}
	
	// me5 �ż��� :
	// �ΰ��� short �� �Ķ���͸� �Ѱܹ޾Ƽ�,
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���Ϳ� ������ ���θ� Ȯ���ϰ�
	// �� ����� ����Ͻÿ�.
	
	public void me5(short a, short b) {
		boolean c = a == b;
		System.out.println(c);
		
	}
	
	// me51 �޼��� :
	// �ΰ��� boolean�� �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù���� �Ķ���Ͱ� �ι�° �Ķ���Ϳ� ������ ���θ� Ȯ���ϰ�
	// �� ����� ����Ͻÿ�
	
	public void me51(boolean a, boolean b) {
		// == , != �� �񱳿����ڿ����� boolean���� ���ġ�� �Ķ���͸� �Ѱܹ��� �� ����
		System.out.println(a == b);
		
	}
	
	// me6 �޼��� :
	// boolean �� �Ķ���͸� �Ѱܹ޾Ƽ�
	// ù��° �Ķ���Ͱ� �ι�° �Ķ���Ϳ� �� ������ ���θ� Ȯ���ϰ�
	// �� ����� ����Ͻÿ�.
	
	public void me6(boolean a, boolean b) {
		System.out.println(a != b);
		
	}

}

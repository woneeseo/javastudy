package com.naver;

import javax.annotation.processing.SupportedSourceVersion;

import kr.co.ezen.Dog;

public class MainEx {
	
	public static void main(String[] args) {
		int a = 10;
		 // ���� a �����ϸ鼭 10���� �ʱ�ȭ �߱���.
		System.out.println(a);
		System.out.println(a+1);
		
		System.out.println(a*10);
		
		a = 100;
		// 100�� a�� �����Ͻÿ�.
		System.out.println(a);
		
		int c = 0;
		// ���� ���� c�� �������־��
		c = 44;
		// ���� c�� ���� ������ �� �ִ�
		System.out.println(c);
		
		System.out.println("############");
		Cat aa = new Cat();
		
		char bb = 'A'+30;
		System.out.println(bb);
		
		Cow cc = new Cow();
		
	}
	


}
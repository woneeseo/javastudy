package com.naver;

public class Test3 {
	
	public void printDa() {
		
		System.out.println("메서드 오버로딩");
	}
	
	public void printDa(int a) {
		System.out.println(a);
		
	}
	
	public void printDa(boolean a) {
		System.out.println(a);
	}
	
	public void printDa(long a) {
		System.out.println(a);
	}
	
	public void printDa(Dog a) {
		System.out.println(a);
	
	}
	
	public void printDa(Cat a) {
		System.out.println(a);
	}
	
	public void printDa(int a, int b) {
		System.out.println(a+b);
	}
	
	public void printDa(String a) {
		System.out.println();
	}
	
	
	// 메서드의 전반적인 기능이 같을 때 (위의 경우는 sysout의 기능이 중복된다)
	// 메서드 오버로딩을 이용해 매서드를 생성해주면 
	// 메인 ex에서 사용할 때 하나의 메서드명으로 여러종류의 자료형에 맞는 값을 입력해도
	// 오류가 나지 않는다

}

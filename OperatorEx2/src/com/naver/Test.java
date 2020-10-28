package com.naver;

public class Test {
	
	// me1 메서드 :
	// 두개의 정수형 파라미터를 넘겨받아서
	// 첫번째 파라미터가 두번째 파라미터보다 큰지 여부를 확인하고 반환하시오.
	
	public boolean me1(int a, int b) {
		 //boolean c = a > b;
		 //return c;
		return a > b;
		
	}
	
	// m2 메서드 :
	// 두개의 long형 파라미터를 넘겨받아서
	// 첫번째 파라미터가 두번째 파라미터보다 크거나 같은지 여부를 확인하고 반환하시오.
	public boolean me2(long a, long b) {
		return a >= b;
		
	}
	// me3메서드 :
	//두개의 float형 파라미터를 넘겨받아서
	// 첫번째 파라미터가 두번쨰 파라미터보다 작은지 여부를 확인하고
	// 만약 작다면, ok를 출력하고 그렇지 않으면 no를 반환하는 매서드를 생성하라.
	public String me3(float a, float b) {
		
		boolean result = a < b;
		if(result) {
		// result 가 true냐?
			return new String("Ok");
			// 그럼 ok 출력해라
		}
		else {
		// 그렇지 않고	
		// result 가 false냐?
			return new String("NO");
			// 그럼 no 출력해라
			}
	}
	// me31 메서드 :
	// 두개의 int형 파라미터를 넘겨받아서
	// 첫번째 파라미터가 두번째 파라미터보다 큰지 여부를 확인하고
	// 만약 true 라면 'a', 그렇지 않으면 'z'를 반환하는 기능을 하는 매서드를 생성해라
	public char me31(int a, int b) {
		
		if(a > b) {
			return 'a';
		}
		else {
			return 'z';
		}
		
	}
	
	// me4 매서드 ;
	// 두개의 byte형 파라미터를 넘겨받아서,
	// 첫번째 파라미터가 두번째 파라미터보다 작거나 같은지 여부를 확인하고
	// 그 결과를 반환하시오.
	public boolean me4(byte a, byte b) {
		return a <= b;	
	}
	
	// me5 매서드 :
	// 두개의 short 형 파라미터를 넘겨받아서,
	// 첫번째 파라미터가 두번째 파라미터와 같은지 여부를 확인하고
	// 그 결과를 출력하시오.
	
	public void me5(short a, short b) {
		boolean c = a == b;
		System.out.println(c);
		
	}
	
	// me51 메서드 :
	// 두개의 boolean형 파라미터를 넘겨받아서
	// 첫번쨰 파라미터가 두번째 파라미터와 같은지 여부를 확인하고
	// 그 결과를 출력하시오
	
	public void me51(boolean a, boolean b) {
		// == , != 의 비교연산자에서는 boolean형의 비수치형 파라미터를 넘겨받을 수 있음
		System.out.println(a == b);
		
	}
	
	// me6 메서드 :
	// boolean 형 파라미터를 넘겨받아서
	// 첫번째 파라미터가 두번째 파라미터와 안 같은지 여부를 확인하고
	// 그 결과를 출력하시오.
	
	public void me6(boolean a, boolean b) {
		System.out.println(a != b);
		
	}

}

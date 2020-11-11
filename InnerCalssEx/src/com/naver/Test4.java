package com.naver;

public class Test4 {
	
	public void me1() {
		// 로컬 내부 클래스
		// 로컨 내에서는 접근제한자 쓸 수 없음
		int a = 10;
		
		class LocalInnerClass{
			// 메서드 안에 메서드는 만들 수 없지만
			// 로컬 내부 클래스를 이용해서 간접적으로 만들어 사용할 수 있음
			
			public void lic() {
				System.out.println(a);
			
				// 로컬 변수나 로컬 내부 클래스는 외부로 호출 할 수 없기 때문에
				// 보안이 강력하다.
				
			}
		}
		
		LocalInnerClass lic1 = new LocalInnerClass();
		lic1.lic();
		// 로컬 내부 클래스이기 때문에 클래스가 생성된 me1메서드에서는 
		// 자유롭게 사용이 가능하지만,
		// me1() 밖에서 사용하고자 한다면, 객체를 생성해줘야 한다.
		

		
	}

}

package kr.co.ezen;

import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test5;
import com.naver.Test6;


public class MainEx {

	public static void main(String[] args) {
		
		Test2.MemberClass mc = new Test2().new MemberClass();
		// 내부클래스 호출 할 때 : 
		// 내부클래스를 가지고 있는 클래스를 호출해서 닷연산자로 내부클래스를 불러온뒤
		// 클래스로 객체를 만들고, 닷 연산자로 내부클래스를 불러와 객체를 만들어줌
		
		mc.mc1();
		// 객체를 이용해서 내부클래스에 있는 메서드에 접근할 수 있다. 
		
		Test3.StaticInnerClass sic1 = new Test3.StaticInnerClass();
		// static class 이기 때문에, 객체를 생성할 수 없음
		// 객체를 생성해 줄 test3을 매개체로 사용해 Static class의 객체를 만들어줌
		// Static변수가 메인메서드에 호출되기 위해서는
		// 클래스를 매개로 객체를 만들어줘야함.
	
		sic1.sic();
		
		Test5 t5 = new Test5();
		t5.ano.me1();
		// t5는 디폴트생성자에 내용이 없으니까 디폴트생성자로 객체를 만들어도
		// 내용이 없음!
		Test6 t6 = new Test6();
		// 근데 t6은 디폴트생성자에 me1을 오버라이딩 하고
		// me1메서드를 곧바로 로컬에서 사용할 수 있도록 처리함
		// => 디폴트 생성자로 객체를 만들면 닷 연산자를 안써도 바로 값을 사용할 수 있다.
	
	}	
		
}

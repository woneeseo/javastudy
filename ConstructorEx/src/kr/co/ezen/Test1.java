package kr.co.ezen;

public class Test1 {
	
	public Test1() {
		System.out.println("객체가 생성되었습니다.");
		
				
	}
	
	public Test1(long a) {
		
		this(); // 같은 클래스 내에서 디폴트 생성자를 호출한 것
		System.out.println(a);
	
	}
	
	public Test1(int a, int b) {
		System.out.println(111);
		System.out.println(a+b);
	}
	
	public void me1() {
		System.out.println("객체가 생성되었습니다.");
		
	}

}

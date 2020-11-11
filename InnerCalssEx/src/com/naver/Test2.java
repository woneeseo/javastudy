package com.naver;

public class Test2 {
	// 내부클래스
	
	
	private String msg;
	private int price;
	
	public class MemberClass{
		// 멤버 내부 클래스
		// 생성자나 메서드처럼 클래스 내부에 있는 클래스라서 
		// 멤버 내부 클래스라고 부른다. 
		// 사용하는 일은 잘 없지만 게임개발할때 많이 씀! 
		
		private int age;
		
		public void mc1() {
			
			
			System.out.println("mc1");
			// 내부클래스에서 메서드를 생성해서 쓸 수도 있고.
			// 내부클래스에서 변수를 선언하거나 getters and setters등의
			// 메서드도 충분히 사용이 가능하다.
			
			
			
			System.out.println(price);
			System.out.println(msg);
			me1();
			// 내부 클래스를 품고있는 클래스의 필드 영역에서 선언한 변수들이나 매서드들은
			// 따로 객체를 설정하지 않아도 내부클래스 안에서 사용이 가능하다.
			
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		// 일반 클래스와 같은 기능을 함
		
	}
	
	public void me1() {
		
	}

}

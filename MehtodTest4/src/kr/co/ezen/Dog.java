package kr.co.ezen;

public class Dog {
	
	private String name;
	private int age;
	
	public Dog() {
		
		name = "멍멍이";
		age = 23;
		
	}
	
	public Dog(String name) {
		this.name = name;
		
	}
	
	public Dog(int age) {
		this.age = age;
		
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
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
	
	// 같은 클래스에 있고, 메서드들 끼리의 이름이 같을 때
	// 오류가 나지 않는 이유 : 매서드 오버로딩 !! 
	// 사용자 메서드의 자료형이 서로 같아도 오류가 나지 않도록 해주는 것
	// (<->메서드 오버라이딩)
	

}

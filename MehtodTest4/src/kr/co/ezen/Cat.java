package kr.co.ezen;

public class Cat {
	
	private String name;
	private int age;
	
	public Cat() {
		
	}
	// 디폴트생성자에서 멤버변수의 값을 초기화해줬다.
	// 그럼 이제 name = 김토깽 / age = 23이라는 값이 쭉 저장되는거야
	// 이 변수를 클래스 어딘가에서 호출하면 김토깽, 23이라는 값이 출력되는거지
	
	// 근데 내가 변수를 바꾸고 싶을 수도 있잖아.
	// 그럼 사용자 생성자를 만들어서
	// 지역변수(매개변수)를 사용해서 변수를 대입해주면 돼
	
	
	public Cat(String name) {
		this.name = name;
		
	}
	
	public Cat(int age) {
		this.age = age;
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 이제 임의의 String 값과 임의의 int 값을 갖는
	// 변수 name 과 age가 생성됐어 

	
	// 근데 멤버변수를 이 클래스 안에서만 쓰는게 아니라
	// 기능을 하게 하려면 외부 클래스에서도 변수를 만지고 수정하고 해야하는데
	// 메인클래스에서 이 변수를 쓰려고 하면 오류가 나
	// 있는건 알지만 불러올 수가 없어, 접근 권한자를 이 클래스 안으로 한정해뒀기 때문에
	
	// 그래서 외부 클래스에서도 멤버 변수에 접근하기 위해서
	// get / set 메서드를 사용한다는 말이야.
	
	// 클래스 화면 안에서 마우스 오른쪽 클릭하면
	// source -> getters and setters -> sellect all 해주면
	
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
	
	// 이렇게 get/set 메서드가 자동으로 만들어진다
	// 이제 외부 클래스에서 호출 해서 값을 바꿀 수 있게 되었어.
	
	
	public Cat makeCat(String name, int age) {
		return new Cat(name, age);
	}
		
}


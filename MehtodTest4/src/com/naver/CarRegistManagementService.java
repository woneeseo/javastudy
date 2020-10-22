package com.naver;

public class CarRegistManagementService {
	// 멤버변수는 99.9% 퍼블릭!
	private String carName;
	
	public CarRegistManagementService() {
		// 생성자 : 멤버변수를 초기화 해줬다. 
		carName = "소나타";
		// 디폴트 생성자로 carName을 초기화 해주면 
		// carName은 항상 '소나타' 로 나온다. 
		
		// 근데 멤버변수의 접근제한자를 프라이빗으로 해놔서
		// 메인 ex에서 존재하는 것은 알지만 접근할 수 없음.
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
		
		// 그래서 멤버변수를 메인ex에서 출력해주고 싶어서
		// 멤버변수의 접근제한자를 퍼블릭으로 변경해
		// carName 을 메인 ex에서도 확인할 수 있도록 해준다
		
		// 매서드에서 지역변수나 매개변수를 설정하면
		// 그 지역변수나 매개변수가 우선이기 때문에
		// 만약에 멤버변수의 값이나 정보를 변경하고 싶으면
		// this.멤버변수 = 변수 
		// 로 설정해줘야한다.
		
	}
	
	public String getCarName() {
		return carName;
		
	}
	
	// 멤버변수를 메인 ex로 출력하고 싶으면 get set 메서드가 필요!!
	
	
	public int getCountCarName(String carName) {
		
		int size = carName.length();
		
		return size;
		
	}
	
	public long add(int a, int b) {
		
		return (long)a +b;
		// 형변환 : cast. int형 a를 더 넓은 범위를 포함할 수 있도록 형을 변화시켜줌 
		// long a와 int b를 더하면 long형의 결과값을 가질 수 있음.
		
	}

}

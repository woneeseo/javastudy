package com.naver;

public class Car {
	
	private String modelName;
	private String carNo;
	private int price;
	
	public Car() {
		
	}

	
	public Car(String modelName, String carNo, int price) {
		super();
		this.modelName = modelName;
		this.carNo = carNo;
		this.price = price;
	}


	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showMePrice() {
		System.out.println(price);
	}
	
	// + run(int speed) : String
	// run(int speed) = "특정속도로 달린다" 를 반환 하는 식
	// 문자열을 하나 만들어주고, 변수에 대입
	// 변수를 반환
	
	public String run(int speed) {
		String msg = speed + "로 달린다.";
		return msg;
		
	}

}

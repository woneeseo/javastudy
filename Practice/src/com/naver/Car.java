package com.naver;

public class Car {
	
	private String carName;
	private int age;
	private String maker;
	
	public Car(String carName, int age, String maker) {
		super();
		this.carName = carName;
		this.age = age;
		this.maker = maker;
	
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	

	
	
	
	

}

package com.naver;

import kr.co.ezen.Dog;

public class Person {
	
	private String id;
	private String name;
	private Dog happy;
	private Car k7;
	
	// car 클래스 = k7이라고 대입해주는겨
	// 그래서 이 person이라고 하는 클래스 내에서는
	// car클래스가 k7이 되는겨
	
	public Person() {
		
	}

	public Person(String id, String name, Dog happy, Car k7) {
		super();
		this.id = id;
		this.name = name;
		this.happy = happy;
		this.k7 = k7;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getHappy() {
		return happy;
	}

	public void setHappy(Dog happy) {
		this.happy = happy;
	}

	public Car getK7() {
		return k7;
	}

	public void setK7(Car k7) {
		this.k7 = k7;
	}
	
	public void sleep(String where) {
		String msg = happy.sleep(where);
		System.out.println(msg);
	}
	
	public void run(int speed) {
		String msg = k7.run(speed);
		System.out.println(k7.run(speed));
		
		// car클래스(=k7)에 있는 run이라는 클래스를 출력할거야
	}
	
	public void printCarPrice() {
		k7.showMePrice();
	}
	
	public void printCarModelName() {
		String mn = k7.getModelName();
		System.out.println(mn);
		
	}
	
}

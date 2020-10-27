package com.naver;

import kr.co.ezen.Car;

public class Person {
	
	private String name;
	private int age;
	private String job;
	private Dog dog;
	private Car car;
	
	public Person() {
		
	}

	public Person(String name, int age, String job, Dog dog, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.dog = dog;
		this.car = car;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
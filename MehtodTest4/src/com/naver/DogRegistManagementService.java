package com.naver;

import kr.co.ezen.Dog;

public class DogRegistManagementService {
	private Dog dog;
	
	public DogRegistManagementService() {
		
	}

	public Dog getDog() {
		return dog;
	}
	// ����ȯ ���Ķ� - get�޼����

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	// ����ȯ ���Ķ� - set�޼����
	
	public Dog makeDog(String name, int age) {
		
		// return new Dog(name, age);
		Dog d = new Dog();
		d.setName(name);
		d.setAge(age);
		
		return d;
	}
	

}

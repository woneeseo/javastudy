package com.naver;

import kr.co.ezen.Dog;

public class DogRegistManagementService {
	private Dog dog;
	
	public DogRegistManagementService() {
		
	}

	public Dog getDog() {
		return dog;
	}
	// 유반환 무파람 - get메서드명

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	// 무반환 유파람 - set메서드명
	
	public Dog makeDog(String name, int age) {
		
		// return new Dog(name, age);
		Dog d = new Dog();
		d.setName(name);
		d.setAge(age);
		
		return d;
	}
	

}

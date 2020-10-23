package kr.co.ezen;

public class Person {
	
	private String name;
	private String adderss;
	private String job;
	private Dog dog;
	private Car car;
	private String phoneNumber;
	private int age;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdderss() {
		return adderss;
	}



	public void setAdderss(String adderss) {
		this.adderss = adderss;
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



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Person(String name, String adderss, String job, Dog dog, Car car, String phoneNumber, int age) {
		super();
		this.name = name;
		this.adderss = adderss;
		this.job = job;
		this.dog = dog;
		this.car = car;
		this.phoneNumber = phoneNumber;
		this.age = age;
		
		}

	

	
	
	
	
}

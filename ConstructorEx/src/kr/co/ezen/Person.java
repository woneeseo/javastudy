package kr.co.ezen;

public class Person {
	private String ssn;
	private String name;
	private int age;
	private String adderss;
	private String job;
	private Dog dog;
	private Car car;
	
	public Person() {
		
	}

	public Person(String ssn, String name, int age, String adderss, String job, Dog dog, Car car) {
	
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.adderss = adderss;
		this.job = job;
		this.dog = dog;
		this.car = car;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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
	
	
	
	
}

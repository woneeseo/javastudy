package com.naver;

public class Member {
	
	private String name;
	private String Address;
	private Hobby hobby;
	private String school;
	
	
	public Member(String name, String address, Hobby hobby, String school) {
		super();
		this.name = name;
		Address = address;
		this.hobby = hobby;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Hobby getHobby() {
		return hobby;
	}
	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	

	

}

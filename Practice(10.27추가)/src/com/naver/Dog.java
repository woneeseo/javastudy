package com.naver;

import java.util.Date;

public class Dog {
	
	private String name;
	private Date birth;
	
	public Dog() {
		
	}

	public Dog(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	

}

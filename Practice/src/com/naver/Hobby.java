package com.naver;

public class Hobby {
	
	private String hobby;
	private String frequncy;
	private String where;
	private Car car;
	
	
	public Hobby(Car car) {
		super();
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Hobby(String hobby, String frequncy, String where) {
		super();
		this.hobby = hobby;
		this.frequncy = frequncy;
		this.where = where;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getFrequncy() {
		return frequncy;
	}
	public void setFrequncy(String frequncy) {
		this.frequncy = frequncy;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	
	
	
}

package com.naver;

public class Person {
	
	private TV tv1;
	private Radio radio;
	
	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public Person(TV tv1, Radio radio) {
		super();
		this.tv1 = tv1;
		this.radio = radio;
	}

	public Person() {
		// TODO Auto-generated constructor stub	
	}

	public Person(TV tv1) {
		super();
		this.tv1 = tv1;
	}

	public TV getTv1() {
		return tv1;
	}

	public void setTv1(TV tv1) {
		this.tv1 = tv1;
	}
	
	public void tvOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		tv1.powerOn();
	}
	
	public void tvOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
		tv1.powerOff();
	}
	

}

package com.naver;

public class Sonata {
	
	public static String company;
	private String modelName;
	
	static {
		company = "hyundai";
	}
	// static 블럭 : 
	// static변수를 초기화 해주는 블럭
	// static변수도 선언과 동시에 초기화 할 수 있고
	// 생성자 안에서 초기화를 할 수도 있으나,
	// static 블럭을 만들어 초기화 하는 방법이 가장 좋다. 
	
	public Sonata() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Sonata(String modelName) {
		super();
		this.modelName = modelName;

	}


	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Sonata.company = company;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	

}

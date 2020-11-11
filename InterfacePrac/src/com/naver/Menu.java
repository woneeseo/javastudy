package com.naver;

public class Menu {
	
	private String name;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
	
	

}

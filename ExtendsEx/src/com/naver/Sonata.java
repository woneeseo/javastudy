package com.naver;

public class Sonata extends Car {
	
	private String model = "sonata";
	
	public Sonata() {
		
		super();
		run();
		System.out.println(super.model);
	}

	public Sonata(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(":::::::::::::::::::::::");
		System.out.println("Sonata Ŭ������ run()");
		System.out.println(":::::::::::::::::::::::");
	}
	
	public void only() {
		System.out.println("�θ� Ŭ�������� ����, �ҳ�Ÿ Ŭ�������� �ִ� �޼���");
		
	}
	
}

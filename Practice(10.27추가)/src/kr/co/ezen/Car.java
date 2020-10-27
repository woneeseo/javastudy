package kr.co.ezen;

public class Car {
	
	private String modelName;
	private int price;
	private String carNo;
	
	public Car() {
		
	}

	public Car(String modelName, int price, String carNo) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.carNo = carNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	
	public void showMePrice() {
		System.out.println(price);
	}
	
	public void showModelName(String name) {
		System.out.println(name);
	}
	
	public String run(int speed) {
		String a = speed+"의 속도로 달린다.";
		return a;
		
	}

}

package kr.co.ezen;

public class Dog {
	
	private String dogName;
	private int dogage;
	private String dogMaster;
	private String dogAdderss;
	
	public Dog(String dogName, int dogage, String dogMaster, String dogAdderss) {
		super();
		this.dogName = dogName;
		this.dogage = dogage;
		this.dogMaster = dogMaster;
		this.dogAdderss = dogAdderss;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogage() {
		return dogage;
	}

	public void setDogage(int dogage) {
		this.dogage = dogage;
	}

	public String getDogMaster() {
		return dogMaster;
	}

	public void setDogMaster(String dogMaster) {
		this.dogMaster = dogMaster;
	}

	public String getDogAdderss() {
		return dogAdderss;
	}

	public void setDogAdderss(String dogAdderss) {
		this.dogAdderss = dogAdderss;
	}
	
	
	
	

}

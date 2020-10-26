package kr.co.ezen;

import java.util.Date;

public class Dog {
	
	private int did;
	private String name;
	private java.util.Date birth;
	// 풀패키지명 = 패키지명도 있고, 클래스 명도 확인할 수 있음
	// 패키지는 소문자로 시작, Date가 클래스명 
	
	
	public Dog() {
		
	}

	public Dog(int did, String name, Date birth) {
		super();
		this.did = did;
		this.name = name;
		this.birth = birth;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getBirth() {
		return birth;
	}

	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}
	
	public String sleep(String where) {
		return where + "에서 잔다";
		// 변수 만들어서 반환해도 되고, 바로 리턴에 적어줘도 됨
		
	}
	


}

package com.naver;

// Exception을 상속하는 사용자 예외 클래스 
public class DoNotSwearException1 extends Exception{

	private static final long serialVersionUID = 1L;

	public DoNotSwearException1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoNotSwearException1(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DoNotSwearException1(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DoNotSwearException1(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DoNotSwearException1(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}

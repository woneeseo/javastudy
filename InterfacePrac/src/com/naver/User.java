package com.naver;

public class User {
	
	Command[] coms;
	Command c;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(Command[] coms, Command c) {
		super();
		this.coms = coms;
		this.c = c;
	}
	
	public void changeMenu(int idx) {
		
		if(idx>=coms.length || idx<0) {
			idx = coms.length-1;
		}
		
		c = coms[idx];
	}

}

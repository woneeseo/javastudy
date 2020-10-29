package com.naver;

public class Radio {
	
	private int vol;
	private int hz;
	private boolean power;
	
	public Radio() {
		
	}

	public Radio(int vol, int hz, boolean power) {
		super();
		this.vol = vol;
		this.hz = hz;
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getHz() {
		return hz;
	}

	public void setHz(int hz) {
		this.hz = hz;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void powerOn() {
		power = true;
	// 라디오 켜기	
	}
	
	public void powerOff() {
		power = false;
	// 라디오 끄기 	
	}
	
	public void volUp() {
		if(!power) {
			return ;
		}
		
		++vol;
		if(vol > 100) {
			vol = 100;
		}
		
	}
	
	public void volDown() {
		if(!power) {
			return ;
		}
		
		--vol;
		if(vol <0) {
			vol = 0;
		}
	}
	
	public void hzUp() {
		if(!power) {
			return ;
		}
		
		++hz;
		if(hz>200) {
			hz = 0;
		}
		
	}
	
	public void hzDown() {
		if(!power) {
			return ;
		}
		--hz;
		if(hz < 0) {
			hz = 200;
		}
	}

}

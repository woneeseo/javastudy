package com.naver;

public class TV {
	
	private int vol;
	private int ch;
	private boolean power;
	
	public TV() {
		
	}

	public TV(int vol, int ch, boolean power) {
		super();
		this.vol = vol;
		this.ch = ch;
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public void powerOn() {
		power = true;
			
	}
	
	public void powerOff() {
		power = false;
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
		// if�� �ȿ� if���� �־� ������ ���� ������,
		// �ǹ������� ��ȣ���� �ʴ´�
	
	public void volDown() {
		
		if(!power) {
		// power = ture;
		// !power = false;
			return ;
			// ���࿡ power�� false��� �޼��带 ����������(return)�� ��
		}
		
		--vol;
		if(vol < 0) {
			vol = 0;
		}
	}
	
	public void chUp() {
		
		if(!power) {
			return ;
		}
		
		++ch;
		if(ch > 999) {
			ch = 0;
		}
	}
	
	public void chDown() {
		
		if(!power) {
			return ;
		}
		
		--ch;
		if(ch < 0) {
			ch = 999;
		}
	
		
	}
		
	public void switchTv() {
		power = !power;
	}

}

package com.naver;

import kr.co.ezen.Dog;
import kr.co.ezen.Test12;

public class MethodTest4 {
	
	public Test12 getTest12() {
		
		return new Test12();
		
	}
	
	public int getTest13() {
		
		return 50;
		
	}
	
	public int score(int score) {
		return score;
		
	}
	
	public String name(String name, int score) {
		return name;
		
	}
	
	public boolean getboolean(boolean c) {
		return c;
		
	}
	
	public char getchar(char d) {
		return d;
		
	}
	
	public int getint(int f) {
		return f;
	}
	
	public long getlong(long g) {
		return g;
		
	}
	
	public double getDouble(double h) {
		return h;
		
	}
	
	public String getDog() {
		return "dog";
	}
	
	public byte getByte(byte x) {
		return x;
	}
	
	
	public float getFloat(float z) {
		return z;
	}
	
	public Test12 getTest15() {
		return new Test12();
		
	}
	
	public Dog getDog2() {
		System.out.println("Dog 객체를 반환합니다.");
		// 리턴 값 앞에는 어떤 작업도 입력할 수 있음.
		
		return new Dog();
	}
	
	public MethodTest2 getM2() {
		
		System.out.println("MethodTest2를 콘솔에 출력합니다.");
		return new MethodTest2();
	}
	
	public byte getByte2(byte j) {
		return j;
		
	}
}

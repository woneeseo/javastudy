package com.naver;

import java.util.Random;

public class Test {
	
	// random class
	
	public void me6() {
		Random rnd1 = new Random(3);
		Random rnd2 = new Random(3);
		
		int num1 = rnd1.nextInt(10000);
		int num2 = rnd2.nextInt(10000);
		
		System.out.println(num1 == num2);
		// 실행하면 true값이 나온다.
		// seed가 같은 이상 랜덤클래스로 다수의 변수를 만들어 실행시켜도
		// 값은 같다. (같은 범위의 난수표를 이용하기 때문에)
		System.out.println(num2);
		
		
	}
	
	public void me5(int start, int end) {
		// start~end 범위에 있는 숫자가 임의로 나오도록 프로그래밍 하세요
		Random ran = new Random();
		int num = ran.nextInt(end-start+1)+start;
		System.out.println(num);
	}
	
	
	public void me4() {
		// 임의의 값의 범위가 3~10까지의 숫자가 되도록 프로그래밍 하세요
		Random ran = new Random();
		for(int i=3; i<11; i++) {
			int num = ran.nextInt(8)+3;
			System.out.println(num);
		}
		
	}
	
	public void me3() {
		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			int num = ran.nextInt(100);
			System.out.println(num);
		}
		
	}
	
	
	public void me2() {
		Random ran = new Random(System.currentTimeMillis());
	}
	
	
	public void me1() {
		Random rnd = new Random();
		
	}

}

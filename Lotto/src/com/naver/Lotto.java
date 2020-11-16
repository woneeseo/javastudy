package com.naver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	
	//int num = rnd.nextInt(max-min+1)+min;
	
	
	public void lottory() {
		Set<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		while(set.size()<6) {
			int num = rnd.nextInt(45-1+1)+1;
			set.add(num);
		}
		
		// 무작위로 출력된 번호를 순서대로 하기
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) {
			Integer integer =  it.next();
			list.add(integer);
		}
		
		Collections.sort(list);
		
		System.out.println(set);
		System.out.println(list);
	}
	
	// list로 할 수 있음 

}

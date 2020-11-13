package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43));
//		set.add(new MemberDTO("m005", "choi", 2));
// id가 같은것은 같은것이라고 인식하게 hashcord()and equals()처리를 해 둬서
// id가 중복되는 것 중에 뒤에 것은 입력해도 set에서는 인식하지 못한다.

		
		
	}
	
	public void me3() {
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "대구", "사과1", 1500));
		set.add(new MemberDTO2("a002", "대전", "사과2", 2000));
		set.add(new MemberDTO2("a003", "서울", "사과3", 3000));
		set.add(new MemberDTO2("a002", "부산", "사과44", 500));
		set.add(new MemberDTO2("a005", "청송", "사과5", 1000));
		
		
		
	}
	
	
	public void me2() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));
		set.add("hello");
		set.add("Hello");
		set.add(new String("Hello"));
		set.add("HELLO");
		set.add(new String("HELLO"));
		// 자료값의 동등성비교를 하기 때문에 Set에 들어있는 자료는 3개

	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
	}

}

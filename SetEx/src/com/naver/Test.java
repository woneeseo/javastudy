package com.naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	public void me5() {
		
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "대구", "사과1", 1500));
		set.add(new MemberDTO2("a002", "대전", "사과2", 2000));
		set.add(new MemberDTO2("a003", "서울", "사과3", 3000));
		set.add(new MemberDTO2("a002", "부산", "사과44", 500));
		set.add(new MemberDTO2("a005", "청송", "사과5", 1000));
		
		System.out.println(set.size());
		// 4 => 중복된 값은 저장하지 않음
		set.add(new MemberDTO2("a006", "전주", "사과6", 1500));
		// set에 자료를 추가하고 싶을 때 = add
		Iterator<MemberDTO2> it = set.iterator();
		// set안의 자료를 가져오고 싶을 때 - list + iterator + while문
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		// set 안의 자료가 차곡차곡 들어가서 인덱스를 부여받을 수 있도록
		// list를 만들어준다
		while (it.hasNext()) {
			// set 안에 가져올 자료가 있냐 
			MemberDTO2 memberDTO2 = it.next();
			// 가져올 자료가 있으면 memberDTO2에 대입해라
			list.add(memberDTO2);
			// 가져온 memberDTO2값을 list에 저장	
		}
		
		System.out.println(list);
		// 출력하면 저장된 값이 무작위로 출력된다.
		// [a001 : 사과1, a006 : 사과6, a002 : 사과2, a003 : 사과3, a005 : 사과5]
		
		// 이것을 순서대로 정렬하려면 collection.sort()를 사용
		// memberDTO2에 분류인자로 id를 오버라이팅 했으므로
		// sort는 id를 기준으로 정렬이 가능.
		
		Collections.sort(list);
		System.out.println(list);
		// [a001 : 사과1, a002 : 사과2, a003 : 사과3, a005 : 사과5, a006 : 사과6]
		
		set.remove(new MemberDTO2("a002", null, null, 0));
		// set에서 값을 지우고 싶을 때는 remove를 쓴다
		System.out.println(set);
		// [a001 : 사과1, a006 : 사과6, a003 : 사과3, a005 : 사과5]
		
	}
	
	
	
	
	public void me4() {
		Set<MemberDTO> set = new HashSet<MemberDTO>();
		
		set.add(new MemberDTO("m001", "kim", 4));
		set.add(new MemberDTO("m002", "lee", 11));
		set.add(new MemberDTO("m005", "park", 32));
//		set.add(new MemberDTO("m002", "kang", 43));
//		set.add(new MemberDTO("m005", "choi", 2));
// id가 같은것은 같은것이라고 인식하게 hashcord()and equals()처리를 해 둬서
// id가 중복되는 것 중에 뒤에 것은 입력해도 set에서는 인식하지 못한다.
		
		int size = set.size();
		System.out.println(size);
		// 배열 arr에 set이 가지고있는 데이터를 저장하고,
		// 그 중 id가 m005인 memberDTO객체를 이용해서
		// 그 객체의 age값을 출력하시오
		
		
		Iterator<MemberDTO> it = set.iterator();	
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		// list = new ArrayList<MemberDTO>(set); 와 같다.
		
		while (it.hasNext()) {
			MemberDTO memberDTO = it.next();
			list.add(memberDTO);
		}
		
		int idx = list.indexOf(new MemberDTO("m005", null, 0));
		System.out.println(list.get(idx).getAge());
		
		
//		Iterator<MemberDTO> it = set.iterator();
//		
//		MemberDTO[] arr = new MemberDTO[set.size()];
//		
//		while (it.hasNext()) {
//			MemberDTO memberDTO = it.next();
//			int idx = 0;
//			arr[idx] = memberDTO;
//			idx++;
//		}
//		
//		for(int i =0; i<arr.length; i++) {
//			MemberDTO dto = arr[i];
//			if(dto.getId().equals("m005")) {
//				System.out.println(dto.getAge());
//			}
//		}
//		
//		set.remove(new MemberDTO("m001", null, 0));
//		System.out.println(set);

		
		
	}
	
	public void me3() {
		Set<MemberDTO2> set = new HashSet<MemberDTO2>();
		
		set.add(new MemberDTO2("a001", "대구", "사과1", 1500));
		set.add(new MemberDTO2("a002", "대전", "사과2", 2000));
		set.add(new MemberDTO2("a003", "서울", "사과3", 3000));
		set.add(new MemberDTO2("a002", "부산", "사과44", 500));
		set.add(new MemberDTO2("a005", "청송", "사과5", 1000));
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<MemberDTO2> it = set.iterator();
		
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		System.out.println(it.next());
		System.out.println("::::::::");
		while (it.hasNext()) {
			MemberDTO2 memberDTO2 = it.next();
			System.out.println(memberDTO2);
			list.add(memberDTO2);
			
		}
		System.out.println(":::::::::::::::::");
		int idx = list.indexOf(new MemberDTO2("a003", null, null, 0));
		System.out.println(list.get(idx));
		
		
		
		set.remove(new MemberDTO2("a002", null, null, 0));
		System.out.println(set);
		
		set.clear();
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
		
		
		int size = set.size();
		System.out.println(size);
		
		List<String> list = new ArrayList<String>();
		
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = it.next();
			System.out.print(string+" ");	
			list.add(string);
		}System.out.println();
		
		int idx = list.indexOf("hello");
		System.out.println(list.get(idx));
		
		
		
		set.remove(new String("HELLO"));
		System.out.println(set);

	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<Integer> it = set.iterator();
		
		// index가 없는 set에서 원하는 값을 얻어오기 위해서 사용
		// while문을 돌려서 일단 set안에 있는 값을 전부 가져오고
		// list를 이용해서 가져온 값을 하나하나 저장해 인덱스를 부여해줌
		// set도 list처럼 값을 가져오는 것이 가능해진다. 
		
		List<Integer> list = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.print(integer+" ");
			list.add(integer);
		}System.out.println();
		
		int idx = list.indexOf(3);
		System.out.println(list.get(idx));
		
		
		set.remove(4);
		// set.remove(new Integer(4));
		System.out.println(set);
		
		set.clear();
	}
	
	
	

}

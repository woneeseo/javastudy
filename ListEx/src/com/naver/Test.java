package com.naver;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
	
	public void me8() {
		
		List<MemberDTO2> list = new ArrayList<MemberDTO2>();
		
		list.add(new MemberDTO2("a001", "대구", "사과1", 1500));
		list.add(new MemberDTO2("a002", "대전", "사과2", 2000));
		list.add(new MemberDTO2("a003", "서울", "사과3", 3000));
		list.add(new MemberDTO2("a004", "부산", "사과4", 2500));
		list.add(new MemberDTO2("a005", "청송", "사과5", 1000));
		
		for(int i=0; i<list.size(); i++) {
			
			MemberDTO2 apple = list.get(i);
			
			if(i == 0) {
				continue;
			}else {
				System.out.println(apple);
			}
			
			
			// toString 에서 지역 : 이름 으로 overiding 해줬기때문에
			// 그냥 sysout하면 값 나옴
		}
		
		list.remove(new MemberDTO2("a004", null, null, 0));
		list.remove(new MemberDTO2("a003", null, null, 0));
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		// clear => 리스트의 내용은 전부 사라지지만, 상자는 남아있음
	}
	
	
	public List<MemberDTO> me7() {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		list.add(new MemberDTO("m001", "kim", 5));
		list.add(new MemberDTO("m002", "lee", 12));
		list.add(new MemberDTO("m003", "park", 53));
		list.add(new MemberDTO("m004", "kang", 55));
		list.add(new MemberDTO("m005", "choi", 11));
		
		int idx = list.indexOf(new MemberDTO("m003", null, 0));
		System.out.println(idx);
		
		return list;
		
	}

	
	public void me6() {
		// list객체를 만드시오. 단, Map<String, object>를 담을 수 있음.
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		list.add(new HashMap<String, Object>());
		
		// map은 인터페이스라서 map으로는 객체를 만들 수 없음
		// map을 구현하고 있는 hashmap클래스를 이용한다.
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list.clear();
	}
	
	public void me5() {
		// list 객체를 만드세요. 단, Thread를 담을 수 있습니다.
		List<Thread> list = new ArrayList<Thread>();
		
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		}));
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}	
	
	public void me4() {
		// list 객체를 만드세요. 단, new StringBuffer()를 담을 수 있음
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());
		// list에 들어있는 모든 데이터를 출력하시오
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(int i =list.size()-1; i>=0; i--) {
			list.remove(i);
		}System.out.println(list);
		
	}
	
	public void me3() {
		// list 객체를 만드세요. 단 3.5, 4.1, 9.8을 입력할 수 있는 객체입니다.
		List<Double> list = new ArrayList<Double>();
		
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		
		int idx = list.indexOf(4.1);
		double d = list.get(idx);
		System.out.println(d);
		double d2 = list.get(1);
		System.out.println(d2);
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list에 들어있는 마지막 요소값을 1.1로
		list.set(list.size()-1, 1.1);
		System.out.println(list.get(list.size()-1));
		
		// list에 있는 데이터를 반복문을 이용해서 전부 삭제하세요.
		System.out.println(":::::::::::");
		
		int i = list.size()-1;
		while(i>=0) {
			list.remove(i);
			i--;
		}
		System.out.println(list);
	}
	
	public void me2() {
		// List 객체를 만들어주세요. 단, 제네릭타입은 3,4,5,6을 입력할 수 있도록.
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(4);
		list.add(5);
		list.add(6);
		// wrapper class는 
		// auto boxing - auto unboxing이 되기 때문에
		// 참조자료형처럼 값을 입력해줘도 되고, 그자리에서 바로 값을 입력해도 됨.
		
		int idx = list.get(2);
		System.out.println(idx);
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}System.out.println();
		
		list.set(list.indexOf(4), 100);
		System.out.println(list);
		
		// list.remove(new Integer(100));
		// int 자료형으로 입력된 값을 삭제하고 싶을 때
		// new Integer(인덱스에 저장된 값) 을 입력해주면 됨
		// int형 자료값과 인덱스가 정수값으로 충돌하면 인덱스로 인식한다.
		
		System.out.println(list);
		
//		list.remove(1);
//		list.remove(2);
//		System.out.println(list);
		// list에서는 하나가 삭제되면 삭제된 자리로 자료가 당겨짐
		// [3, 100, 5, 6] 에서 인덱스 1번을 지우면
		// list의 배열이 [3, 5, 6] 으로 바뀌면서, 다시 인덱스번호가 부여된다.
		// 100이 삭제되어서 인덱스 1번이 5로 변경되었다.
		// 인덱스 2번을 삭제하면 6이 삭제되며
		// 최종적으로 콘솔에 출력되는 값은 [3, 5] 가 남는다.
		
		list.remove(2);
		list.remove(1);
		System.out.println(list);
		// list에서는 여러가지 데이터를 삭제하고 싶다면 뒤에서부터 삭제한다.
		// 이러한 특성때문에 수정작업이 빈번한 곳에서는 arraylist를 쓰지 않는다.
		// linked list를 씀
		
		
		
	
	}
	
	public void me1() {
		// ArrayList
		List<Apple> list = new ArrayList<Apple>();
		// 배열처럼 생긴 list
		// 배열은 처음에 크기를 정해주면 크기가 변하지 않지만,
		// arraylist는 크기를 변경시키는 것이 가능하다.
		// 만드는 방법 :
		// 자바컬렉션프레임워크 <내용물의 참조자료형>
		
		list.add(new Apple());
		// list.add("안녕"); => 에러발생
		// Apple 클래스의 객체'만' 내용물로 들어갈 수 있음
		
		Apple iphone12 = list.get(0);
		// list에 들어있는 모든 요소값을 출력하시오
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}

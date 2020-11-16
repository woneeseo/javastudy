package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map interface
public class Test {

	
	public void me6() {
		
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		// map은 값을 두가지를 갖는다.
		// index역할을 할 key와 값을 나타내는 value
		// key와 value에는 어떤 자료형이든 들어갈 수 있다
		// List<dog> 참조자료형이 들어간 map형식의 자바 컬렉션 프레임워크
		
		List<Dog> list1 = new ArrayList<Dog>();
		// 값으로 list를 넣어줬기 때문에 list를 만들어주고
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));
		// dog클래스의 생성자를 이용해서 객체를 각각 만들어
		// list에 add해줬다.
		
		List<Dog> list2 = new ArrayList<Dog>();
		// value를 list값으로 받기 때문에 여러개의 list가 들어가도 괜찮음
		
		list2.add(new Dog("d003", "happy", "독일인1", 3));
		list2.add(new Dog("d004", "타크", "독일인2", 2));
		
		// 각각의 list로 생성한 객체들을 map에 하나의 키워드로 저장해줌
		map.put("진돗개", list1);
		map.put("셰퍼드", list2);
		
		System.out.println(map.get("진돗개"));
		// [Dog [id=d001, name=누렁이], Dog [id=d002, name=백구]]
		System.out.println(map.get("셰퍼드"));
		// [Dog [id=d003, name=happy], Dog [id=d004, name=타크]]
		
		// list로 묶인 객체의 하나 하나의 개별 정보가 알고싶을 때,
		// 반복문을 사용해서 하나씩 풀어낸다.
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
			//Dog [id=d001, name=누렁이]
			//Dog [id=d002, name=백구]
			System.out.println(list1.get(i).getName());
			// 누렁이 백구
		}
		
		// 원하는 정보를 출력할 수 있다.
		
		
	}
	
	
	
	
	public void me5(String filename) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
	
		// 외부에서 값을 입력해주면 파일 확장자를 가져와 문서분류를 해줌
		// 그 외에는 시스템파일입니다. 가 출력되도록 함.
		
		// String class 복슴*
		
		int idx = filename.lastIndexOf(".");
		// 맨 마지막 . 을 찾아서 그 뒤를 잘라내기 위해서 마지막 .의 인덱스를 구함
		// lastindexof. .을 기준으로 오른쪽이 확장자기 때문
		String key = filename.substring(idx+1);
		// .인덱스 다음부터 잘라내야 하니까 인덱스값에 +1
		String msg = map.get(key.toLowerCase());
		// 혹시라도 대문자로 되어있는 파일명을 일시적으로 소문자로 바꿔서
		// 입력될 수 있도록 toLowerCase() 사용
		
		if(msg==null) {
			// map에 없는 key를 입력하면 value로 null을 반환하기 때문에
			// msg가 null이면 시스템파일 을 출력하도록 함.
			System.out.println("시스템파일");
		}else {
			System.out.println(msg);
		}
	
	}
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		
		List<Dog> list1 = new ArrayList<Dog>();
		
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		
		list2.add(new Dog("d003", "happy", "독일인1", 3));
		list2.add(new Dog("d004", "타크", "독일인2", 2));
		
		map.put("진돗개", list1);
		map.put("셰퍼드", list2);
		
		List<Dog> jindo = map.get("진돗개");
		System.out.println(jindo);
		for(int i=0; i<jindo.size(); i++) {
			Dog dog = jindo.get(i);
			System.out.println(dog.getId());
		}
		
		
		
		List<Dog> spt = map.get("셰퍼드");
		System.out.println(spt);
		
		
		
	}
	
	public void me3() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exell");
		list1.add("genesis");
		list1.add("grandure");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("zeep");
		
		
		map.put("현대차", list1);
		map.put("기아차", list2);
		
		
		// list<>를 값으로 갖는 경우, 
		// key를 통해 호출하면 list형식의 값이 출력된다
		// [sonata, exell, genesis, grandure]
		
		// 각각의 개체에 접근하고 싶은 경우,
		// for문을 이용해 list에서 하나하나 객체를 꺼내준 뒤
		// 원하는 객체에 접근하면 됨
		//		sonata
		//		exell
		//		genesis
		//		grandure
		
		List<String> hyundai = map.get("현대차");
		System.out.println(hyundai);
		for(int i =0; i<hyundai.size(); i++) {
			System.out.println(hyundai.get(i));
		}
		
		List<String> kia = map.get("기아차");
		System.out.println(kia);
		for(int i =0; i<kia.size(); i++) {
			System.out.println(kia.get(i));
		}
		
	}
	
	public void me2() {
		//1. map 객체를 만들어라
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2,"park");
		map.put(1, "kang");
		// key가 중복되는 경우,
		// key가 1인 값 kim->kang으로 바뀜
		
		String a = map.get(0);
		System.out.println(a);
		String b = map.get(1);
		System.out.println(b);
		String c = map.get(2);
		System.out.println(c);
				
		
	}
	
	public void me1() {
		// 1. map , hashmap
		// 2. map 객체를 만들어라
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// map은 제네릭타입을 2가지를 사용.
		// 인텍스 (key)를 스스로 만들어 쓸 수 있도록 해줌
		// 어떤 자료형이든지 인덱스로 만들어 사용할 수 있음(key)
		
		// map에 데이터 입력하기
		// 데이터를 2개 넣어야하는 경우 -> put
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의 거리", 300);
		// key는 중복되어서는 안되지만, value는 중복되어도 상관없음
		
		int g = map.get("중력가속도");
		System.out.println(g);
		
		int password = map.get("우리집 비밀번호");
		System.out.println(password);
		
		int leng = map.get("서울과 부산간의 거리");
		System.out.println(leng);
		
		System.out.println(map);
		
	}

}

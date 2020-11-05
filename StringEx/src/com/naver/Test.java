package com.naver;

import java.util.StringTokenizer;

public class Test {
	
	
	
	public void name2() {
		String str = "HELLO#Hello#hello#hI#Hi#HI";
		StringTokenizer st = new StringTokenizer(str,"#");
		String[] arrStr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			String tok = st.nextToken();
			arrStr[i] = tok;
			
			if(arrStr[i].contains("H")) {
				System.out.println("대문자입니다.");
			}else {
				System.out.println("hello");
			}
			
			i++;
		}
	}
	
	
	
	public void me15() {
		String msg1 = "hello";
		String msg2 = "Hello";
		String msg3 = "HELLO";
		
		System.out.println(msg2.toUpperCase());
		System.out.println(msg2.toLowerCase());
		System.out.println(":::::::::::");
		String s1 = msg1.toUpperCase();
		// 대문자로 출력
		System.out.println(s1);
		String s2 = msg3.toLowerCase();
		// 소문자로 출력
		System.out.println(s2);
	}
	
	public void me14(int age) {
		// 문자열과 숫자를 + 연산을 사용하지 않고 표현하는 방법
		String msg = "홍길동은 "+age+"살 입니다.";
		System.out.println(msg);
		
		String msg2 = "홍길동은 %d살 입니다.";
		System.out.println(String.format(msg2, age));
		// %d = 정수값을 공급해주겠다는 이야기 
		
		// 2020년  3월 20일
		// 2020년 11월  5일
		// 이렇게 숫자를 정렬하고 싶을 경우
		int month = 3;
		String msg3 = "오늘은 2020년%2d월20일입니다.";
		System.out.println(String.format(msg3, month));
		
		int date = 5;
		String msg4 = "오늘은 2020년11월%-2d일입니다.";
		// %와 d사이에 2를 넣으면 = 2자의 공간을 주겠다.
		// 숫자 한자리만 입력해도 두자리분에 해당하는 곳에는 공란이 생긴다
		// %와 2d사이에 -를 입력하면 왼쪽정렬이 되어
		// 한자리만 입력하면 오른쪽에 공백이 생긴다.
		
		System.out.println(String.format(msg4, date));
		
		int money = 1000;
		String msg5 = "내 전재산은 %d원 입니다.";
		System.out.println(String.format(msg5, money));
		
		String msg6 = "내 전재산은 %,d원 입니다.";
		// 돈을 나타낼 때, 세자리마다 컴마를 붙여하잖아
		// 그 때 간단하게 1,000으로 금액을 표기할 수 있도록 해주는 식 : %,d
		System.out.println(String.format(msg6, money));
		
		String msg7 = "내 전재산은 %,15d원 입니다.";
		// d앞에 숫자를 붙여줌으로써 자릿수를 나타낼 수 있다.
		System.out.println(String.format(msg7, money));
		
		// 자릿수를 지정해주고, 이를 다 못채웠을 때 앞의 공백을 0으로 채우기
		// 자릿수 : 5. 숫자는 11이면 => 00011
		String msg8 = "내 등번호는 %2d입니다.";
		System.out.println(String.format(msg8, 7));
		
		String msg9 = "내 등번호는 %08d입니다.";
		System.out.println(String.format(msg9, 7));
		
		String msg10 = "%d + %d = %d입니다.";
		System.out.println(String.format(msg10, 3,4,7));
		// 여러개의 데이터를 컴마로 나눠서 입력할 수 있음
		// (내부적으로는 배열처럼 여겨진다)
		
		String msg11 = "%3.2f%%입니다.";
		System.out.println(String.format(msg11, 51.627));
		
	
		String name = "김복실";
		String str = "%s은 %d살입니다.";
		System.out.println(String.format(str, name, age));
		
		float precent = 3.14567F;
		String str1 = "%2.3f는 원주율 입니다";
		System.out.println(String.format(str1, precent));
		
		int score = 9;
		String str2 = "등번호는 %05d입니다.";
		System.out.println(String.format(str2, score));
		
		
		String str3 = "등번호는 %-3d입니다.";
		System.out.println(String.format(str3, score));
		
		
		
		
		
		
	}
	
	public void name() {
		String str = "into the unknown.mp3";
		boolean result = str.endsWith(".mp");
		
		
		if(result) {
			System.out.println(str.substring(str.indexOf('t', 
					str.indexOf('t')+1), str.indexOf('e')+1));
		}else {
			System.out.println("this is not music file.");
		}
	}
	
	public void me224() {
		String str = "into#the#new#world#welcome#elsa#!";
		String[] arrElsa = str.split("#");
		for(int i=0; i<arrElsa.length; i++) {
			if(i/2==0) {
				continue;
			}
				System.out.print(arrElsa[i]+" ");
		}
		System.out.println();
		
	}
	
	public void me223() {
		String str = "into#the#new#world#welcome#elsa#!";
		StringTokenizer st = new StringTokenizer(str, "#");
		String[] arrElsa = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			String tok = st.nextToken();
			arrElsa[i++] = tok;
		}
		System.out.println(arrElsa[arrElsa.length-1]);
		for(String tok : arrElsa)
			System.out.print(tok+" ");
		System.out.println();
	}
	
	public void me2222() {
		String str = "hello everyone";
		int idx = str.indexOf('e');
		idx = str.indexOf('e', idx+1);
		System.out.println(str.substring(idx));
		
		
		System.out.println(str.substring(str.indexOf('e'), 
				str.indexOf('e', idx+1)+1));
		
		System.out.println(str.substring(2, 4));
		
		System.out.println(str.substring(str.indexOf('l'), 
					str.indexOf('l',str.indexOf('l')+1)+1));
	
	}
	
	public void me1111() {
		String msg = "1#3#5#7#9##11#13";
		StringTokenizer in = new StringTokenizer(msg,"#");
		// msg라는 문자열에서 #라는 delim을 구분자로 해서
		// 문자열을 나눠 토큰을 만들겠다 -> StringTokenizer
		
		String[] arrInt = new String[in.countTokens()];
		// split()의 경우에는 메서드를 사용함과 동시에
		// 알아서 String형 1차원배열 String[]이 생성되지만
		// StringTokenizer의 경우에는 저장할 배열공간이 생기지 않으므로
		// 토큰으로 나눠서 배열에 하나씩 자료를 저장해줘야한다.
		// 저장 전에 저장할 수 있는 배열 하나 선언하기
		// 근데 토큰이 몇개로 나올 지 알 수 없으므로
		// countTokens()라는 메서드를 사용해준다. 
		// 토큰의 숫자에 따라 알아서 배열의 크기가 정해진다
		System.out.println(arrInt.length);
		
		// StringTokenizer는 while반복문과 함께 사용함
		
		int i = 0;
		while(in.hasMoreTokens()) {
			// in에 읽어 올 토큰이 있나?
			// 토근이 남아있으면 true / true면 아래 실행식 실행
			String token = in.nextToken();
			// in의 토큰 값을 읽어와서 token에 대입
			arrInt[i] = token;
			// 읽어온 토큰 값을 배열의 i번째 인덱스에 입력해준다.
			i++;
			// i를 1 더해준다.
			
		}System.out.println(arrInt[6]);
	}
	
	public void me133() {
		String msg = "hello#ichiro#ziro#saburo#3#buster#";
		StringTokenizer st = new StringTokenizer(msg,"#");
		String[] arrMsg = new String[st.countTokens()];
		
		int i =0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			arrMsg[i] = token;
			i++;
			
		}System.out.println(arrMsg[arrMsg.length-1]);
		
	}
	
	public void me13() {
		// 특정 기준 문자(delim)을 이용해서 서로 다른 의미를 갖고있는
		// 문자열(=token) 을 분할하기
		String msg = "teacheryo#1234##vip#1000#g#";
		String[] arr = msg.split("#"); 
		// regex = delim (|를 제외한 나머지 문자ok)
		// 문자열을 분할했기 때문에 분할된 문자들이 하나의 배열구조를 갖는다
		// 반환되는 데이터가 String형의 1차원 배열 => String[] 임
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("::::::::::::::::::::");
		StringTokenizer st = new StringTokenizer(msg, "#");
		String[] tArr = new String[st.countTokens()];
		
		int i=0;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
			tArr[i] = token;
			i++;
		}System.out.println(tArr[0]);
		
	}
	
	public void me12() {
		// + 연산자는 문자열에도 적용된다.
		// - 연산자는 문자열에 적용되지 않는다.
		// "hello world" 에서
		// "hello "를 잘라내고 "world"만 남게 하고 싶다면? substring()
		String msg1 = "hello world";
		String subMsg = msg1.substring(msg1.indexOf("w"));
		System.out.println(subMsg);
		System.out.println(msg1);
		
		int idx = msg1.indexOf('l');
		idx = msg1.indexOf('l',idx+1);
		int idx2 = msg1.indexOf('r');
		System.out.println(msg1.substring(idx, idx2+1));
	}
	
	public void me11() {
		String msg = "          he      llo             ";
		// 중간에 넣은 공백은 유지하고, 문자열 앞 뒤로 들어간 공백을 제거해주는 기능
		// he      llo
		// 로 출력되게 해주는 메서드 : trim();
		System.out.println(msg);
		System.out.println(msg.trim());
		msg = msg.trim();
		System.out.println(msg);
	}
	
	
	
	public void me10() {
		// 문자열끼리 데이터 값이 같은지 여부를 확인하고 싶을 때, equals().
		// 대소문자를 구분하고 싶지 않을 때, equalsIgnoreCase()
		String msg1 = "hello";
		String msg2 = new String("hello");
		String msg3 = "Hello";
		
		boolean result1 = msg1.equals(msg2);
		boolean result2 = msg1.equals(msg3);
		
		System.out.println(result1);
		System.out.println(result2);
		// case -> 대,소문자
		// equalsIgnoreCase -> 대소문자를 무시하고 데이터 내용이 같은지 확인가능
		boolean result3 = msg1.equalsIgnoreCase(msg3);
		System.out.println(result3);
	}
	
	public void me9() {
		// 문자열이 특정 문자열로 시작하는지 알고싶을 때, startWith()
		String msg = "hello";
		boolean result = msg.startsWith("h");
		System.out.println(result);
	}
	
	public void me8() {
		String msg1 = "abcd.jpg";
		String msg2 = "efgh.txt";
		
		boolean result1 = msg1.endsWith("jpg");
		System.out.println(result1);
		// endsWith => 접미어가 특정 문자열로 끝나는지 확인할 수 있음
		// boolean형으로 출력되기 때문에 값은 true, false로 출력됨
		// 일반적으로 확장자가 무엇인지 확인하고 싶을 때 사용
		
		
		boolean result2 = msg2.endsWith(".txt");
		System.out.println(result2);
		
	}
	
	public void me7(String msg) {
		
		// msg에 'z'가 들어있나?
		// msg에 'w'가 들어있나?
		// msg에 "el"이 들어있나?
		// msg에 "ow"가 들어있나?
		// 변수내용이 눈에 보이면 상관없지만, 파라미터로 들어오는 문자열은
		// 현재 확인할 수 없다. 그럴 때,
		// contains() or indexOf() 를 사용한다.
		// cf) lastIndexOf
		// ('z'가 포함되어있냐?) 	('z'의 인덱스가 뭐냐?)
		
		boolean result = msg.contains("z");
		int idx = msg.indexOf('z');
		// 해당 문자열이 있으면 문자열이 가진 인덱스 번호를 넘겨줌
		// 문자값이 없으면 -1을 넘겨줌
		System.out.println(result);
		System.out.println(idx);
		System.out.println(msg.indexOf('l'));
		// 문자열에서 검색된 동일 문자 중 가장 마지막 문자의 인덱스는
		// lastIndexOf(); 를 사용한다. 
		System.out.println(msg.lastIndexOf('l'));
		
		// 문자열에서 검색된 동일 문자중 중간에 있는문자의 인덱스는 어떻게 구할까?
		idx = msg.indexOf('l');
		System.out.println(idx); // 2번 인덱스 나옴
		
		idx = msg.indexOf('l', idx+1);
		System.out.println(idx);// 3번 인덱스 나옴
		
		idx = msg.lastIndexOf('l', idx+1);
		System.out.println(idx);
		
	}		
	
	public void me6() {
		String msg = "hello";
		// 문자열의 특정 인덱스에 있는 문자를 알고싶을 때 : charAt()
		// msg의 가장 큰 인덱스에 해당하는 문자를 출력하시오
	
		System.out.println(msg.charAt(msg.length()-1));
		System.out.println();
		// msg 문자열의 각 문자를 한 글자씩 모두 출력하시오
		for(int i=0; i<msg.length(); i++) {
			System.out.println(msg.charAt(i));
		}
	}
	
	
	public void me5() {
		String str = "hello";
		// 1. 배열의 크기를 알고싶을 때 호출되는 속성? length
		// 2. 문자열의 크기를 알고싶을 때 사용하는 메서드? length()
		
		System.out.println(str.length());
		// 3. ArrayList<String> list = new ArrayList<String>();
		// => list.size(); 자바 컬렉션 프레임워크의 리스트 안에 들어있는 요소의 갯수를 파악할 때 씀
		
	}
	
	
	
	
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		// String 클래스는 불변적성격
		String msg = "hello";
		msg = "good";
		
		msg = "";
		//""의 객체가 1개
		msg += "안녕하세요";
		// ""+"안녕하세요" 를 담은 객체가 또하나
		msg += "저는 홍길동입니다.";
		// ""+"안녕하세요"+"저는 홍길동입니다" 를 담은 객체가 또하나
		msg += "저는 조선 세종대왕 시대에 살고있습니다.";
		// ""+"안녕하세요"+"저는 홍길동입니다"+"저는 조선~~"을 담은 객체가 또하나
		// 메서드 영역에 총 4개의 객체가 생긴것 
		// -> 안그래도 좁은 영역에 객체가 새로 또 4개나 생겨서 메모리 누수 발생
		// 나중엔 속도 저하까지 발생하게 됨 => StringBuffer를 사용해 메모리 관리
		
		sb.append("안녕하세요.");
		sb.append("저는 홍길동입니다.");
		sb.append("저는 조선 세종대왕 시대에 살고있습니다.");
		// => 힙메모리에 StringBuffer를 이용해 메모리를 할당받고
		// 거기에 데이터를 축척해나감 -> 메모리 관리가 효과적!
		// 그럼 지금 StringBuffer에 저장된 데이터는
		// 안녕하세요 저는 홍길동입니다. 저는 조선 ~~ 이 다 저장되어있음
		// 근데 StringBuffer는 자주 쓰이는 class가 아니기 때문에
		// 데이터 축적이 완료되면 자주 쓰이는 class인 String으로
		// 자료형을 변경해줘야 함.
		
		msg = sb.toString();
		System.out.println(msg);
		
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);
		System.out.println(":::::::::::");
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		// equals => 데이터 값만 비교함
		
	}
	
	public void me2() {
		// 암시적 객체 생성방법 
		String msg = "hello";
	}
	
	public void me1() {
		// 명시적 객체 생성방법 
		String msg = new String("hello");
		
	}

}

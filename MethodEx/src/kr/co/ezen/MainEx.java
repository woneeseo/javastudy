package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;
import com.naver.MethodTest4;
// 객체 만들어서 매서드 호출하기

public class MainEx {
	
	public static void main(String[] args) {
		
		// MethodTest 에서 만든 매서드를 사용하고 싶을 때,
		// 먼저 MethodTest class로 객체를 하나 설정해줘야 한다.
		
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		
		mt2.sitDown();
		mt2.callName("서예원");
		
		mt2.printDan(3);
		mt2.printScore(new String("홍길동"),100);
		
		mt2.trueFalse("6+2=7", true);
		
		mt2.score("김길동", "사회", '수');
		mt2.score("황산벌", "역사", '우');
		
		mt2.guguDan(3);
		
		mt2.pai("원주율", 3.14);
		mt2.soccer("홍길동", 6.5);
		
		mt2.testScore("홍삼", "국어", '수', 98);
		mt2.testScore("김카페", "가정", '우', 89);
		mt2.testScore("박커피", "수학", '양', 50);
		mt2.testScore("김구름", "영어", '가', 42);
		
		Test12 m3 = new Test12();
		// 클래스라는 설계도를 사용하기 위해서는 실물(객체)를 만들어줘야 한다.
		// 객체 변수를 선언해줘야 사용할 수 있는거야.
		
		m3.sayHello();
		m3.printScore("홍길동", 100);
		
		System.out.println();
		
		m3.testScore("홍길동", '우', 85);
		
		MethodTest2 m4 = new MethodTest2();
		
		int re1 = m4.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = m4.giveMeTheMoney();
		
		System.out.println(m4.giveMeTheMoney());
		// 유반환이니까 출력이 됨
		System.out.println();
		// 무반환이라 출력되지 않음
		
		MethodTest3 mt7 = new MethodTest3();
		
		mt7.getTest12();
		
		Test12 re4 = mt7.getTest12();
		
		MethodTest4 mt8 = new MethodTest4();
		
		Test12 re5 = mt8.getTest12();
		
		mt8.getTest13();
		System.out.println(mt8.getTest13());
		
		int re8 = mt8.getTest13();
		
		System.out.println(re8);
		
		System.out.println(mt8.score(56));
		
		String re9 = mt8.name("토깽", 80);
		System.out.println(re9);
		
		
		mt8.getboolean(true);
		
		boolean ac = mt8.getboolean(true);
		System.out.println(ac);
		
		char ab = mt8.getchar('꺅');
	
		System.out.println(ab);
		
		MethodTest4 mt0 = new MethodTest4();
		
		int cc = mt0.getint(165);

		System.out.println(cc);
		
		long dd = mt0.getlong(561231564561321654L);
		
		System.out.println(dd);
		
		double ee = mt0.getDouble(53445.23564);
		
		System.out.println(ee);
		
		mt0.getDog();
		
		System.out.println(mt0.getDog());
		
		float ff = mt0.getFloat(1234564.45645564F);
		
		System.out.println(ff);
		
		MethodTest4 m9 = new MethodTest4();
		
		m9.getTest15();
		
		System.out.println(m9.getTest15());
		
		Test12 ll = m9.getTest15();
		
		System.out.println(ll);
		
		MethodTest4 vv = new MethodTest4();
	
		// 파라미터를 변수로 설정해놓으면 메인ex에서 동적인 기능을 수행할 수 있게 함
		// 여러개의 매개변수를 구현하고 싶으면 나중에 배열등을 사용해야 함
		
		boolean gg = vv.getboolean(true);
		// 값을 대입해준다고 생각하면 됨
		// gg = true; 와 비슷함
		
		System.out.println("이것은 빵이다 는 "+gg+"이다.");
		
		
		System.out.println("######################");
		MethodTest4 net = new MethodTest4();
		
		Dog d1 = net.getDog2();
		System.out.println(d1);
		System.out.println();
		MethodTest2 y = net.getM2();
		System.out.println(y);
		
		
		byte mm = net.getByte2((byte)127);
		
		System.out.println(mm);
		
		// 콘솔에서 byte형을 호출하고 싶으면 매개변수창에 ((byte)숫자); 이렇게 써야함
		
		
		
	}

}

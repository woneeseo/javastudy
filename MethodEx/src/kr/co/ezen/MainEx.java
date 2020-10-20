package kr.co.ezen;

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
	
		
		
	
	}

}

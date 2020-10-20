package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		Method m = new Method();
		
		m.hello();
		
		System.out.println();
		
		m.score("홍길동", "과학", 89);
		m.score("김일식", "수학", 95);
		m.score("김이식", "영어", 50);
		m.score("김삼식", "사회", 100);
		m.score("김토깽", "국어", 100);
		m.score("박복수", "체육", 85);
		
		System.out.println();
		
		System.out.println("#######");
		
		System.out.println();
		
		m.printDan(15);
		
		System.out.println();
		
		m.melon();
		
		System.out.println();
		
		m.winnigScore("한화이글스", 3.454);
		
		System.out.println();
		
		m.hobby(new String("홍길동"), new String("독서"));
		m.hobby(new String("김점례"), new String("음악감상"));
		
		
		System.out.println();
		Method n = new Method();
		
		
		n.melon();
		
		System.out.println();
		
		n.testScore("영어", '수');
		
		System.out.println();
		
		n.winnigScore("기아", 2.445);
		
		System.out.println();
		
		n.fruitLike("이곡길", "딸기");
		
		System.out.println();
		
		n.testResult("홍길동", "국어", '수', 98);
		n.testResult("김토깽", "국어", '우', 89);
		n.testResult("박복수", "사회", '가', 45);
		
		System.out.println();
		
		n.realFake("이것은 밥이다", true);
		n.realFake("이것은 빵이다", false);
		
		System.out.println();
		
		// 메서드 만들고 MainEx에 호출하기를 배웠다.
		// MainEx 클래스를 만들고, 추가로 클래스를 하나 더 만들기 MethodTest
		// MainEx 클래스에서 main 함수를 만들어주고
		// MethodTest 클래스에서 생성자를 만든다
		// 생성자는 public MethodTest(클래스이름) () {}
		// 생성자 밑 필드에 메서드를 만들어준다.
		// 메서드 만드는 법은 
		//   public   void  메서드이름 () {}
		// (접근제한자) (반환자)
		// 메서드 이름 뒤 소괄호에는 파라미터를 줘서 원하는 조건에 맞게 변수를 줄 수 있음
		
		
		// 메서드 호출하기
		// MainEx에서 메서드를 호출하려면 객체를 하나 만들어줘야한다.
		// MathodTest m = new MathodTest();
		// -클래스이름- 변수명 = new 생성자명 (); 
		// 생성자명은 클래스 이름과 같다.
		
		Method g = new Method(); 
		
		// 변수를 만들어줬으면 이제 Mathod 클래스에 있는 메서드를 호출 할 수 있다.
		
		g.fruitLike("박땡땡", "사과");
		g.hello();
		
		System.out.println();
		
		g.test();
		g.test2(false);
	}

}

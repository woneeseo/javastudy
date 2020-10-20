package kr.co.ezen;

public class Method {
	
	public Method() {
		
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
	public void score(String name, String text, int score) {
		System.out.println(name + "의 " + text + "점수는 " + score + "점 이다.");
	}
	
	public void printDan(int a) {
		System.out.println(a+"x1="+a*1);
		System.out.println(a+"x2="+a*2);
		System.out.println(a+"x3="+a*3);
		System.out.println(a+"x4="+a*4);
		System.out.println(a+"x5="+a*5);
		System.out.println(a+"x6="+a*6);
		System.out.println(a+"x7="+a*7);
		System.out.println(a+"x8="+a*8);
		System.out.println(a+"x9="+a*9);
	}
	
	public void melon() {
		System.out.println("맛있는 멜론");
	}
	
	public void winnigScore(String team, double score) {
		System.out.println(team + "의 이번시즌 성적은 " + score + "이다.");
	}
	
	public void hobby(String name, String bb) {
		System.out.println(name + "의 취미는 " + bb + "이다.");
		fruitLike(name, "사과");
		
	}
	
	public void testScore(String text, char score) {
		System.out.println(text + " " + score );
	}
	
	public void fruitLike(String name, String fruit) {
		System.out.println(fruit + "는 " + name + "씨가 좋아하는 과일이다.");
		
	}
	
	public void testResult(String name, String text, char score1, int score2) {
		System.out.println(name + "의 " + text + "성적은 " + score1 + "이고, 점수로 환산하면 " + score2 + "점 이다.");
	}
	
	public void realFake(String q, boolean a) {
		System.out.println(q + "는 " + a + "이다.");
	}
	
	
	// 매서드를 만들 때, 
	// public (접근제한자) void (반환자) 매서드이름 (){}
	// 이렇게 만드는데
	// () 안에 파라미터를 주느냐 안주느냐로 유파람/ 무파람 = 결과값이 나뉜다.
	// 무반환 무파람은 어떤 클래스에서 호출되어도 값이 변하지 않는다.
	
	public void test() {
		System.out.println("값이 변하지 않는다.");
	}
	// 무반환 유파람은 호출된 클래스에서 값을 주기 때문에 원하는대로 바꿀 수 있다.
	
	public void test2(boolean c) {
		System.out.println("값이 변하지 않는다 는 것은 " + c + "이다.");
	}
	
}

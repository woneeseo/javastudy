package kr.co.ezen;

public class Test12 {
	
	int a;
	boolean b = true;
	MethodTest mt1;
	MethodTest mt2 = new MethodTest();
	
	
	public Test12() {
		
	}
	
	public void sayHello() {
		System.out.println("hello~");
	}
	
	public void printScore(String name, int score) {
		System.out.println(name+" "+score+"점");
	}
	
	public void testScore(String name, char score1, int score2) {
		System.out.println(name+"의 수학 성적은 "+score1+"이고 점수로는 "+score2+"점 이다.");
	}


}

package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		
		
		t1.me2();
		
		
		// try~catch
		t1.me3();
		t1.me4(100);
		
		// throws로 호출된 곳에서 try~catch를 생성
		try {
			t1.me5(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("100을 입력했더니 문제가 발생했음.");
		}// 문제가 생기면 오류메세지+100을 입력했더니 문제가 발생했음.을 출력
		
		try {
			t1.me5(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 에러메세지를 띄워주는 메서드
			System.out.println("0을 입력했더니 문제가 생겼음.");
		}// 오류가 없으므로 h라는 제대로 된 값을 출력해줌
		
		
		// try~catch~finally
		
		t1.me6(0);
		// finally문에 있는 코드는 반드시 실행된다.
		// 하지만 try~finally문 밖에 입력된 코드는 실행되지 않는다
		// catch문에서 사용한 return 때문에 메서드를 빠져나가기 때문
		t1.me61();
		System.out.println();
		
		// throw 설정해놓은 오류가 발견되면 오류메세지를 출력하며 메서드를 멈춤
		t1.me7("hi");
		// t1.me7("개새끼");
		
		// runtime exception을 상속받은 사용자 정의 예외처리는
		// 오류메세지가 출력되면 기능을 멈춰버린다.
		// t1.me71("개새끼");
		 
		// 사용자 정의 예외처리를 할 때, Exception을 상속하게 한다.
		// try~catch를 해주면 멈추지 않고 실행되기때문에
		// 사용자 정의 예외처리를 할 때는 exception을 상속받는것이 좋다.
		
		 try {
			t1.me72("개새끼");
		} catch (Exception e) {
			System.out.println("욕설 금지");
		}
		
		 
		 t1.me71("개새끼");
		 try {
			t1.me72("개새끼");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		 
				

	}

}

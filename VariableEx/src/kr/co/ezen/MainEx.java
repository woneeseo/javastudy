package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		// 변수 선언 공식
		// 자료형 변수명 = 자료형에 맞는 값;
		
		String msg = "hello";
		String msg2 = "hi";
		String msg3 = "good";
		String msg4 = "morning";
		
	
		System.out.println(msg);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg);
		System.out.println(msg3);
		System.out.println(msg2);
		System.out.println(msg);
		
		
		String msg5 = "it";
		String msg6 = "fill";
		String msg7 = "wow";
		String msg8 = "law";
		String msg9 = "what";
		String msg0 = "why";
		String msg11 = "cheer";
		String msg12 = "beep";
		String msg13 = "oops";
		String msg14 = "zip";
		String msg15 = "pop";
		String msg16 = "lol";
		String msg17 = "kick";
		String msg18 = "boo";
		String msg19 = "gap";
		String msg20 = "none";
		String msg21 = "walk";
		String msg22 = "orange";
		String msg24 = "pick";
		String msg25 = "will";
		String msg26 = "gick";
		String msg23 = "english";
	
		
		
		
	
		// 변수 선언 공식
		// 자료형 변수명 = 자료형에 맞는 값;
		
		String f = "이순신";
		System.out.println(f);
		
		
		// 변수 선언 공식
		// 자료형 변수명 = 자료형에 맞는 값;
		
		long aaa = 2500000000L;
		
		char a = '한';
		System.out.println(a);
		
		long c = 10220022022002L;
		
		// byte = 1byte 할당받으며 표현범위는 -128~0~127
		// short = 2byte 할당받지만 잘 사용하지 않음
		// int = 4byte 할당받으며 표현 범위는 대략 -21억~0~21억, 정수의 기본 자료형
		// long = 8byte를 할당받아 가장 큰 숫자범위를 표현할 수 있는 자료형,
		// 사용시에는 값 뒤에 L/l을 입력해줘야 한다 ex) long a = 100000000000L;
		
		// float = 4byte를 할당받는 실수 자료형, 사용할 때는 값 뒤에 F/f를 입력해야 함
		// double = 8byte를 할당받는 실수 자료형, 실수의 기본 자료형
		
		// boolean = 참과 거짓을 나타내는 자료형 (true / fales)
		// char = 한 단어만 변수로 설정할 수 있음, 반드시 '' 작은따옴표 사용
		// ex) char a = '밥';
		
		
		
		
		
		// 자료값은 두가지로 나뉜다.
		// 기본자료형 / 참조자료형
		// 참조자료형은 기본 자료형이 아닌 자료형이다.
		// 기본 자료형 8가지 boolean, char, byte, short, int, long, float, double이 있다.
		// 1. boolean : 참과 거짓을 나타내는 자료형. 1byte를 차지함 
		// true / false els 단 두가지만 사용할 수 있는 자료형
		// 2. char : 문자 하나를 나타낼 수 있는 자료형
		// char a = '밥'; 처럼 글자 하나만 나타내는데, 반드시 작은따옴표''사용
		// (정수형 자료형)
		// 3. byte : 1byte(8bit)를 할당받는 정수형 자료형
		// 표현범위는 -128~127의 범위를 가지고 있고, 멀티미디어 작업을 할 때 주로 사용
		// 4. short : 2byte를 할당받는 정수형 자료형이지만 잘 사용하지 않는다
		// 5. int : 4byte를 할당받는 정수형 자료형의 기본형. 
		// 표현범위는 대략 -21억~21억 까지의 범위를 가진다.
		// 6. lonh : 8byte를 할당받아 가장 큰 숫자범위를 가진다.
		// 사용할 때는 값 뒤에 l/L을 붙여써준다.
		// (실수형 자료형)
		// 7. float : 정밀도가 낮은 실수형 자료형. 사용할 때는 값 뒤에 f/F를 붙여 써준다. 4byte를 할당받는다.
		// 8. double : 정밀도가 높은 실수형 자료형. 실수형 자료형의 기본형. 8byte를 할당받는다.
	    
		
		
		// 자료형은 크게 두가지로 나뉜다.
		// 기본자료형과 참조자료형
		// 참조자료형은 기본자료형이 아닌 모든 것이고
		// 기본자료형은 boolean / char / byte / short / int / long / float / double 의 8개가 있다.
		// 1. boolean : 1byte를 할당받는다. 참과 거짓을 나타내는 자료형. ture/fales 만 값으로 가질 수 있다.
		// 2. char : 문자 하나를 값으로 가지는 자료형. char a = '밥'; 과 같이 작은 따옴표와 사용한다.
		// (정수형 자료형)
		// 3. byte : 1byte(8bit)를 할당받음. -128~127까지 표현 가능. 주로 멀티미디어 작업 시 사용.
		// 4. short : 2byte를 할당받지만 잘 사용하지 않음.
		// 5. int : 메모리에서 4byte를 할당받고,대략 -21억~21억의 표현범위를 가진다. 정수형 자료형의 기본.
		// 6. long : 8byte를 할당받아 가져 큰 숫자의 포현이 가능하다.
		// 사용할 때는 값 뒤에 l/L을 적어주면 된다.
		// (실수형 자료형)
		// 7. float : 정밀도가 비교적 낮은 실수형 자료형. 4byte할당받음. 사용시에는 값 뒤에 F/f를 써줌
		// 8. double : 정밀도가 높은 실수형 자료형. 실수형 자로형의 기본형. 8byte를 할당받는다.
		
		
		
		
		boolean z = true;
		boolean b = false;
		char x = '밥';
		byte d = 127;
		short e = 234;
		int g = 93849;
		long h = 293943784749379L;
		float i = 3.14F;
		double j = 3.14156;
		
		
		
		boolean k = true;
		boolean l = false;
		char m = '커';
		byte n = 25;
		short o = 198;
		int p = 26645;
		long q = 1231543123456421324L;
		float r = 22.4454F;
		double s = 34.23538448;
		
		System.out.println(l);
		
		
		
		// 자료형은 기본자료형과 참조자료형으로 나누어진다.
		// 참조자료형은 기본자료형이 아닌 것이다.
		// 기본자료형은 boolean,char,byte,short.int,long,float,double 8가지이다.
		
		// 1. boolean : 값으로 참과 거짓만을 가질 수 있는 자료형 
		boolean t = true;
		boolean u = false;
		// 2. char : 문자 하나를 값으로 가지는 자료형, 값은 반드시 작은따옴표''안에 입력해야 한다.
		char v = '피'; 
		char ff = '자';
		// (정수형 자료형)
		// 3. byte : 표현할 수 있는 범위가 -128~127인 자료형. 주로 멀티미디어 작업시에 사용함
		byte w = 25;
		// 4. short : 2byte를 할당받는 자료형이지만 잘 사용하지 않는다.
		short aa = 255;
		// 5. int : 정수형 자료형의 기본형. 표현범위는 대략 -21억~21억의 범위를 가진다.
		int bb = 21366445;
		// 6. long : 가장 큰 범위를 가지는 정수형 자료형. 사용하고 싶을 때는 값 뒤에 l/L을 써줘야 한다.
		long cc = 1234567891523456L;
		// (실수형 자료형)
		// 7. float : 정밀도가 비교적 낮은 실수형 자료형. 사용하고 싶을 때는 값 뒤에 f/F를 써줘야 한다.
		float dd = 2.4564F;
		// 8. double : 정밀도가 높은 실수형 자료형. 실수형 자료형의 기본.
		double ee = 3.45612375466313;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 자료형은 크게 두가지로 나뉜다.
		// 기본자료형과 참조자료형
		// 참조자료형은 기본자료형이 아닌 것이고
		// 기본자료형은
		// boolean, char, byte, short, int, long, float, double 의 8가지가 있다.
		// 1. boolean : 값으로 참과 거짓만을 가질 수 있는 자료형
		boolean gg = true;
		boolean hh = false;
		// 2. char : 값으로 문자 하나만을 가질 수 있는 자료형
		char ii = '얍';
		// 값을 반드시 작은 따옴표 안에 써줘야한다
		// (정수형 자료형)
		// 3. byte : -128~127의 범위에 있는 숫자를 표현할 수 있다. 주로 멀티미디어 작업시 사용한다.
		byte jj = 36;
		// 4. short : 잘 사용하지 않음
		// 5. int : 정수형 자료형의 기본 자료형. 대략 -21억~21억의 숫자범위를 가진다.
		int kk = 123456;
		// 6. long : 정수형 자료형에서 가장 큰 숫자를 표현할 수 있는 자료형. 
		// 사용하고 싶을 때는 값 뒤에 L/l을 써준다
		long ll = 12345678465431L;
		// (실수형 자료형)
		// 7. float : 정밀도가 낮은 실수형 자료형. 사용할 때는 값 뒤에 f/F를 써 준다.
		float mm = 3.1245F;
		// 8. double : 정밀도가 높은 실수형 자료형. 실수형 자료형의 기본형.
		double nn = 3.124564231;
		
		System.out.println(nn);
		
		System.out.println(kk);
		
		System.out.println(a);
		
		// 자료형은 크게 두가지로 나뉜다.
		// 기본 자료형과 참조 자료형
		// 참조자료형은 기본자료형이 아닌 것
		// 기본자료형은 boolean, char, byte, short, int, long, float, double 의 8가지
		// 1. boolean : 값으로 참과 거짓만을 가질 수 있는 자료형
		boolean aaaa = true;
		boolean bbbb = false;
		// 2. char : 값으로 문자 하나만을 가질 수 있는 자료형. 값은 반드시 작은따옴표''안에 적어줌
		char cccc = '얍';
		// (정수형 자료형)
		// 3. byte : -128~127까지의 숫자범위를 가진다. 멀티미디어 작업을 할 때 주로 씀
		byte dddd = 12;
		// 4. short : 자주 사용하지 않음
		// 5. int : 정수형 자료형의 기본. 표현범위는 -21억~21억의 범위
	    int eeee = 12364536;
		// 6. long : 정수형 자료형에서 가장 큰 범위를 가진다. 사용하고 싶을 때는 값 뒤에 l/L을 쓴다.
		long ffff = 1032415645L;
		// 7. float : 실수형 자료형. 정밀도가 낮음. 사용하고 싶을 때는 값 뒤에 f/F를 씀
		// 8. double : 실수형 자료형의 기본형. 정밀도가 높다.
		
		
		
				
		
	}

}

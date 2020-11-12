package com.naver;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public void me10() {
		
		Calendar c = Calendar.getInstance();
		c.set(2020, Calendar.JULY, 23);
		
		int month = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.AUGUST+"월은 ");
		System.out.println(month+"일 까지 있습니다.");
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일");
		String birth = sdf.format(c.getTime());
		System.out.println(birth);
	}
	
	
	public void me9() {
		
		// 문자에 대한 포맷
		System.out.println(String.format("%4d,%3s", 33, "hel"));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		// String format과 같은 형식이라고 보면 된다.
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String a = sdf.format(0);
		System.out.println(a);
		
	}
	
	public void me8() {
		
		Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();
		// 자바에서는 캘린더 클래스를 쓴다.
		// 그러나 DB에서는 캘린더클래스보다는 Date 클래스를 많이 사용한다.
		// 따라서 반드시 두 타입을 변환할 수 있어야 한다. 
		
		Date d = new Date(c.getTimeInMillis());
		c.setTime(d);
		// 이렇게 변환하면 date객체를 calendar 클래스에서 받을 수 있음
		
		Date d3 = new Date(1);
		System.out.println(d3.toString());
		
		System.out.println(System.currentTimeMillis());
		// => long 값으로 출력되는 날짜정보를 알고있으면 
		// 오늘의 날짜가 언제인지 확인할 수 있음
	}
	
	
	public void me7() {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		c.roll(Calendar.DATE, 20);
		System.out.println(c.getTime());
		// roll을 사용하면 기존에 저장되어있는 정보는 변하지 않고 
		// 알고싶은 값만 확인할 수 있다. 
		// 해당 필드의 값만 변경이 되고, 다른 필드의 값은 변경이 안됨
		// 단, date-day는 연동됨!
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
	
	
	public void me61() {
		
		Calendar c = Calendar.getInstance();
		// 현재의 정보를 계속 갖게 한 뒤, 
		
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.DATE, 20);
		// c의 정보를 똑같이 가진 c2를 만들어 add를 하거나.
		
		Calendar c3 = (Calendar) c.clone();
		// = Calendar c3 = Calendar.getInstance(); 인 것이다. 
		c3.add(Calendar.DATE, 20);
		// c.clone();을 이용해서 객체를 하나 더 만들어내서
		// add하거나
		
		
		
	}
	
	
	
	
	public void me6() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		// 2020년 11월 12일입니다.
		// 20일 후에는 며칠일까요?
		
		c.add(Calendar.DATE, 20);
		// add() 는 calendar객체의 정보를 변경합니다.
		// 특정 필드의 값에 주어진 값을 더해서 변경합니다. 
		System.out.println(c.getTime());
	}
	
	
	
	public void me5() {/* 안 중요한 예제, 공부 안해도 되는 예제 */
		// 달력찍기
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("연도를 입력하세요.");
			int year = sc.nextInt();
			sc.nextLine();
			
			System.out.println("월을 입력하세요.");
			int month = sc.nextInt();
			sc.nextLine();
			
			
			Calendar c = Calendar.getInstance();
			c.set(year, month-1, 1);
			
			int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 해당 달의 1일째 요일을 알고있어야 달력을 만들어 낼 수 있음
			int firstDateDay = c.get(Calendar.DAY_OF_WEEK);
			
			System.out.println(year+"년 "+month+"월");
			System.out.println(" SU MO TU WE TH FI SA ");
			for(int i=1; i<firstDateDay; i++) {
				System.out.print("   ");
			}
			
			for(int i=1; i<lastDate+1; i++) {
				String naljja =i<10 ? "  "+i : " "+i;
				// 조건연산자로 간단하게 조건식을 만들어줌
				System.out.print(naljja);
				if((i+firstDateDay-1) % Calendar.SATURDAY==0) {
					System.out.println();
				}
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	
	public void me41() {
		// 1950년 2월의 마지막 날은 며칠까지 있었을까?
		// 그리고 그 날의 요일은 무엇일까요? 둘 다 각가 출력
		
		Calendar c = Calendar.getInstance();
		
		
		c.set(Calendar.YEAR, 1950);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		// = c.set(1950, Calendar.FEBRUARY, 1);
		
		// 먼저 알고싶은 년도와 월을 set해줌
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// set해준 달의 마지막날이 며칠까지 있는지 확인하고 싶을 때
		// c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		c.set(Calendar.DATE, maxDate);
		// 2월 마지막날의 정보를 날짜에 set해주고
		int day = c.get(Calendar.DAY_OF_WEEK);
		// 요일을 가져옴
		System.out.println(maxDate);
		System.out.println(day);
		
		
	}
	
	public void me4() {
		
		Calendar c = Calendar.getInstance();
		int maxDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDate);
	}
	
	public void me32() {
		// 1 1950년 6월 25일은 무슨 요일일까요?
		Calendar c = Calendar.getInstance();
		c.set(2020, Calendar.NOVEMBER, 30);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		// 배열로 다시 풀어보기 = 성공!
		
		String[] days = new String[] {"일요일", "월요일", "화요일", "수요일",
				"목요일", "금요일", "토요일"};
		
		for(int i=0; i<days.length; i++) {
			
			if(i==day) {
				System.out.println(days[i-1]);
			}
		}
	}
	
	
	public void me31() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c);
	}
	
	public void me3() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		// 캘린더 객체는 만들어지는 순간의 정보를 가지고 있음.
		c1.set(1950, 6-1, 25);
		System.out.println(c1);
		System.out.println(c2);
	}
	
	public void me2() {
		// calendar클래스를 이용해서 객체 c를 생성하시오
		
		Calendar c = Calendar.getInstance();
		
		// c를 이용해서 연도정보 추출하기.
		int year = c.get(Calendar.YEAR);
		// get(calendar.())를 이용하면 년 월 일 정보를 모두 가져올 수 있다.
		// calandar class의 static변수를 이용하기 위해서는
		// calendar.__(static변수명)을 입력해주면 된다.
		
		// 월정보  int month
		// 날짜정보 int date
		// 요일정보 int day
		
		int month = c.get(Calendar.MONTH)+1;
		// 캘린더 클래스의 month는 0월~11월으로 되어있다
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		
		
		
	
		
	}
	
	public void me1() {
		// 1. calendar 클래스 객체 생성 방법
		Calendar c = Calendar.getInstance();
		// calendar class는 추상클래스이기 때문에 객체를 만들 수 없음
		// 캘린더 클래스가 가지고 있는 getInstance 메서드를 통해서 
		// 자원을 사용할 수 있게 된다.
		
				
	}

}

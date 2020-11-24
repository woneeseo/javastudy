package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

// JDBC 객체 생성해서 커넥션 연결하기 

public class Test {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	// 상수로 지정되어야 하는 값들 : 드라이버이름/ url/ id/ password 
	// 왜? 이 값들은 한번 지정되면 변하지 않고 변해서는 안됨 / 매서드나 생성자에서 수정할 수 없게 해야함!!
	
	public Test() {
		
		// 드라이버 로딩 : 일반적으로 생성자에서 하고 딱 한번만 로딩한다.
		// full package : 패키지.클래스명 ex) kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 드라이버 객체 생성 : forname()을 이용해서
			// 풀 패키지 명만 알고있으면 객체 만들 수 있음.
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	
	public void me1() {
		// 커넥션은 반드시 메모리 해제가 되어야 함.
		// connection변수를 하나 만들어서 null값을 주고 예외처리 해줌
		// 무조건 close되어야 하기 때문에 try~catch~finally문으로 처리한다.
		
		Connection conn = null;
		// 커넥션은 지역변수로 선언해서 사용하여야 한다.
		PreparedStatement pstmt = null;
		// pstmt는 커넥션을 매개로 선언되기 때문에, close()를 pstmt먼저 실행시킨다
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?,?,?,?)";
		// prepareStatement 는 동적인 기능을 수행할 수 있도록 함 (외부에서 파라미터 값을 넘겨받아 실행할 수 있도록 함)
		// 동적인 값을 받을 수 있도록 값에 ? 처리를 해줌.
		// Oracle 의 인덱스는 1부터 시작
		
		
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("커넥션 연결 성공");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("preparedStatement 생성 성공");
			
			pstmt.setString(1, "m005");
			pstmt.setString(2, "kim");
			pstmt.setString(3, "c");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			
			
			
			pstmt.execute();
			// DB에 prepareStatement를 넘겨주는 매서드 : execute()
			
			
		} catch (Exception e) {
			System.out.println("preparedStatement 생성 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

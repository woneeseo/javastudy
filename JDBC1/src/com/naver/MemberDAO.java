package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	// 드라이브명, url, id, password는 상수로 지정해서 사용한다. (바뀌면 안되는 값이므로)
	
	
	public MemberDAO() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 드라이버를 불러오는 메서든 class클래스의 forname()를 사용해서 불러오는데
			// 파라미터로 줄 주소값은 odjbc6의 풀패키지명을 적어주면 된다 (단, 끝부분에 .class는 지울 것)
			// forname()은 try~catch문을 요구하기 때문에 try~catch로 감싸준다.
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
			
		}
		
	}
	 
	// ======================== 드라이브 연결하기 완료 ==============================
	
	
	
	
	public void delete(MemberDTO dto) {
		// dto클래스에서 파라미터를 받아서 사용하겠다
		
		Connection conn = null;
		// java.sql의 connection 인터페이스를 참조로 하여 객체를 만든다. 
		// 드라이버와 자바 프로그램을 연결해 줄 수 있도록 해줌
		PreparedStatement prtmt = null;
		// sql문을 실행할 수 있도록 해줌 (주문서!)
		String sql = "DELETE FROM member WHERE mid = ?";
		// 실행하는 언어 (주문서에 적혀져 있는 메뉴 내용)

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER_NAME, PASSWORD);
			// drivemanager 클래스를 통해서 getconnection()을 불러온다.
			// connection URL 과 오라클의 id / password를 요구하는데, 상수처리한 값을 넣어주면 됨
			
			prtmt = conn.prepareStatement(sql);
			// connection 인터페이스를 용해서 prepaeredStatement 객체를 만들어준다. 
			// sql에 값을 넣어 동적인 기능을 할 수 있도록 해준다.
			
			prtmt.setString(1, dto.getMid());
			// 입력해야 할 컬럼이 하나이다.
			// member테이블의 primary key로 mid를 설정했고, DTO클래스를 만들면서 
			// hashtag()를 mid로 했기 때문에 mid만 같으면 같은 객체이고, mid 는 중복되지 않는다.
			// 따라서 preparedStatement 인터페이스를 이용해서 mid의 값을 set해준다.
			// setString을 사용할 때, 컬럼의 인덱스를 요구하는데,
			// 오라클에서의 인터페이스는 1부터 시작한다는 것을 잘 기억해둬야 한다.
			// member 테이블의 mid 컬럼의 인덱스는 1이다.
			// setString(컬럼의 인덱스, 레코드) 를 입력하는데, dto객체의 mid를 가져올 것이다.
			// mid의 자료형은 String이기 때문에 setString을 쓰고, 다른 자료형이 있다면 자료형에 맞는 값을 넣어주면 됨
			
			// 메인메서드에서 dao객체를 만들어 다음과 같은 결과를 실행하면
			// dao2.delete(new MemberDTO("m006", null, null, null));
			// String sql = "DELETE FROM member WHERE mid = ?"; 의 ? 에
			// m006이라는 값이 들어가 결과적으로
			// String sql = "DELETE FROM member WHERE mid = 'm006"; 이 된다
			
					
			prtmt.executeUpdate();
			// 성공하면 1 실패하면 0
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(prtmt != null) {
					prtmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	// ================================ 레코드 삭제하기 완료 ==================================
	
	
	
	
	public void update(MemberDTO dto) {
	
	}
	
	public List<MemberDTO> select() {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		return list;
		// Select로 시작하는 것은 무조건 prtmt.executeQuery(); 를 사용한다.
	}
	
	
	
	
	
	
	
	public void insert(MemberDTO dto) {
		
		
		// connection 객체 만들기
		// preparedStatement 객체 만들기
		// 사용할 sql문 지정해주기 String sql = "용도에 맞게 INSERT/SELECT/UPDATE/DELETE 등등의 형식을 정해준다";
		// try~catch~finally
		// finally문에 다시한번 try~catch
		// finally 안의 try 문에 close()메서드를 지정해준다.
		// 커넥션은 반드시 메모리 해제를 해줘야 한다!!!
		// preparedstatement는 connection객체를 매개로 드라이버에 값을 넘겨주게 되기 때문에
		// preparedstatement보다 먼저 conn이 close()되게 되어버리면
		// preparedstatement가 붕 뜨게 된다. (필터스트림이랑 비슷하다고 생각하면 될 듯)
		// 반드시 preparedstatement를 먼저 close()해주고, conn을 close()한다.
		// 예외처리 완료해주고
		// 원래 try문으로 돌아와서 작업
		// conn 객체 만들어주고, conn객체를 매개로 해서 preparedstatement 객체도 생성한다.
		// preparedstatement객체의 파라미터에는 미리 지정해 둔 sql문을 대입해주고
		// preparedstatement 객체를 이용해서 dto에 접근해 이것저것 설정을 해주면 된다
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member VALUES (?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen","ezen");
			System.out.println("커넥션 연결 성공");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("prepareStatement 생성 성공");
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			// executeUpdate()는 DB에 preparedstatement를 넘겨주는 역할을 한다.
			// 잘 넘겨줬으면 1을, 그렇지 못하면 0을 출력함
		
			
		} catch (SQLException e) {
			System.out.println("커넥션 연결 실패");
			System.out.println("prepareStatement 생성 실패");
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
	
	// ===================================== 레코드 삽입하기 =====================================
	
}

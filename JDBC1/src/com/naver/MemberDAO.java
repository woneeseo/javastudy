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
	
	// ����̺��, url, id, password�� ����� �����ؼ� ����Ѵ�. (�ٲ�� �ȵǴ� ���̹Ƿ�)
	
	
	public MemberDAO() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// ����̹��� �ҷ����� �޼��� classŬ������ forname()�� ����ؼ� �ҷ����µ�
			// �Ķ���ͷ� �� �ּҰ��� odjbc6�� Ǯ��Ű������ �����ָ� �ȴ� (��, ���κп� .class�� ���� ��)
			// forname()�� try~catch���� �䱸�ϱ� ������ try~catch�� �����ش�.
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
			
		}
		
	}
	 
	// ======================== ����̺� �����ϱ� �Ϸ� ==============================
	
	
	
	
	public void delete(MemberDTO dto) {
		// dtoŬ�������� �Ķ���͸� �޾Ƽ� ����ϰڴ�
		
		Connection conn = null;
		// java.sql�� connection �������̽��� ������ �Ͽ� ��ü�� �����. 
		// ����̹��� �ڹ� ���α׷��� ������ �� �� �ֵ��� ����
		PreparedStatement prtmt = null;
		// sql���� ������ �� �ֵ��� ���� (�ֹ���!)
		String sql = "DELETE FROM member WHERE mid = ?";
		// �����ϴ� ��� (�ֹ����� ������ �ִ� �޴� ����)

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", USER_NAME, PASSWORD);
			// drivemanager Ŭ������ ���ؼ� getconnection()�� �ҷ��´�.
			// connection URL �� ����Ŭ�� id / password�� �䱸�ϴµ�, ���ó���� ���� �־��ָ� ��
			
			prtmt = conn.prepareStatement(sql);
			// connection �������̽��� ���ؼ� prepaeredStatement ��ü�� ������ش�. 
			// sql�� ���� �־� ������ ����� �� �� �ֵ��� ���ش�.
			
			prtmt.setString(1, dto.getMid());
			// �Է��ؾ� �� �÷��� �ϳ��̴�.
			// member���̺��� primary key�� mid�� �����߰�, DTOŬ������ ����鼭 
			// hashtag()�� mid�� �߱� ������ mid�� ������ ���� ��ü�̰�, mid �� �ߺ����� �ʴ´�.
			// ���� preparedStatement �������̽��� �̿��ؼ� mid�� ���� set���ش�.
			// setString�� ����� ��, �÷��� �ε����� �䱸�ϴµ�,
			// ����Ŭ������ �������̽��� 1���� �����Ѵٴ� ���� �� ����ص־� �Ѵ�.
			// member ���̺��� mid �÷��� �ε����� 1�̴�.
			// setString(�÷��� �ε���, ���ڵ�) �� �Է��ϴµ�, dto��ü�� mid�� ������ ���̴�.
			// mid�� �ڷ����� String�̱� ������ setString�� ����, �ٸ� �ڷ����� �ִٸ� �ڷ����� �´� ���� �־��ָ� ��
			
			// ���θ޼��忡�� dao��ü�� ����� ������ ���� ����� �����ϸ�
			// dao2.delete(new MemberDTO("m006", null, null, null));
			// String sql = "DELETE FROM member WHERE mid = ?"; �� ? ��
			// m006�̶�� ���� �� ���������
			// String sql = "DELETE FROM member WHERE mid = 'm006"; �� �ȴ�
			
					
			prtmt.executeUpdate();
			// �����ϸ� 1 �����ϸ� 0
			
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
	
	
	
	
	// ================================ ���ڵ� �����ϱ� �Ϸ� ==================================
	
	
	
	
	public void update(MemberDTO dto) {
	
	}
	
	public List<MemberDTO> select() {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		return list;
		// Select�� �����ϴ� ���� ������ prtmt.executeQuery(); �� ����Ѵ�.
	}
	
	
	
	
	
	
	
	public void insert(MemberDTO dto) {
		
		
		// connection ��ü �����
		// preparedStatement ��ü �����
		// ����� sql�� �������ֱ� String sql = "�뵵�� �°� INSERT/SELECT/UPDATE/DELETE ����� ������ �����ش�";
		// try~catch~finally
		// finally���� �ٽ��ѹ� try~catch
		// finally ���� try ���� close()�޼��带 �������ش�.
		// Ŀ�ؼ��� �ݵ�� �޸� ������ ����� �Ѵ�!!!
		// preparedstatement�� connection��ü�� �Ű��� ����̹��� ���� �Ѱ��ְ� �Ǳ� ������
		// preparedstatement���� ���� conn�� close()�ǰ� �Ǿ������
		// preparedstatement�� �� �߰� �ȴ�. (���ͽ�Ʈ���̶� ����ϴٰ� �����ϸ� �� ��)
		// �ݵ�� preparedstatement�� ���� close()���ְ�, conn�� close()�Ѵ�.
		// ����ó�� �Ϸ����ְ�
		// ���� try������ ���ƿͼ� �۾�
		// conn ��ü ������ְ�, conn��ü�� �Ű��� �ؼ� preparedstatement ��ü�� �����Ѵ�.
		// preparedstatement��ü�� �Ķ���Ϳ��� �̸� ������ �� sql���� �������ְ�
		// preparedstatement ��ü�� �̿��ؼ� dto�� ������ �̰����� ������ ���ָ� �ȴ�
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member VALUES (?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen","ezen");
			System.out.println("Ŀ�ؼ� ���� ����");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("prepareStatement ���� ����");
			pstmt.setString(1, dto.getMid());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getJob());
			pstmt.setDate(4, dto.getBirth());
			
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			// executeUpdate()�� DB�� preparedstatement�� �Ѱ��ִ� ������ �Ѵ�.
			// �� �Ѱ������� 1��, �׷��� ���ϸ� 0�� �����
		
			
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			System.out.println("prepareStatement ���� ����");
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
	
	// ===================================== ���ڵ� �����ϱ� =====================================
	
}

package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

// JDBC ��ü �����ؼ� Ŀ�ؼ� �����ϱ� 

public class Test {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	// ����� �����Ǿ�� �ϴ� ���� : ����̹��̸�/ url/ id/ password 
	// ��? �� ������ �ѹ� �����Ǹ� ������ �ʰ� ���ؼ��� �ȵ� / �ż��峪 �����ڿ��� ������ �� ���� �ؾ���!!
	
	public Test() {
		
		// ����̹� �ε� : �Ϲ������� �����ڿ��� �ϰ� �� �ѹ��� �ε��Ѵ�.
		// full package : ��Ű��.Ŭ������ ex) kr.co.ezen.Test
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// ����̹� ��ü ���� : forname()�� �̿��ؼ�
			// Ǯ ��Ű�� �� �˰������� ��ü ���� �� ����.
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
	}
	
	
	public void me1() {
		// Ŀ�ؼ��� �ݵ�� �޸� ������ �Ǿ�� ��.
		// connection������ �ϳ� ���� null���� �ְ� ����ó�� ����
		// ������ close�Ǿ�� �ϱ� ������ try~catch~finally������ ó���Ѵ�.
		
		Connection conn = null;
		// Ŀ�ؼ��� ���������� �����ؼ� ����Ͽ��� �Ѵ�.
		PreparedStatement pstmt = null;
		// pstmt�� Ŀ�ؼ��� �Ű��� ����Ǳ� ������, close()�� pstmt���� �����Ų��
		String sql = "INSERT INTO member (mid, name, job, birth) VALUES (?,?,?,?)";
		// prepareStatement �� ������ ����� ������ �� �ֵ��� �� (�ܺο��� �Ķ���� ���� �Ѱܹ޾� ������ �� �ֵ��� ��)
		// ������ ���� ���� �� �ֵ��� ���� ? ó���� ����.
		// Oracle �� �ε����� 1���� ����
		
		
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ezen", "ezen");
			System.out.println("Ŀ�ؼ� ���� ����");
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("preparedStatement ���� ����");
			
			pstmt.setString(1, "m005");
			pstmt.setString(2, "kim");
			pstmt.setString(3, "c");
			pstmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));
			
			
			
			pstmt.execute();
			// DB�� prepareStatement�� �Ѱ��ִ� �ż��� : execute()
			
			
		} catch (Exception e) {
			System.out.println("preparedStatement ���� ����");
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

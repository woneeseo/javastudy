package com.naver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AttendeeDAO {
	
	private final String DRIVER = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER_NAME = "ezen";
	private final String PASSWORD = "ezen";
	
	public AttendeeDAO() {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public List<AttendeeDTO> attendeeCheck() {
		List<AttendeeDTO> list = new ArrayList<AttendeeDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select *from attendee ORDER BY id ASC";
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);		
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String intime = rs.getString("intime");
				String exittime = rs.getString("exittime");
				AttendeeDTO dto = new AttendeeDTO(id, name, intime, exittime);
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
		
		return list;
		
	}
	
	public void deleteAttendee() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "TRUNCATE TABLE attendee";
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("�ʱ�ȭ �������� ������ �߻��߽��ϴ�.");
		} finally {
			
			closeAll(null, pstmt, conn);
		}
	}
	
	public AttendeeDTO selectById(String id) {
		
		AttendeeDTO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM attendee WHERE id = ? ";
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				String name = rs.getString("name");
				String intime = rs.getString("intime");
				String exittime = rs.getString("exittime");
				
				dto = new AttendeeDTO(id, name, intime, exittime);
			}
			
			
		} catch (Exception e) {
			System.out.println("��ϵ��� ���� ��� ID�Դϴ�.");
			System.out.println("�ٽ� �� �� Ȯ�� �� �ּ���.");
		} finally {
			closeAll(rs, pstmt, conn);
		}
		
		return dto;
	}
	
	public void exittime(AttendeeDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update attendee set exittime = ?  where id = ?";
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getExittime());
			pstmt.setString(2, dto.getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("��� ����� ���� ����Դϴ�.");
		}finally {
			closeAll(rs, pstmt, conn);
		}
		
	}
	
	
	public void insertIntime(AttendeeDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO attendee (id, name, intime) VALUES (?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getIntime());
			
			System.out.println("��� �ð��� ����մϴ�.");
			pstmt.execute();
			System.out.println("��ٽð��� ��ϵǾ����ϴ�.");
			
		} catch (Exception e) {
			System.out.println("�̹� ��� �� ����Դϴ�.");
			
		} finally {
			
			closeAll(null, pstmt, conn);
		}
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		
		try {
			
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("�޸𸮰� �������� �ʾҽ��ϴ�.");
		}
	}
	

}

package kr.or.connect.jdbexam.dao;

import java.sql.*;
import kr.or.connect.jdbexam.dto.Role;

public class RoleDao { //데이터 입력, 선택, 삭제, 추가 기능하는 클래스
	private static String dbUrl = "jdbc:mysql://localhost:3306/connectdb?useSSL=false";
	private static String dbUser = "connectuser";
	private static String dbPassword = "connect123!@#";
	
	public Role getRole(Integer roleId) {
		Role role = null;
		Connection conn = null; //연결 선언 객체
		PreparedStatement ps = null; //명령 선언 객체
		ResultSet rs = null; //결과값 가져올 객체
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "SELECT role_id, description FROM role WHERE role_id = ?";
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId); //첫번째 물음표대신에 'roleId'를 넣어라
			rs = ps.executeQuery(); 
			
			if(rs.next()) { //다음 row에 결과값이 있다면 True를 반환하고 다음으로 이동, 없다면 False 반환
				Integer ri = rs.getInt("role_id"); //결과값 가져오기(sql문 쓸때 반환컬럼 순서대로 타입써주기)
				String desc = rs.getString(2); //컬럼 순서상 2(앞의 것도 1로 적어도 됨)
				role = new Role(ri,desc);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return role;
	}
}

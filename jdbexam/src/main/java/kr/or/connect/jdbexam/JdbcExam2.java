package kr.or.connect.jdbexam;

import kr.or.connect.jdbexam.dto.Role;
import kr.or.connect.jdbexam.dao.RoleDao;

public class JdbcExam2 {

	public static void main(String[] args) {
		Integer roleId = 500;
		String description = "CTO";
		
		Role role = new Role(roleId, description);
		RoleDao dao = new RoleDao();
		
		int insertCnt = dao.addRole(role);
		
		System.out.println(insertCnt);

	}

}
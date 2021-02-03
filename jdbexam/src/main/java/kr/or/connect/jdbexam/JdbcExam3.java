package kr.or.connect.jdbexam;

import java.util.List;

import kr.or.connect.jdbexam.dao.RoleDao;
import kr.or.connect.jdbexam.dto.Role;

public class JdbcExam3 {

	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		List<Role> roles = dao.getRoles();
		
		for(Role role : roles) {
			System.out.println(role);
		}
		System.out.println("---------------------------");
		
		Role newRole = new Role(201,"UI/UX Designer");
		dao.addRole(newRole);

		List<Role> roles2 = dao.getRoles();
		
		for(Role role : roles2) {
			System.out.println(role);
		}

	}

}

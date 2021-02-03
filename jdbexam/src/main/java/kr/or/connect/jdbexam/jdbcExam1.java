package kr.or.connect.jdbexam;
import kr.or.connect.jdbexam.dao.RoleDao;
import kr.or.connect.jdbexam.dto.Role;

public class jdbcExam1 {
	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(100);
		System.out.println(role);
	}

}

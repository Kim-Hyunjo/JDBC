package kr.or.connect.jdbexam.dto;

public class Role { //디비에서 객체 불러온 클래스
	private Integer roleId;
	private String description;
	public Role(Integer roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
	
	
	
}

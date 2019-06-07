package kr.or.ddit.user.model;

public class UserVO {

	private String userId;	// 유저 아이디
	private String name;	// 유저 이름
	private String alias;	// 유저 별명
	private String pass;	// 유저 비밀번호
	
	public UserVO() {

	}

	public UserVO(String userId, String name, String alias, String pass) {
		super();
		this.userId = userId;
		this.name = name;
		this.alias = alias;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", name=" + name + ", alias="
				+ alias + ", pass=" + pass + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}

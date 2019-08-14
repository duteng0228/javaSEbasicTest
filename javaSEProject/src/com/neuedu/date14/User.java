package com.neuedu.date14;

/**
* @ClassName: User
* @Description: user类
* @author student_dt
* @date 2019年8月14日 上午11:32:11
*
*/
public class User {
	
	public User() {
		
	}
	
	public User(String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	private String username;
	private String password;
	private String name;
	private String email;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

package com.ob.dto;

public class Users {

	public Users() {
		// TODO Auto-generated constructor stub
	}
	private String name,password,email,phone,confpwd;

	public Users(String name, String password, String email, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.confpwd = confpwd;
	}
	
	public String getName() {
		return name;
	}
	public String getconfpwd() {
		return confpwd;
	}
	
	public void setconfpwd(String confpwd) {
		this.confpwd = confpwd;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

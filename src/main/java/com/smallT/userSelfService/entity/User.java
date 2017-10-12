package com.smallT.userSelfService.entity;

import java.util.Date;

public class User {
	private int userId;
	private String regisName;
	private String password;
	private Date   registerDate;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisName() {
		return regisName;
	}
	public void setRegisName(String regisName) {
		this.regisName = regisName;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

}

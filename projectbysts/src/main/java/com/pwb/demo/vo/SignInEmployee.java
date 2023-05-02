package com.pwb.demo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_signin_employee")
public class SignInEmployee {
	
	@Id
	@Column(name="at_userid")
	private int userId;
	
	public SignInEmployee() {
		super();
	}

	@Column(name ="at_username")
	private String userName;
	
	@Column(name ="at_useremail")
	private String userEmail;

	public SignInEmployee(int userId, String userName, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	

}

package com.yama.springboot.domain;

import lombok.Data;

@Data
public class User {
	private String userId;
	private String password;
	private String userName;
	private String mailAddress;
	
	public User(String userId, String password,
			String userName, String mailAddress) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.mailAddress = mailAddress;
	}
}

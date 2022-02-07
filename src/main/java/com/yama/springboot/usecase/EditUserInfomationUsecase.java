package com.yama.springboot.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.UserRepository;

public class EditUserInfomationUsecase {
	
	@Autowired
	UserRepository userRepository;
	
	public void editUserInfomation(String targetUserId, String newPassword, 
			String newUserName, String newMailAddress) {
		
	}
	
}

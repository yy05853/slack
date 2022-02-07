package com.yama.springboot.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.UserRepository;
import com.yama.springboot.domain.User;

public class RegisterSystemUsecase {
	
	@Autowired
	UserRepository userRepository;

	public void registerSystem(String userId, String password,
			String userName, String mailAddress) {
		User user = new User(userId, password, userName, 
				mailAddress);
		userRepository.save(user);
	}
}

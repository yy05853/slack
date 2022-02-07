package com.yama.springboot.Repository;

import java.util.List;

import com.yama.springboot.domain.User;

public class UserRepository {
	
	List<User> userList;
	

	public void save(User user) {
		// テーブルにinsertする
	}
	
	public User getById(String targetUserId) {
		
		for(User user : userList) {
			if (user.getUserId().equals(targetUserId)) {
				return user;
			}
		}
		return null;
		
	}

	public void edit(String targetUserId, String newPassword, 
			String newUserName, String newMailAddress) {
		User user = getById(targetUserId);
		// TODO nullでなかったら、値を変える
	}
}

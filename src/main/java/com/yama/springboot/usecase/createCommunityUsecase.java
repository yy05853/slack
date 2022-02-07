package com.yama.springboot.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.CommunityRepository;
import com.yama.springboot.domain.Community;

public class createCommunityUsecase {
	
	@Autowired
	CommunityRepository communityRepository;
	
	public void createCommunity(
			String communityName, String hostId) throws Exception {
		Community community = new Community(communityName, hostId);
		communityRepository.save(community);
	}
}

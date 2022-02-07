package com.yama.springboot.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.CommunityRepository;
import com.yama.springboot.domain.Community;

public class JoinCommunityUsecase {

	@Autowired
	CommunityRepository communityRepository;
	
	public void inviteToCommunity(String communityId, 
			String guestId) {
		Community community = communityRepository.getById(communityId);
		community.getGuestIdList().add(guestId);
	}
}

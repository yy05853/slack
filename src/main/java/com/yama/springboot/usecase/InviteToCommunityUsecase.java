package com.yama.springboot.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.CommunityRepository;
import com.yama.springboot.domain.Community;

public class InviteToCommunityUsecase {
	
	@Autowired
	CommunityRepository communityRepository;
	
	public void inviteToCommunity(String communityId, 
			List<String> guestIdList) {
		Community community = communityRepository.getById(communityId);
		community.getGuestIdList().addAll(guestIdList);
	}
}

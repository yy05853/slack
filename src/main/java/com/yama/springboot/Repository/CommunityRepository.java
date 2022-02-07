package com.yama.springboot.Repository;

import java.util.List;

import com.yama.springboot.domain.Community;

public class CommunityRepository {
	
	List<Community> communityList;
	
	public void save(Community community) {
		// CommunityをテーブルにInsertする
	}
	
	public Community getById(String communityId) {
		for(Community community : communityList) {
			if (community.getCommunityId().equals(communityId)) {
				return community;
			}
		}
		return null;
	}
}

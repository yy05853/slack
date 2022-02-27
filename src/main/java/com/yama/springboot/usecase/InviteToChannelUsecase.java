package com.yama.springboot.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.ChannelRepository;
import com.yama.springboot.domain.Channel;

public class InviteToChannelUsecase {
	
	@Autowired
	ChannelRepository channelRepository;
	
	public void inviteToChannel(String channelId, 
								List<String> guestIdList) {
		Channel channel = channelRepository.getById(channelId);
		channel.getGuestIdList().addAll(guestIdList);
	}
}

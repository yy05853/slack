package com.yama.springboot.usecase;

import com.yama.springboot.Repository.ChannelRepository;
import com.yama.springboot.domain.Channel;

import org.springframework.beans.factory.annotation.Autowired;

public class JoinChannelUsecase {

	@Autowired
	ChannelRepository channelRepository;
	
	public void joinToChannel(String channelId, 
								String guestId) {
		Channel channel = channelRepository.getById(channelId);
		channel.getGuestIdList().add(guestId);
	}
}

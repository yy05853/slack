package com.yama.springboot.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.ChannelRepository;
import com.yama.springboot.domain.Channel;

public class CreateChannelUsecase {
	@Autowired
	ChannelRepository channelRepository;

	public void createChannel(
			String channelId, String hostId) throws Exception {
		Channel channel = new Channel(channelId, hostId);
		channelRepository.save(channel);
	}
}

package com.yama.springboot.usecase;

import com.yama.springboot.Repository.ChannelRepository;
import com.yama.springboot.domain.Channel;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CreateChannelUsecase {

	private final ChannelRepository channelRepository;

	public void createChannel(
			String channelName, String hostId) throws Exception {
		Channel channel = new Channel(channelName, hostId);
		channelRepository.save(channel);
	}
}

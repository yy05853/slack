package com.yama.springboot.Repository;

import java.util.List;

import com.yama.springboot.domain.Channel;

public class ChannelRepository {

	List<Channel> channelList;

	public void save(Channel channel) {
		// CommunityをテーブルにInsertする
	}

	public Channel getById(String channelId) {
		for(Channel channel : channelList) {
			if(channel.getChannelId().equals(channelId)) {
				return channel;
			}
		}
		return null;
	}
}

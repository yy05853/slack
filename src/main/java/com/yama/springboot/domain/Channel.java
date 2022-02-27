package com.yama.springboot.domain;

import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Channel {
	private String channelId;
	private List<String> hostIdList;
	private List<String> guestIdList;
	private List<String> commentIdList;
	private String channelName;

	public Channel(String channelName, String hostId) throws Exception{
		if(Objects.isNull(hostId)) {
			throw new Exception();
		}
		this.channelId = "1";
		this.hostIdList.add(hostId);
		this.channelName = channelName;

	}
}

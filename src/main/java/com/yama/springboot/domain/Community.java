package com.yama.springboot.domain;

import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Community {
	private String communityId;
	private List<String> hostIdList;
	private List<String> guestIdList;
	private List<String> channelIdList;
	private String communityName;

	public Community(String communityName, String hostId)  throws Exception {
		if(Objects.isNull(hostId)) {
			throw new Exception();
		}
	}

	public Community(String communityName) {
		
	}

}

package com.yama.springboot.usecase;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.yama.springboot.Repository.ChannelRepository;

class CreateChannelUsecaseTest {

	@InjectMocks
	CreateChannelUsecase createChannelUsecase;
	
	@Mock
	ChannelRepository channelRepository;
	
	@Test
	void createChannelTest() throws Exception{
		
		// テスト対象のクラスのインスタンスを生成する
		createChannelUsecase.createChannel("チャンネル1", "yukie");
		
		// 比較する
		assertEquals("チャンネル1",channelRepository.getById("1").getChannelName());
	}

}

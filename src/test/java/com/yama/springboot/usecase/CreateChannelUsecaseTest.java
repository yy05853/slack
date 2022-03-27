package com.yama.springboot.usecase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yama.springboot.Repository.ChannelRepository;
import com.yama.springboot.domain.Channel;

@ExtendWith(SpringExtension.class)
class CreateChannelUsecaseTest {

	@Mock
	ChannelRepository channelRepository;
	
	@InjectMocks
	CreateChannelUsecase createChannelUsecase;
	
	@Test
	void createChannelTest() throws Exception{
		
		// テスト対象のクラスのインスタンスを生成する
		createChannelUsecase.createChannel("チャンネル1", "yukie");
		
		Channel channel = new Channel("チャンネル1", "yukie");
		
        doReturn(channel).when(channelRepository).getById("1");
		assertEquals("チャンネル1",channelRepository.getById("1").getChannelName());
	}

}

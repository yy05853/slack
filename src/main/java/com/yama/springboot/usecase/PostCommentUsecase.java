package com.yama.springboot.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yama.springboot.Repository.CommentRepository;
import com.yama.springboot.domain.Comment;

public class PostCommentUsecase {
	@Autowired
	CommentRepository commentRepository;
	
	public void PostComment(
			String commentName, String hostId, List<String> mentionIdList) throws Exception {
		Comment comment = new Comment(commentName, hostId, mentionIdList);
		commentRepository.save(comment);
	}
}

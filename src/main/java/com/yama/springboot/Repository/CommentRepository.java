package com.yama.springboot.Repository;

import java.util.List;

import com.yama.springboot.domain.Comment;

public class CommentRepository {
	
	List<Comment> commentList;
	

	public void save(Comment comment) {
		// テーブルにinsertする
	}
	
	public Comment getById(String targetCommentId) {
		
		for(Comment comment : commentList) {
			if (comment.getUserId().equals(targetCommentId)) {
				return comment;
			}
		}
		return null;
		
	}

	public void edit(String targetCommentId, String newPassword, 
			String newCommentName, String newMailAddress) {
		Comment user = getById(targetCommentId);
		// TODO nullでなかったら、値を変える
	}
}

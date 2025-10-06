package com.springboot.bolg.services;

import org.springframework.stereotype.Service;

import com.springboot.bolg.payloads.CommentDto;

@Service
public interface CommentService {
	
	public CommentDto createComment(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);
	
}

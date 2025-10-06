package com.springboot.bolg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bolg.payloads.ApiResponse;
import com.springboot.bolg.payloads.CommentDto;
import com.springboot.bolg.services.CommentService;

@RestController
@RequestMapping("/api/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/post/{postId}/comments")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto comment, @PathVariable Integer postId){
			CommentDto commentD =  this.commentService.createComment(comment, postId);
			return new ResponseEntity<CommentDto>(commentD, HttpStatus.OK);
	}
	
	@PostMapping("/comments/{commentId}")
	public ResponseEntity<ApiResponse> deleteComment(@RequestBody CommentDto comment, @PathVariable Integer commentId){
			this.commentService.deleteComment(commentId);
			return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted sucessfully",true), HttpStatus.OK);
	}
	
	
}

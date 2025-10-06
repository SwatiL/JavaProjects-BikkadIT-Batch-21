package com.springboot.bolg.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.bolg.payloads.PostDto;
import com.springboot.bolg.payloads.PostResponse;
@Service
public interface PostService {
	
	//Create Post
	
		PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update Post
		
		PostDto updatePost(PostDto postDto, Integer postId);
	
	//Get Post By ID
		
		PostDto getPostById(Integer postId);
	
	//Get All Post
		
		PostResponse getAllPost(Integer pageNumber, Integer pageSize, String bySort, String sortDir);
	
	//Delete Post
		
		void deletePost(Integer postId);
		
	//Get All Post By Category
		
		List<PostDto> getPostByCategory(Integer categoryId);
		
	//Get All Post By User
		
		List<PostDto> getPostByUser(Integer userId);
		
	//Search Post by keyword
		
		List<PostDto> searchPosts(String keyword);
	
}

package com.springboot.bolg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bolg.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
}

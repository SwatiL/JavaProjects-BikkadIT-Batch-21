package com.springboot.bolg.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bolg.entities.Category;
import com.springboot.bolg.entities.Post;
import com.springboot.bolg.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByPostTitleContaining(String postTitle);
}

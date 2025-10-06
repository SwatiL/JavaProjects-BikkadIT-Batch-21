package com.springboot.bolg.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bolg.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	
}

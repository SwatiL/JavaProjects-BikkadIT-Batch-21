package com.springboot.bolg.services;

import java.util.List;

import com.springboot.bolg.payloads.CategoryDto;

public interface CategoryService {
	
	//Create
		
		CategoryDto createCategory( CategoryDto categoryDto);
	
	//Update
		
		CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
		
	//Delete
		
		public void deleteCategory(Integer categoryId);
	
	//get
		
		CategoryDto getCategory(Integer categoryId);
		
	//getAll
		
		List<CategoryDto> getAllCategories();
}

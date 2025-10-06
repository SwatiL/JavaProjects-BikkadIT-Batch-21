package com.springboot.bolg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bolg.payloads.ApiResponse;
import com.springboot.bolg.payloads.CategoryDto;
import com.springboot.bolg.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	//Create New Category
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
		
		CategoryDto createCategoryDto = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<>(createCategoryDto,HttpStatus.OK);	
	}
	
	//Update Category By ID
	
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto,@PathVariable Integer categoryId){
		
		CategoryDto updateCategory = this.categoryService.updateCategory(categoryDto, categoryId);
		return new  ResponseEntity<CategoryDto>(updateCategory,HttpStatus.OK);
	}
	
	//Delete Category By ID
	
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer categoryId){
		this.categoryService.deleteCategory(categoryId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category is deleted successfully..!",true),HttpStatus.OK);
	}
	
	//Get Category by ID
	
		@GetMapping("/{categoryId}")
		public ResponseEntity<CategoryDto> getCategoryById(@PathVariable Integer categoryId){
			CategoryDto categoryDto = this.categoryService.getCategory(categoryId);
			return new ResponseEntity<CategoryDto>(categoryDto,HttpStatus.OK);
		}
	
	//Get All Categories
		
		@GetMapping("/")
		public ResponseEntity<List<CategoryDto>> getAllCategories(){
			 List<CategoryDto> allCategories = this.categoryService.getAllCategories();
			return ResponseEntity.ok(allCategories);
		}
}

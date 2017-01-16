package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.CategoryDao;
import com.backend.model.Category;
@Controller
public class CategoryController {
	@Autowired
	CategoryDao categoryDao;
	@RequestMapping("/test2")
	public String Test2()
	{
		 Category category=new Category();
	        category.setCategoryName("Moto");
	        categoryDao.addCategory(category);
	        return "login";
	}
	

}

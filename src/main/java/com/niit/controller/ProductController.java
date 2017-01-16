package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.ProductDao;
import com.backend.model.Product;
@Controller
public class ProductController {
	@Autowired
	ProductDao productDao;
	@RequestMapping("/test1")
	public String Test1()
	{
		
	
	System.out.println("Product Controller");
	 Product product=new Product();
     product.setPname("test");
     product.setPrice(900.0f);
     productDao.addProduct(product);
     
	return "login";
	
	
	}
}

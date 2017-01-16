package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.UsersDao;
import com.backend.model.Users;

@Controller
public class HomeController {

	@Autowired
	UsersDao userDao;
	@RequestMapping("/test")
	public String Test()
	{
		System.out.println("Home Controller");
		Users user=new Users();
		user.setUsername("eshu");
		user.setPassword("eshu");
		userDao.registerUser(user);
		return "login";
	}
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("Iam from Controller");
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("Login RequestMapping is Done");
		return "login";
	}
	@RequestMapping("/register")
	public String register()
	{
		System.out.println("Register RequestMapping is Done");
		return "register";
	}
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		System.out.println("AboutUs RequestMapping is Done");
		return "aboutus";
	}
	@RequestMapping("/services")
	public String services()
	{
		System.out.println("Services RequestMapping is Done");
		return "services";
	}
	
}

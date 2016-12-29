package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
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

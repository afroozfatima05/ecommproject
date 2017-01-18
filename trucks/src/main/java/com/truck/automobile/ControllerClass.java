package com.truck.automobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.UsersDao;
import com.backend.model.Users;
 
@Controller
public class ControllerClass {
	
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println("index called");
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
		System.out.println("login called");
		return "login";
	}
	@RequestMapping("/SignUp")
	public String SignUp()
	{
		System.out.println("signup called");
		return "SignUp";
	}
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		System.out.println("signup called");
		return "aboutus";
	}
	@RequestMapping("/Services")
	public String Services()
	{
		System.out.println("signup called");
		return "Services";
	}
	@RequestMapping("/contactus")
	public String contactus()
	{
		System.out.println("signup called");
		return "contactus";
	}
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController
{

	@GetMapping("/form")
	public String form()
	{
		return "form";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
}
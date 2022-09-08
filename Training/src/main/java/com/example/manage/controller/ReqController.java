package com.example.manage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.manage.entity.Traineetb;
import com.example.manage.repository.TraineeRepo;
import com.example.manage.service.DataService;

@Controller
public class ReqController 
{
	
	
	@Autowired
	TraineeRepo Traineerepo;
	

	@Autowired
	DataService dataservice;
	
	@RequestMapping("/addtr")
	public String home()
	{
		return "addtrainee";
	}
	@RequestMapping("/sucess")
	@ResponseBody
	public String saveData(Traineetb trainee)
	{
		Traineerepo.save(trainee);
		return "sucess";
	}
	
	@RequestMapping("/addtr")
	public String addtr()
	{
		return "trainer";
	}
	
	
	@GetMapping("/get")
	public String getData(Model m)
	{
		m.addAttribute("data",dataservice.getAlldata());
		return "trainee"; 
		
	}
}

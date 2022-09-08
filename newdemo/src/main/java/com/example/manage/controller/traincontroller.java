package com.example.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.manage.entity.Trainer;
import com.example.manage.entity.language;
import com.example.manage.repository.languagerepo;
import com.example.manage.repository.trainerrepo;

@Controller
public class traincontroller
{
	
	
	
	@Autowired
	private trainerrepo trainerr;
	
	
	
	@Autowired
	private languagerepo langrepo;
	
	
	
	@RequestMapping("/addtrain")
	public String home()
	{
		return "trainer";
	}
	
	@RequestMapping("/sucess1")
	@ResponseBody
	public String saveData(Trainer trainer)
	{
		trainerr.save(trainer);
		return "sucess1";
	}
	
	@RequestMapping("/addlang")
	public String lang()
	{
		return "language";
	}
	
	@RequestMapping("/sucess2")
	@ResponseBody
	public String saveData(language lang)
	{
		langrepo.save(lang);
		return "sucess2";
	}
	
	
	
	
	
	/*
	 * @PostMapping("/addtran") public ResponseEntity<String>
	 * saveTrainers(@RequestBody List<Trrainer> trandata) {
	 * trainer.saveAll(trandata); return ResponseEntity.ok("Data saved"); }
	 */

}

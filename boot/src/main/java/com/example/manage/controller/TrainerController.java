package com.example.manage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.manage.dao.LanguagesRepo;
import com.example.manage.dao.TrainerRepo;
import com.example.manage.entity.Languages;
import com.example.manage.entity.Trainer;
import com.example.manage.services.TrainerService;

@Controller

public class TrainerController 
{
	@Autowired
	private TrainerService trainserv;
	
	@Autowired
	TrainerRepo trainerrepo;
	
	@Autowired LanguagesRepo langrepo;
	

	@GetMapping("/showtrainers")
	public String getTrain(Model model)  
	{
	
	List<Trainer>trainer= (List<Trainer>) trainerrepo.findAll();
	
	model.addAttribute("trainer", trainer);
	
	return "trainertb2";
	}
	
	
	@GetMapping("/trainerbyid/{id}")
	public Optional<Trainer> getTrainer(@PathVariable("id") int id, Model m)
	{
		Optional<Trainer> result=trainserv.getTrainerById(id);
		m.addAttribute("result", result);
		
		return result;
	}
	
	
	@PostMapping("/newtrainer")
	public String addTrainer(Trainer trainer,Model m)
	{
		
		m.addAttribute("result", this.trainserv.addtrainer(trainer));
	
		
		return "redirect:/showtrainers";
	}
	
	@GetMapping("/trainer/delete/{id}")
	public String deleteTrainer(Trainer trainer, @PathVariable("id") int id,Model m)
	{
		trainerrepo.deleteById(id);
//		this.trainserv.deleteTrainer(trainid);
		
		return "redirect:/showtrainers";
	}
	
//	@GetMapping("/trainer/edit/{id}")
	
	
	
	@GetMapping("/trainer/edit/{id}")
	public String updateTrainer(Trainer trainer,@PathVariable("id") int id, Model m)
	{
		List<Languages> languagelist= (List<Languages>) langrepo.findAll();
		m.addAttribute("languagelist",languagelist);
		trainer= trainerrepo.findById(id).get();
		m.addAttribute("trainer",trainer);
		
		
		return "addtrainer";
	}
	
	
}

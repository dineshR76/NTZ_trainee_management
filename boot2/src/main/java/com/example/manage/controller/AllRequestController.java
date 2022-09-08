package com.example.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.manage.dao.LanguagesRepo;
import com.example.manage.dao.TraineeRepo;
import com.example.manage.dao.TrainerRepo;
import com.example.manage.entity.Languages;
import com.example.manage.entity.Trainee;
import com.example.manage.entity.Trainer;
import com.example.manage.services.TraineeService;
import com.example.manage.services.TrainerService;

@Controller
public class AllRequestController 
{
	@Autowired
	private TrainerService trainerserv;
	
	@Autowired
	private TrainerRepo trainerrepo;
	
	@Autowired
	private LanguagesRepo langrepo;
	
	@Autowired
	private TraineeRepo traineerepo;
	
	@Autowired
	private TraineeService traineeserv;
	
	@GetMapping("/dashboard")
	public String dash()
	{
		return "dashboard";
	}
	
	//add new trainers
	@GetMapping("/addtrainers")
	public String addtrainer(Model m)
	{
		List<Languages> languagelist= (List<Languages>) langrepo.findAll();
		m.addAttribute("languagelist",languagelist);
		
		List<Trainee> traineelist= (List<Trainee>) traineerepo.findAll();
		m.addAttribute("traineelist",traineelist);
		
		m.addAttribute("trainer", new Trainer());
		return "addtrainer";
	}
	
	@GetMapping("/addtrainee")
	public String addtrainee(Model m)
	{
		List<Languages> languagelist= (List<Languages>) langrepo.findAll();
		m.addAttribute("languagelist",languagelist);
		
		List<Trainer> trainerlist= trainerrepo.findAll();
		m.addAttribute("trainerlist",trainerlist);
		
		m.addAttribute("trainee", new Trainee());
		return "addtrainee";
	}
	
	
	
	
	
//	@GetMapping("/disptrainer")
//	public String showTrainers(Model model)
//	{
//		List<Trainer> trainers = (List<Trainer>) trainerrepo.findAll();
//		 model.addAttribute("trainers", trainers);
//		 
//		 return "trainertb1";  
//	}
	
	
	
	
	@PostMapping("/addtrainerr")
	public Trainer addTrainers(@RequestBody Trainer trainer)
	{
		Trainer t=this.trainerserv.addTrainers(trainer);
		
		return t;
	}
	
	
	
	
//	@PutMapping("/trainee/{trainee_id}")
//	public Trainee updateTrainee(@RequestBody Trainee train,@PathVariable("trainee_id") int tid)
//	{
//		this.traineeserv.updateTrainee(train,tid);
//		return train;
//	}
	
}

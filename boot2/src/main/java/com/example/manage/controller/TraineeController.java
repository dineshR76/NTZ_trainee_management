package com.example.manage.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.manage.dao.LanguagesRepo;
import com.example.manage.dao.TraineeRepo;
import com.example.manage.dao.TrainerRepo;
import com.example.manage.entity.Languages;
import com.example.manage.entity.Trainee;
import com.example.manage.entity.Trainer;
import com.example.manage.services.TraineeService;


@Controller
public class TraineeController
{
@Autowired
	private TraineeService traineeserv;
	
	@Autowired
	TraineeRepo traineerepo;
	
	@Autowired LanguagesRepo langrepo;
	
	@Autowired TrainerRepo trainerrepo;
	

	@GetMapping("/showtrainees")
	public String getTrain(Model model)  
	{
	
	List<Trainee>trainee= (List<Trainee>) traineerepo.findAll();
	
	model.addAttribute("trainee", trainee);
	
	
	return "traineetb";
	}
	
	@GetMapping("/trainee/{trainee_id}")
	public Optional<Trainee> getTrainee(@PathVariable("trainee_id") int trainee_id)
	{
		return traineeserv.getTraineeById(trainee_id);
	}
	
	
	@PostMapping("/newtrainee")
	public String addTrainee(Trainee trainee,Model m)
	{
		
		m.addAttribute("result1", this.traineeserv.addTrainee(trainee));
	
		
		return "redirect:/showtrainees";
	}
	
	@GetMapping("/trainee/delete/{id}")
	public String deleteTrainee(Trainee trainee, @PathVariable("id") int id,Model m)
	{
		traineerepo.deleteById(id);
		
		return "redirect:/showtrainees";
	}
	
	@GetMapping("/trainee/edit/{id}")
	public String updateTrainee(Trainee trainee,@PathVariable("id") int id, Model m)
	{
		List<Languages> languagelist= (List<Languages>) langrepo.findAll();
		m.addAttribute("languagelist",languagelist);
		
		List<Trainer> trainerlist= trainerrepo.findAll();
		m.addAttribute("trainerlist",trainerlist);
		
		trainee= traineerepo.findById(id).get();
		m.addAttribute("trainee",trainee);
		
		
		return "addtrainee";
	}
	
	
	@RequestMapping("/testing")
	@ResponseBody
	public void test()
	{
		List<Trainee> alltrainee=this.traineerepo.getAllTrainee();
		alltrainee.forEach(e->{System.out.println(e);});
	}
	
	
	}
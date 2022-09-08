package com.example.manage.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.manage.dao.TraineeRepo;
import com.example.manage.entity.Trainee;
import com.example.manage.services.TraineeService;


@RestController
public class TraineeController
{
@Autowired
	private TraineeService traineeserv;
	
	@Autowired
	TraineeRepo traineerepo;

	@GetMapping("/trainee")
	public List<Trainee> getTrainee()
	{
	
	return this.traineeserv.getAllTrainee();
	}
	
	
	@GetMapping("/trainee/{trainee_id}")
	public Optional<Trainee> getTrainee(@PathVariable("trainee_id") int trainee_id)
	{
		return traineeserv.getTraineeById(trainee_id);
	}
	
	
	@PostMapping("/addtrainee")
	public Trainee addTrainee(@RequestBody Trainee trainee)
	{
		Trainee t=this.traineeserv.addTrainee(trainee);
		return t;
	}
	
	@DeleteMapping("/trainee/{trainee_id}")
	public void deleteTrainee(@PathVariable("trainee_id") int traineeid)
	{
		this.traineeserv.deleteTrainee(traineeid);
	}
//	
//	@PutMapping("/trainee/{trainee_id}")
//	public Trainee updateTrainee(@RequestBody Trainee train,@PathVariable("trainee_id") int tid)
//	{
//		this.traineeserv.updateTrainee(train,tid);
//		return train;
//	}
	}
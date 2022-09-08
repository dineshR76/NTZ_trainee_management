package com.example.manage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manage.dao.TraineeRepo;
import com.example.manage.entity.Languages;
import com.example.manage.entity.Trainee;
@Component
public class TraineeService 
{
	@Autowired
	private TraineeRepo traineerepo;


//get all  languages
 public List<Trainee> getAllTrainee()
 {
	 List<Trainee> list=(List<Trainee>)this.traineerepo.findAll();
	 return list;
 }
 
 //get single language by id
 public Optional<Trainee> getTraineeById(int lang_id)
 {
	 Optional<Trainee> trainee= null;

	 try
	 {
		 trainee = this.traineerepo.findById(lang_id);
	 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return trainee;
 }
 
 //adding the language
 public Trainee addTrainee(Trainee t)
 {
	 Trainee result=traineerepo.save(t);
	 
	 return result;
 }
 
 //delete language
 public void deleteTrainee(int lid)
 {

	 traineerepo.deleteById(lid);
 }
 
// public void updateTrainee(Trainee trainee, int tid)
// {
//
//	 trainee.setId(tid);
//	 traineerepo.save(trainee);
//	 
// }
}



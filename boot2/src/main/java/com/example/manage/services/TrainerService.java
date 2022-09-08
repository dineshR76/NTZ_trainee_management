package com.example.manage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manage.dao.TrainerRepo;
import com.example.manage.entity.Trainer;

@Component
public class TrainerService
{
	
	@Autowired
	private TrainerRepo trainrepo;

// private static List<Trainer> list = new ArrayList<>();
// 
// static {
//	 list.add(new Trainer(11,"Nidhi","Java"));
//	 list.add(new Trainer(12,"Akshay","MernStack"));
//	 list.add(new Trainer(13,"Sanjeev","Python"));
// }
// 
 

	
	
	
//get all  trainer
 public List<Trainer> getAllTrainers()
 {
	 List<Trainer> list=(List<Trainer>)this.trainrepo.findAll();
	 return list;
 }
 
 //get single trainer by id
 public Optional<Trainer> getTrainerById(int train_id)
 {
	 Optional<Trainer> trainer= null;
//	train= list.stream().filter(e-> e.getTrain_id() ==train_id).findFirst().get();
	 try
	 {
		 trainer = this.trainrepo.findById(train_id);
	 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return trainer;
 }
 
 //adding the trainer
 public Trainer addtrainer(Trainer t)
 {
	 Trainer result=trainrepo.save(t);
	 
	 return result;
 }
 
 //delete trainer
 public void deleteTrainer(int tid)
 {
//	 list.stream().filter(e->e.getTrain_id()!=tid).collect(Collectors.toList());
	 
	 trainrepo.deleteById(tid);
 }
 
 //update the book
 public void updateTrainer(Trainer trainer, int trainid)
 {
//	 list=list.stream().map(t->{
//		 if(t.getTrain_id()==trainid)
//		 {
//			 t.setName(train.getName());
//			 t.setSkillset(train.getSkillset());
//		 }
//		 return t;
//	 }).collect(Collectors.toList());
	 
	 trainer.setId(trainid);
	 trainrepo.save(trainer);
	 
	 
 }
 
 
 public Trainer addTrainers(Trainer t)
 {
	 Trainer result=trainrepo.save(t);
	 
	 return result;
 }


 
 
}

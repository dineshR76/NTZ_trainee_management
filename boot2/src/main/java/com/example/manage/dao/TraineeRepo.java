package com.example.manage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.manage.entity.Trainee;

public interface TraineeRepo extends CrudRepository<Trainee, Integer>
{
 
	
	@Query("select u from Trainee u")
	public List<Trainee> getAllTrainee();

}

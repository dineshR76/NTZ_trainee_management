package com.example.manage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manage.entity.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Integer> {
	
//	public Trainer findByTrain_id(int train_id);

}

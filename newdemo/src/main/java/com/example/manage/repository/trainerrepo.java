package com.example.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manage.entity.Trainer;

public interface trainerrepo extends JpaRepository<Trainer, Integer>{

}

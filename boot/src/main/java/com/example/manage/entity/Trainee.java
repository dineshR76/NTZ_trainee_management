package com.example.manage.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TraineeDetail")
public class Trainee
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 
 
 private String name;
 

 private String email;
 
 
 
 
 
// @ManyToMany(cascade=CascadeType.PERSIST)
//	@JoinTable(name="trainee_trainer",
//				joinColumns=@JoinColumn(name="trainee_id"),
//				inverseJoinColumns= @JoinColumn(name="trainer_id"))
//private List<Trainer> trainers = new ArrayList<>();
 
 

//public Trainee(int id, String name, String email, List<Trainer> trainers) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.email = email;
//	this.trainers = trainers;
//}
//
//
//
//public int getId() {
//	return id;
//}
//
//
//
//public void setId(int trainee_id) {
//	this.id = trainee_id;
//}
//
//
//
//public String getName() {
//	return name;
//}
//
//
//
//public void setName(String name) {
//	this.name = name;
//}
//
//
//
//public String getEmail() {
//	return email;
//}
//
//
//
//public void setEmail(String email) {
//	this.email = email;
//}
//
//
//
//public List<Trainer> getTrainers() {
//	return trainers;
//}
//
//
//
//public void setTrainers(List<Trainer> trainers) {
//	this.trainers = trainers;
//}
//
//
//
//public Trainee() {
//	super();
//}


 
}

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
@Table(name="TraineeDetail2")
public class Trainee
{
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 
 
 private String name;
 

 private String email;
 
 
 
 
 
// @ManyToMany(cascade=CascadeType.PERSIST, mappedBy = "trainee")
//private List<Trainer> trainers = new ArrayList<>();
// 
 
@ManyToMany(cascade=CascadeType.PERSIST, mappedBy="trainee")
private List<Trainer> trainers=new ArrayList<>();


@ManyToMany(cascade=CascadeType.PERSIST, mappedBy="trainees")
private List<Languages> lang=new ArrayList<>();


public Trainee() {
	super();
}





//public Trainee(List<Languages> lang) {
//	super();
//	this.lang = lang;
//}





public List<Languages> getLang() {
	return lang;
}





public void setLang(List<Languages> lang) {
	this.lang = lang;
}





public Trainee(List<Trainer> trainers) {
	super();
	this.trainers = trainers;
}





public List<Trainer> getTrainers() {
	return trainers;
}





public void setTrainers(List<Trainer> trainers) {
	this.trainers = trainers;
}





public Trainee(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}





public int getId() {
	return id;
}





public void setId(int id) {
	this.id = id;
}





public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getEmail() {
	return email;
}





public void setEmail(String email) {
	this.email = email;
}





@Override
public String toString() {
	return "Trainee [id=" + id + ", name=" + name + ", email=" + email + ", trainers=" + trainers + ", lang=" + lang
			+ "]";
}


 
}

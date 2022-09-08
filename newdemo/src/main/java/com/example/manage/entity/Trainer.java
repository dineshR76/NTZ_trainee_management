package com.example.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
	
private String name;

@Column(unique=true)
private String email;


//private Set<language> skillset= new  HashSet<>();


public int getTrain_id() {
	return id;
}


public void setTrain_id(int id) {
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


//public Set<language> getSkillset() {
//	return skillset;
//}
//
//
//public void setSkillset(Set<language> skillset) {
//	this.skillset = skillset;
//}



}

package com.example.manage.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class language 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String lang;
	
	@ManyToMany
	@JoinTable(name="lang_skill",
				joinColumns=@JoinColumn(name="skill_id"),
				inverseJoinColumns= @JoinColumn(name="train_id"))
private Set<Trainer> trainer= new HashSet<>();


public int getSkill_id() {
	return id;
}


public void setSkill_id(int skill_id) {
	this.id = skill_id;
}


public String getLang() {
	return lang;
}


public void setLang(String lang) {
	this.lang = lang;
}


public Set<Trainer> getTrainer() {
	return trainer;
}


public void setTrainer(Set<Trainer> trainer) {
	this.trainer = trainer;
}
	
	
	

	
}

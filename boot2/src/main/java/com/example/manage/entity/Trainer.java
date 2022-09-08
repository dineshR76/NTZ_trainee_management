package com.example.manage.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainerDetail2")
public class Trainer
{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	

	private String name;
	
	@Column(unique=true)
	private String email;
	
	@ManyToMany(cascade =CascadeType.PERSIST,
                mappedBy = "trainer")
	private List<Languages> lang = new ArrayList<>();
	

	@ManyToMany(cascade=CascadeType.PERSIST)
private List<Trainee> trainee= new ArrayList<>();



	@Override
	public String toString() {
		return  name;
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



	public List<Languages> getLang() {
		return lang;
	}



	public void setLang(List<Languages> lang) {
		this.lang = lang;
	}



	public List<Trainee> getTrainee() {
		return trainee;
	}



	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}



	



	public Trainer(int id, String name, String email, List<Languages> lang, List<Trainee> trainee) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.lang = lang;
		this.trainee = trainee;
	}



	public Trainer() {
		super();
	}
	
	
	


	
}

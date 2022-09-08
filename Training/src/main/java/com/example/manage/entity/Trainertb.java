package com.example.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainer_table")
public class Trainertb 
{
	@Id
	@Column(name="Trainer_id")
	private int id;
	
	@Column(name="Trainer_name")
	private String name;
	
	@Column(name="Trainer_email")
	private String email;

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

	public Trainertb(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Trainertb() {
		super();
	}


	
	
	
}

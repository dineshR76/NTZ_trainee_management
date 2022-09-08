package com.example.manage.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	


	
	public Trainer(int id, String name, String email, List<Languages> lang) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.lang = lang;
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

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", email=" + email + ", lang=" + lang + "]";
	}

	public Trainer() {
		super();
	}
	
	
	


	
}

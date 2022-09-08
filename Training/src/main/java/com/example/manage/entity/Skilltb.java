package com.example.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skill_table")
public class Skilltb 
{
	@Id
	@Column(name="lang_id")
	private int id;
	
	@Column(name="Skill_Set")
	private String skillSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	
	public Skilltb(int id, String skillSet) {
		super();
		this.id = id;
		this.skillSet = skillSet;
	}

	public Skilltb() {
		super();
	}
	
	
	
}

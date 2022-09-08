package com.example.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Traineetb")
public class Traineetb
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Trainee_id")
private int id;

@Column(name="Traine_name")
private String name;

@Column(name="Trainee_mobile")
private String mobile;

@Column(name="Trainee_email")
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

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public Traineetb(int id, String name, String mobile, String email) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.email = email;
}

public Traineetb() {
	super();
}


}
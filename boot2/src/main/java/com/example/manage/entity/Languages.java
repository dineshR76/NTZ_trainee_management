package com.example.manage.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
@Table(name="skillDetails2")
public class Languages 
{


		@Override
	public String toString() {
		return  language;
	}


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		@Column(unique=true)
		private String language;
		
		
		
		@ManyToMany(cascade=CascadeType.PERSIST)
		@JoinTable(name="lang_skill",
					joinColumns=@JoinColumn(name="skill_id"),
					inverseJoinColumns= @JoinColumn(name="train_id"))
	private List<Trainer> trainer= new ArrayList<>();
		
		
		@ManyToMany(cascade=CascadeType.PERSIST)
		private List<Trainee> trainees= new ArrayList<>();
		

		public Languages(List<Trainee> trainees) {
			super();
			this.trainees = trainees;
		}


		public List<Trainee> getTrainee() {
			return trainees;
		}


		public void setTrainee(List<Trainee> trainee) {
			this.trainees = trainee;
		}


		public Languages(int id, String language, List<Trainer> trainer) {
			super();
			this.id = id;
			this.language = language;
			this.trainer = trainer;
		}


		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getLanguage() {
			return language;
		}



		public void setLanguage(String language) {
			this.language = language;
		}



		public List<Trainer> getTrainer() {
			return trainer;
		}



		public void setTrainer(List<Trainer> trainer) {
			this.trainer = trainer;
		}


		public Languages() {
			super();
		}
		

		
		
		
}

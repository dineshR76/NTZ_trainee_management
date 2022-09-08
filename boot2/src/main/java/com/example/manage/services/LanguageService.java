package com.example.manage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manage.dao.LanguagesRepo;
import com.example.manage.dao.TrainerRepo;
import com.example.manage.entity.Languages;
import com.example.manage.entity.Trainer;

@Component
public class LanguageService
{
	@Autowired
	private LanguagesRepo langrepo;
	
	


//get all  languages
 public List<Languages> getAllLang()
 {
	 List<Languages> list=(List<Languages>)this.langrepo.findAll();
	 return list;
 }
 
 //get single language by id
 public Optional<Languages> getLangById(int lang_id)
 {
	 Optional<Languages> lang= null;

	 try
	 {
		 lang = this.langrepo.findById(lang_id);
	 }
	 catch (Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return lang;
 }
 
 //adding the language
 public Languages addLang(Languages l)
 {
	 Languages result=langrepo.save(l);
	 
	 return result;
 }
 
 //delete language
 public void deleteLang(int lid)
 {

	 langrepo.deleteById(lid);
 }
 
 //update the language
 public void updateLang(Languages lang, int langid)
 {

	 lang.setId(langid);
	 langrepo.save(lang);
	 
 }

}

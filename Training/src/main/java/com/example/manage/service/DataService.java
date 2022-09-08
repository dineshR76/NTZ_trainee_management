package com.example.manage.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manage.entity.Traineetb;
import com.example.manage.repository.TraineeRepo;

@Component
public class DataService 
{
	@Autowired
	private TraineeRepo traineerepo;

	
	public ArrayList<Map<String, String>> getAlldata()
	{
		List<Traineetb> list=(List<Traineetb>) this.traineerepo.findAll();
		
		ArrayList<Map<String, String>> l = new ArrayList<Map<String,String>>(); 
		list.stream().forEach((data)->{
			   Map<String ,String> m=new HashMap<String ,String>();
			   m.put(("id"),Integer.toString(data.getId()));
			   m.put(("fname"),data.getFname());
			   m.put(("lname"),data.getLname());
			   l.add(m);
			
			
		});
		return l;
}
}

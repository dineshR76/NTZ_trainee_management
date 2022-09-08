package com.example.url.model;

import java.util.HashMap;
import java.util.Map;

public class CategoryKeyword
{
		 
private Integer keyid;
private String catg;

HashMap<String, String> kw=   new HashMap<String, String>();


public void addkw(String keyid, String catg)
{
kw.put(keyid,catg);
}


public void display()
{
	System.out.println(kw);
}


public Integer getKeyid() {
	return keyid;
}


public void setKeyid(Integer keyid) {
	this.keyid = keyid;
}


public String getCatg() {
	return catg;
}


public void setCatg(String catg) {
	this.catg = catg;
}

//getting hashmap
public HashMap<String, String> getKw() {
	return kw;
}


public void setKw(HashMap<S, String> kw) {
	this.kw = kw;
}


}
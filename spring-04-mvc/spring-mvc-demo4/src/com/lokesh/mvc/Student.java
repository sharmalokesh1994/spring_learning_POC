package com.lokesh.mvc;

import java.util.LinkedHashMap;



public class Student {
	
	String firstName;
	String lastName;
	
	String country;
	
	String state;
	
	String favLanguage;
	
	String favOS[]; 
	
	
	LinkedHashMap<String, String> stateOptions;
	
	
	Student(){
		stateOptions = new LinkedHashMap<>();
		
		stateOptions.put("RJ", "Raj");
		stateOptions.put("MP", "Madhya");
		stateOptions.put("DE", "Delhi");
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getStateOptions() {
		return stateOptions;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getFavLanguage() {
		return favLanguage;
	}


	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}


	public String[] getFavOS() {
		return favOS;
	}


	public void setFavOS(String[] favOS) {
		this.favOS = favOS;
	}
	
	
	

}

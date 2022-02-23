package com.example.MyApp.Object;

import java.util.LinkedHashMap;
import java.util.LinkedList;




public class Student {

	//@NotNull
	//@Size(min = 1, message = "required field")
	private String firstName;
	
	//@NotNull
	//@Size(min = 1, message = "required field")
	private String lastName;
	
	private String country;
	private String language;
	private String os;
	
	private LinkedHashMap<String,String> countryOptions;
	private LinkedList<String> languageOptions;
	private LinkedList<String> osOptions;

	public Student() {
		
		countryOptions = new LinkedHashMap<String,String>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "America");
		
		languageOptions = new LinkedList<String>();
		languageOptions.add("Java");
		languageOptions.add("DotNet");
		languageOptions.add("C#");
		languageOptions.add("Ruby");
		
		osOptions = new LinkedList<String>();
		osOptions.add("Windows");
		osOptions.add("MACOS");
		osOptions.add("Linux");

	}
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public LinkedList<String> getLanguageOptions() {
		return languageOptions;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public LinkedList<String> getOsOptions() {
		return osOptions;
	}


	
	
	
}

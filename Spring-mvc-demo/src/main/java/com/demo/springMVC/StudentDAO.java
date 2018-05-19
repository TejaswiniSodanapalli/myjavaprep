package com.demo.springMVC;

import java.util.HashMap;

public class StudentDAO {

	private String studentFirstName;
	private String studentLastName;
	private String country;private String favLanguage; private String OperatingSystem;
	 HashMap<String, String> map;
	 
	public StudentDAO() { map= new HashMap<String, String>();
		map.put("INR","india"); map.put("DCE","GERMANY");  map.put("BRA","brazil");  map.put("FRC","france");  map.put("CH","chain");  
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	public String getFavLanguage() {
		return favLanguage;
	}
	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}
	public String getOperatingSystem() {
		return OperatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	
}

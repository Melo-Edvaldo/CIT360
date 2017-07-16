package cit360.spring2017.json_example;

import java.sql.Timestamp;
//import json.JSONObject;

public class Student {
	private String Enrollment;
	private String Name;
	private Timestamp Birth;
	private int Age;
	
	public String toJson() {
		String json = "{enrollment:'"+this.Enrollment+"',name:'"+this.Name+"',birth:'"+this.Birth+"',age:'"+this.Age+"'}";
		return json;
	}
	
	public String getEnrollment() {
		return Enrollment;
	}
	public void setEnrollment(String enrollment) {
		Enrollment = enrollment;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Timestamp getBirth() {
		return Birth;
	}
	public void setBirth(Timestamp birth) {
		Birth = birth;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}

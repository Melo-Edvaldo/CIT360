package cit360.spring2017.json_example;

import java.sql.Timestamp;

public class CIT360 {
	
	public static void main(String[] args) {
		Student a = new Student();
		a.setName("Edvaldo");
		a.setEnrollment("488208109");
		a.setAge(42);
		a.setBirth(Timestamp.valueOf("1974-12-22 00:00:00"));
		
		System.out.println(a.toJson());
		
		}
}

// Output
// {enrollment:'488208109',name:'Edvaldo',birth:'1974-12-22 00:00:00',age:'42'}
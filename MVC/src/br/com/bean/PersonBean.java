package br.com.bean;

public class PersonBean {
	
	private String name;
	private String email;
	
	//Complete Constructor
	public PersonBean(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	//Pattern Constructor
	public PersonBean() {
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}

package de.demmer.dennis;

public class User {
	
	private int id;
	private String name;
	private int age;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public void setAge(int neuesAlter) {
		
		if(neuesAlter < 1) {
			neuesAlter = 1;
			System.out.println("Alter war unter 1. Alter auf 1 gesetzt");
		}
		
		age = neuesAlter;
	}
	
	
	public int getAge() {
		
		return age;
	}
	
	

}

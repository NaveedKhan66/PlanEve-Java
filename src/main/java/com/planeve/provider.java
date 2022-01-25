package com.planeve;

public class provider {
	public String name;
	public String email;
	public String username;
	public String password;
	public String type;
	public String description;
	
	
	
	provider(){
		
	}
	public provider(String name, String email, String username, String password, String type, String desc) {
		this.name= name;
		this.email=email;
		this.username=username;
		this.password=password;
		this.type=type;
		this.description=desc;
	}
	public void setDescription(String desc) {
		description=desc;
	}
}

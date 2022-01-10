package com.planeve;

public class ServiceProvider {
	public String name;
	public String email;
	public String category;
	public String companyName;
	public double rating;
	public String phoneNo;
	public String username;
	public String password;
	
	public ServiceProvider(String name, String email, String category, String companyName, String phoneNo, String username, String password) {
		this.name= name;
		this.phoneNo = phoneNo;
		this.category = category;
		this.companyName=companyName;
		this.rating = 5.0;
		this.email=email;
		this.username=username;
		this.password=password;
	}

}

package com.planeve;

import java.io.Serializable;

public class User implements Serializable {
	public String name;
	public String email;
	public String phoneNo;
	public String username;
	public String password;
	
	public User(String name, String email, String phoneNo, String username, String password) {
		this.name= name;
		this.phoneNo = phoneNo;
		this.email=email;
		this.username=username;
		this.password=password;
	}
}

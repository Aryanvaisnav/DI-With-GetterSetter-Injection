package com.jsp.gettersetter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	private String email;
	
	public Student() {
		System.out.println("Object Created");
	}
	
	
	public int getId() {
		return id;
	}
	@Value (value = "125")
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	@Value (value = "Tom")
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	@Value (value = "tom@mail.com")
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void studentDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
	

}

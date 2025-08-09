package com.tnsif.springcore_example;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	
	public Student()  //default constructor
	{
		System.out.println("Student object is created..");
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void display() {
		System.out.println("student: "+name);
	}
	
	

}
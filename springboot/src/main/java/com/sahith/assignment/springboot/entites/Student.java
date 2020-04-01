package com.sahith.assignment.springboot.entites;

import org.springframework.beans.factory.annotation.Autowired;



public class Student 
{

	private String firstName;
	private String lastName;
	private String  email;
	
	@Autowired
	private Address address;
	
	public Student()
	{
		System.out.println("inside student constructor");
	}
	public Student(String firstName, String lastName, String email, Address address) 
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
	
}

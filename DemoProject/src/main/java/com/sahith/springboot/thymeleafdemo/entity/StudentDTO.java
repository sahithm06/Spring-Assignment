package com.sahith.springboot.thymeleafdemo.entity;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO 
{

	// define fields

	private int id;
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String email;
	
	
	private String address;
		
	// define constructors
	
	public StudentDTO() {
		
	}

	public StudentDTO(int id,String firstName, String lastName, String email,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address=address;
	}
	
	public StudentDTO(String firstName, String lastName, String email,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address=address;
	}

	// define getter/setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + "]";
	}
		
}












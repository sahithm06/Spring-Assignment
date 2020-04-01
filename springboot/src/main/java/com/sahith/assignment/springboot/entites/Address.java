package com.sahith.assignment.springboot.entites;

import org.springframework.stereotype.Component;


public class Address
{
	private String city;
	private String state;
	private String houseNo;
	
	public Address()
	{
		
		System.out.println("inside constructor address");
		
	}
	
	public Address(String city, String state, String houseNo)
	{
	
		this.city = city;
		this.state = state;
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	@Override
	public String toString() 
	{
		return "Address [city=" + city + ", state=" + state + ", houseNo=" + houseNo + "]";
	}
	
	

}

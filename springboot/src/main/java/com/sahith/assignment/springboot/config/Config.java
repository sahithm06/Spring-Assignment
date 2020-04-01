package com.sahith.assignment.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sahith.assignment.springboot.entites.Address;
import com.sahith.assignment.springboot.entites.Student;

@Configuration
public class Config 
{ 
	@Bean
	public Address address()
	{
		return new Address();
	}
	
	@Bean
	public Student student()
	{
		return new Student();
	}
	
	

}

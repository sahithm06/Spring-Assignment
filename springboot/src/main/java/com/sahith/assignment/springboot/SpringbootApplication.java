package com.sahith.assignment.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.sahith.assignment.springboot.config.Config;
import com.sahith.assignment.springboot.entites.Address;
import com.sahith.assignment.springboot.entites.Student;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Student student= context.getBean("student",Student.class);
		
		Address addr=student.getAddress();
		addr.setCity("hyderabad");
		addr.setHouseNo("4-124/1");
		addr.setState("telangana");
		
		student.setEmail("sahith@gmail.com");
		student.setFirstName("sahith");
		student.setLastName("rao");
		
		
		
		System.out.println(student);
		
		context.close();		
	}

}

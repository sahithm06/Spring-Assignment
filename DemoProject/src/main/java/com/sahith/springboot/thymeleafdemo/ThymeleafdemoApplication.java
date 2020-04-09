package com.sahith.springboot.thymeleafdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//autoconfigure ,componentscan,configuration
@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() 
	{
		return new ModelMapper();
	}

}

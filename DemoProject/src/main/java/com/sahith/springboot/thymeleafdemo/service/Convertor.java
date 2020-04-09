package com.sahith.springboot.thymeleafdemo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sahith.springboot.thymeleafdemo.entity.Student;
import com.sahith.springboot.thymeleafdemo.entity.StudentDTO;

@Component
public class Convertor 
{
	@Autowired
	private ModelMapper modelMapper;
	
	public StudentDTO convertToDTO(Student student)
	{
		StudentDTO studentDTO=modelMapper.map(student, StudentDTO.class);
		return studentDTO;
	}

}

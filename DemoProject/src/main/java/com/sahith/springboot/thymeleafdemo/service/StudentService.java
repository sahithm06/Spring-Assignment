package com.sahith.springboot.thymeleafdemo.service;

import java.util.List;

import com.sahith.springboot.thymeleafdemo.entity.Student;
import com.sahith.springboot.thymeleafdemo.entity.StudentDTO;



public interface StudentService 
{
	List<StudentDTO> findAll();
	
	StudentDTO findById(int id);
	
	void save(Student emp);
	
	void deleteById(int id);
	
	

}

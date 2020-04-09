package com.sahith.springboot.thymeleafdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahith.springboot.thymeleafdemo.dao.StudentRepository;
import com.sahith.springboot.thymeleafdemo.entity.Student;
import com.sahith.springboot.thymeleafdemo.entity.StudentDTO;



@Service
public class StudentServiceImpl implements StudentService 
{

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private Convertor convertor;
	
	@Override
	public List<StudentDTO> findAll()
	{
		List<Student> student=studentRepo.findAllByOrderByLastNameAsc();
		List<StudentDTO> studentdto=new ArrayList<>();
		
		for(Student stu:student)
		{
			studentdto.add(convertor.convertToDTO(stu));
		}

		return studentdto;
		
	}

	@Override	
	public StudentDTO findById(int id)
	{
		
		Optional<Student> result = studentRepo.findById(id);
		
		
		
		StudentDTO stuDTO=null;
		if(result.isPresent())
		{
			Student student=result.get();
			stuDTO= convertor.convertToDTO(student);
		}
		else
		{
			//we didnt find the emp
			throw new RuntimeException("didnt find the stu id"+id);
		}
		return stuDTO;
	}

	@Override	
	public void save(Student emp) 
	{
		studentRepo.save(emp);
		
	}

	@Override	
	public void deleteById(int id) 
	{
			
		studentRepo.deleteById(id);
	}


}


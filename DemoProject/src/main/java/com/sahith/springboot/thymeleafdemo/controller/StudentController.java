package com.sahith.springboot.thymeleafdemo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahith.springboot.thymeleafdemo.entity.Student;
import com.sahith.springboot.thymeleafdemo.entity.StudentDTO;
import com.sahith.springboot.thymeleafdemo.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController
{
	 @Autowired
	 private StudentService  studentService;
	 
	
	@GetMapping("/list")
	public String listStudents(Model model)
	{
		
		//remove the manuak cration adn retrive from db
		
		List<StudentDTO> students=studentService.findAll();
		
		model.addAttribute("students",students);
		
		return "/students/list-students";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormStudent(Model model)
	{
		Student   student = new Student();
		model.addAttribute("student",student);
		//remove the manuak cration adn retrive from db
		
		
		return "/students/student-form";
	}
	
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student,Model model)
	{
		studentService.save(student);
		Student stu=student;
		
		model.addAttribute("student", stu);
		
		return "/students/saved-form";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int id,Model model)
	{
		try 
		{
			
		
		//get the student from the service
		StudentDTO student= studentService.findById(id);
		
		
		model.addAttribute("student", student);
		
		//set the student as model attribute to the form
		
		//send to form
		return "/students/student-form";
		}
		
		catch(Exception exp)
		{
			return "/students/error";
		
		}

	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("studentId") int id)
	{
		//get the student from the service
		 studentService.deleteById(id);
		
				
		return "redirect:/students/list";
	}
	
	
	
	
	
	
}

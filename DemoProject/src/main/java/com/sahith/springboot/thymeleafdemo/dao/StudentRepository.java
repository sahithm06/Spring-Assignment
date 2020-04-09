package com.sahith.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahith.springboot.thymeleafdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
 //  no need to write the code all basic crud are free
	//sprinng data jpa magic for auotmatic query behing the scenes
	public List<Student> findAllByOrderByLastNameAsc();
}

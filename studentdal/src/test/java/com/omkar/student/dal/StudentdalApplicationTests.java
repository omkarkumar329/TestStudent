package com.omkar.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.omkar.student.dal.entities.Student;
import com.omkar.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	
	@Autowired
	private StudentRepository  repo;
	 

	@Test
	void testCreateStudent() {
		
		Student student = new Student();
		
		student.setName("Omkar");
		student.setCourse("Spring Boot");
		student.setFee(10000d);
		repo.save(student);
	}
	@Test
	void testFindStudentByID()
	{
		Student student = repo.findById(8l).get();
		System.out.println(student);
	}
	
	@Test	
	void testUpdateStudent()
	{
		Student student = repo.findById(8l).get();
		student.setFee(11.00);
		repo.save(student);	
		
	}
	@Test
	void testDeleteStudent()
	{
	  Student student =	repo.findById(9l).get();
	  repo.delete(student);
	}

}

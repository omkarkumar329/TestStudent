package com.omkar.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.omkar.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

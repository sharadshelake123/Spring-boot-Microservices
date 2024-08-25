package com.student.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.app.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

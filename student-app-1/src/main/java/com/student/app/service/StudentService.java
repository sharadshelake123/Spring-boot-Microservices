package com.student.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.app.entity.Student;
public interface StudentService {

	List<Student> findAllStudent();

}

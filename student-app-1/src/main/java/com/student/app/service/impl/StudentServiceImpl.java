package com.student.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.app.entity.Student;
import com.student.app.repository.StudentRepository;
import com.student.app.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> findAllStudent() {
		return repo.findAll();
	}

}

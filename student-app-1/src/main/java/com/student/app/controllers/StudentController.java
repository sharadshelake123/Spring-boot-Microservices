package com.student.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.student.app.entity.Student;
import com.student.app.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private RestTemplate restTemp;
	
	
	@GetMapping("/getAllStudent")
	public List<Student> findAllStudent() {
		return service.findAllStudent();
	}
	
	@GetMapping("/fin-by-id/{id}")
	public Student findById(@PathVariable int id) {
		System.out.println("Response: ");
		
		ResponseEntity<String> exchange = restTemp.exchange("http://localhost:8082/getAllStudent", HttpMethod.GET,null, String.class);
		System.out.println("Response: "+exchange);
		ResponseEntity<String> stud = restTemp.getForEntity("http://localhost:8082/getAllStudent", String.class);
		System.out.println("stud"+stud.toString());
		return null;
	}
	

}

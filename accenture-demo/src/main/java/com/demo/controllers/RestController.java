package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.PutMapping;




@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	@Autowired
	StudentRepository repo;
	

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student bean) {
		//TODO: process POST request
		bean = repo.save(bean);
		return bean;
	}
	
	@PostMapping("/addStudent-list")
	public List<Student> addStudentList(@RequestBody List<Student> studList) {
		//TODO: process POST request
		studList.forEach(s->{
			repo.save(s);
		});
		return studList;
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getStudent() {
		return repo.findAll();
	}
	
	@GetMapping("/get-by-id{id}")
	public Student findById(@PathVariable int id) {
		return repo.findById(id).orElse(new Student());
	}
	
	@PatchMapping("/update-student-div/{id}/{div}")
	public Student updateStudent(@PathVariable int id, @PathVariable String div) {
		Student stud = repo.findById(id).get();
		stud.setDiv(div);
		return repo.save(stud);
	}
	
	@PutMapping("update-put-student/{id}")
	public Student updateStudentPut(@PathVariable String id, @RequestBody Student stud) {
		
		return repo.save(stud);
	}
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteById(@PathVariable int id) {
		repo.deleteById(id);
	}
	
	
}

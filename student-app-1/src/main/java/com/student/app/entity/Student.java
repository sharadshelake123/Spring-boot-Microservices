package com.student.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	private int rollNo;
	private String name;
	private String grade;
	private String div;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollNo, String name, String grade, String div) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.div = div;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", div=" + div + "]";
	}
	
	
	

}

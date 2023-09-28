package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetAllStudentsController {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getAllStudents();
		
		for(Student s: students) {
			System.out.println("=================");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("=================");
		}
		
	}

}

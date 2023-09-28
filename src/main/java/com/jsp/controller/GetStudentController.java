package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetStudentController {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(2);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
				
	}

}

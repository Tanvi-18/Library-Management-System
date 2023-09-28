package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class SaveStudentController {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("student8");
		student.setEmail("s8@mail.com");
		
		StudentService studentService = new StudentService();
		studentService.saveStudent(student);
		
	}

}

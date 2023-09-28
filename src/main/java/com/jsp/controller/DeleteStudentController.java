package com.jsp.controller;

import com.jsp.service.StudentService;

public class DeleteStudentController {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		studentService.deleteStudentById(5);		
		
	}

}

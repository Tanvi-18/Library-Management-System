package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentUpdate {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		Student s = studentService.updateStudentEmailById(3, "st3@mail.com");
		
		if(s!=null) {
			System.out.println(s.getId() + " Updated");
		}
		
	}

}

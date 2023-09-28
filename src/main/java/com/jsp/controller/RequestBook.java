package com.jsp.controller;

import com.jsp.service.StudentService;

public class RequestBook {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		boolean res = studentService.requestBook(6, 5, 2);
		
		System.out.println(res);
		
	}

}

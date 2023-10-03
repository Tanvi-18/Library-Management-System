package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Book;
import com.jsp.service.StudentService;

public class ViewAvailableBooks {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		List<Book> books = studentService.viewAllAvaliableBooks();

		for (Book b : books) {
			System.out.println("====================");
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getGenre());
			System.out.println(b.getStatus());
			System.out.println("====================");
		}
		
	}
	
}
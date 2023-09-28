package com.jsp.controller;

import com.jsp.service.BookService;

public class DeleteBookController {
	
	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		bookService.deleteBookById(9);
		
	}

}

package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

public class BookUpdate {
	
	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		Book b = bookService.updateBookById(3, "Poetry");
		
		if(b!=null) {
			System.out.println(b.getId() + " Updated");
		}
		
		
		
	}

}

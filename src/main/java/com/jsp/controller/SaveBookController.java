package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

public class SaveBookController {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.setName("Book8");
		book.setGenre("Non Fiction");
		book.setStatus("Available");
		
		BookService bookService = new BookService();
		bookService.saveBook(book);
		
	}

}

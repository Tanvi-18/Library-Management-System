package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

public class BookSave {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.setName("Book9");
		book.setGenre("Romance");
		book.setStatus("Available");
		
		BookService bookService = new BookService();
		bookService.saveBook(book);
		
	}

}

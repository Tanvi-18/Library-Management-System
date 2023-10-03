package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

public class BookGet {
	
	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		Book book = bookService.getBookById(5);
		
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getGenre());
		
	}

}

package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Book;
import com.jsp.service.BookService;

public class BookGetAll {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		
		for(Book b: books) {
			System.out.println("=================");
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getGenre());
			System.out.println("=================");
		}
		
	}
	
}

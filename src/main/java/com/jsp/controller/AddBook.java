package com.jsp.controller;

import com.jsp.dto.Book;
import com.jsp.service.LibrarianService;

public class AddBook {
	
	public static void main(String[] args) { 
		Book book=new Book(); 
		book.setName("Book9"); 
		book.setGenre("Technical"); 
		book.setStatus("Available");
		
		LibrarianService librarianService=new LibrarianService(); 
		librarianService.addBook(book, 1);
}

}

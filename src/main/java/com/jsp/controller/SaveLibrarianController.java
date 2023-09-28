package com.jsp.controller;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

public class SaveLibrarianController {
	
	public static void main(String[] args) {
		
		Librarian librarian = new Librarian();
		librarian.setName("lib8");
		librarian.setEmail("lib8@mail.com");
		librarian.setStatus("authorised");
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.saveLibrarian(librarian);
		
	}

}

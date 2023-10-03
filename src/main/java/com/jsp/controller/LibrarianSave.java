package com.jsp.controller;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

public class LibrarianSave {
	
	public static void main(String[] args) {
		
		Librarian librarian = new Librarian();
		librarian.setName("lib9");
		librarian.setEmail("lib9@mail.com");
		librarian.setStatus("authorised");
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.saveLibrarian(librarian);
		
	}

}

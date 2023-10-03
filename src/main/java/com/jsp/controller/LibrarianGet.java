package com.jsp.controller;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

public class LibrarianGet {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = librarianService.getLibrarianById(4);
		
		System.out.println(librarian.getId());
		System.out.println(librarian.getName());
		System.out.println(librarian.getEmail());
		System.out.println(librarian.getStatus());
		
	}

}

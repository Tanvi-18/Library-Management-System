package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class LibrarianDelete {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.deleteLibrarinById(10);
		
	}

}

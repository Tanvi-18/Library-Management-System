package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class ReturnBook {
	
	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		librarianService.returnBookById(9);
	}

}

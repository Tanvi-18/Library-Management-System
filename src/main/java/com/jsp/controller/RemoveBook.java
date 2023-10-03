package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class RemoveBook {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		librarianService.removeBookById(8, 1);
		
	}

}

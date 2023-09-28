package com.jsp.controller;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

public class UpdateLibrarianController {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		Librarian l = librarianService.updateLibrarianById(7, "lib7@mail.com");
		
		if(l!=null) {
			System.out.println(l.getId() + " Updated");
		}
		
	}

}

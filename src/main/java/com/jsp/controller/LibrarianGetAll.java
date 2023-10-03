package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

public class LibrarianGetAll {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		List<Librarian> librarians = librarianService.getAllLibrarians();
		
		for(Librarian l : librarians) {
			System.out.println("=============");
			System.out.println(l.getId());
			System.out.println(l.getName());
			System.out.println(l.getEmail());
			System.out.println(l.getStatus());
			System.out.println("=============");
		}
		
	}

}

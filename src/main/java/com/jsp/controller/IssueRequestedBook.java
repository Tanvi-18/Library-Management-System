package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class IssueRequestedBook {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueRequestedBookById(8, 6, 1);
		System.out.println(res);
		
	}

}

package com.jsp.controller;

import com.jsp.service.LibrarianService;

public class IssueRequestBook {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.issueRequestBookById(6);
		System.out.println(res);
		
	}

}

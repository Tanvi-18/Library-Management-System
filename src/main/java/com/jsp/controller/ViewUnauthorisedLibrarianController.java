package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Librarian;
import com.jsp.service.AdminService;

public class ViewUnauthorisedLibrarianController {

	public static void main(String[] args) {		
		
		AdminService adminService = new AdminService();
		List<Librarian> librarians = adminService.viewAllUnauthorisedLibrarian();
		
		for(Librarian l: librarians) {
			System.out.println("=================");
			System.out.println(l.getId());
			System.out.println(l.getName());
			System.out.println(l.getEmail());
			System.out.println(l.getStatus());	
			System.out.println("=================");
		}
						
	}
	
}

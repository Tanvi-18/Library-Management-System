package com.jsp.controller;

import com.jsp.service.AdminService;

public class RejectLibrarianController {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.rejectLibrarians(3, 5, "admin5", "ad5#pass");
		
		System.out.println(res);
		
	}

}

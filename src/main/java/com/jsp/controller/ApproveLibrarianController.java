package com.jsp.controller;

import com.jsp.service.AdminService;

public class ApproveLibrarianController {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.approveLibrarians(2, 6, "ad6", "ad6#pass");
		
		System.out.println(res);
		
	}

}

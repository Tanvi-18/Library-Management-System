package com.jsp.controller;

import com.jsp.service.AdminService;

public class ApproveLibrarian {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		boolean res = adminService.approveLibrarians(9, 7, "ad7", "ad7#pass");
		
		System.out.println(res);
		
	}

}

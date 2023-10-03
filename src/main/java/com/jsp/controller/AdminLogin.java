package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminLogin {
	
	public static void main(String[] args) {
				
		AdminService adminService = new AdminService();
		adminService.loginById(6, "admin6", "ad6#pass");
		
	}

}

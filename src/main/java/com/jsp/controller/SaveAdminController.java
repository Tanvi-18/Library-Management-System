package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class SaveAdminController {
	
	public static void main(String[] args) {
		
		Admin admin = new Admin();
		
		admin.setUsername("admin6");
		admin.setEmail("admin6@mail.com");		
		admin.setPassword("ad6#pass");
		
		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);
		
	}

}

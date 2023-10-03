package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class AdminSave {
	
	public static void main(String[] args) {
		
		Admin admin = new Admin();
		
		admin.setUsername("admin7");
		admin.setEmail("admin7@mail.com");		
		admin.setPassword("ad7#pass");
		
		AdminService adminService = new AdminService();
		adminService.saveAdmin(admin);
		
	}

}

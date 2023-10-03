package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminDelete {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		adminService.deleteAdminById(8);
		
	}

}

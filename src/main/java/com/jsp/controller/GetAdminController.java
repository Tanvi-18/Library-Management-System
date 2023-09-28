package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class GetAdminController {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		Admin admin = adminService.getAdminById(2);
		
		System.out.println(admin.getId());
		System.out.println(admin.getEmail());
		System.out.println(admin.getUsername());
		System.out.println(admin.getPassword());
		
	}

}

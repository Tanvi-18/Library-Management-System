package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class GettAllAdminController {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		List<Admin> admins = adminService.getAllAdmins();
		
		for(Admin a: admins) {
			System.out.println("=================");
			System.out.println(a.getId());
			System.out.println(a.getEmail());
			System.out.println(a.getUsername());
			System.out.println(a.getPassword());	
			System.out.println("=================");
		}
		
	}

}

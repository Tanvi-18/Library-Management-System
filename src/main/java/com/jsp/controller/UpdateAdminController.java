package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class UpdateAdminController {
	
	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		Admin a = adminService.updateAdminEmailById(8, "sabaat@mail.com");
		
		if(a!=null) {
			System.out.println(a.getId() + " Updated");
		}
		
	}

}

package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dto.Admin;
import com.jsp.dto.Librarian;

public class AdminService {
	
	AdminDao adminDao = new AdminDao();
	Admin admin = new Admin();
	
	LibrarianDao librarianDao = new LibrarianDao(); 
	
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);
	}

	public Admin deleteAdminById(int id) {
		if (admin != null) {
			return adminDao.deleteAdminById(id);		
		}
		else {
			return null;
		}
	}
	
	public Admin updateAdminEmailById(int id, String email) {
		if (admin != null) {
			return adminDao.updateAdminEmailById(id, email);	
		}
		else {
			return null;
		}
	}
	
	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}
	
	public List<Admin> getAllAdmins() {
		return adminDao.getAllAdmins();
	}

	public boolean loginById(int id, String username, String password) {
		
		Admin admin = adminDao.getAdminById(id);
		
		if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
			System.out.println("Login Successfully");
			
		}
		else {
			System.out.println("Invalid Login");	
		}		
		return true;
		
	}
	
	public List<Librarian> viewAllUnauthorisedLibrarian() {		
		
		LibrarianService librarianService = new LibrarianService();
		
		List<Librarian> librarians = librarianService.getAllLibrarians();
		
		List<Librarian> unauthorisedlib = new ArrayList<Librarian>();
		
		for (Librarian ll: librarians) {				
			if(ll.getStatus().equalsIgnoreCase("Unauthorised")) {
				unauthorisedlib.add(ll);
			}				
		}	
		
		return unauthorisedlib;
				
	}
	

	public boolean approveLibrarians(int libid, int adminid, String admin_username, String admin_password){
		
		Librarian librarian = librarianDao.getLibrarianById(libid);
		
		Admin admin = adminDao.getAdminById(adminid);
		
		if(loginById(adminid, admin_username, admin_password)) {
		
			if(librarian!=null && admin!=null) {
				librarian.setStatus("Authorised");
				librarian.setAdmin(admin);
				return librarianDao.approve(librarian);
			}
			
		}
		
		return false;
		
	}
	
	public boolean rejectLibrarians(int libid, int adminid, String admin_username, String admin_password){
		
		Librarian librarian = librarianDao.getLibrarianById(libid);
		
		Admin admin = adminDao.getAdminById(adminid);
		
		if(loginById(adminid, admin_username, admin_password)) {
		
			if(librarian!=null && admin!=null) {
				librarian.setStatus("rejected");
				librarian.setAdmin(admin);
				return librarianDao.approve(librarian);
			}
			
		}
		
		return false;
		
	}
	
	
	
}

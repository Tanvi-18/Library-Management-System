package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dao.StudentDao;
import com.jsp.dto.Book;
import com.jsp.dto.Librarian;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
	LibrarianDao librarianDao = new LibrarianDao();
	
	BookDao bookDao = new BookDao();	

	Student student = new Student();
	
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public Student deleteStudentById(int id) {
		if(student!=null) {
		return studentDao.deleteStudentById(id);
		}
		else {
			return null;
		}		
	}

	public Student updateStudentEmailById(int id, String email) {
		if(student!=null) {
			return studentDao.updateStudentEmailById(id, email);
		}
		else {
			return null;
		}	
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
	
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
	public boolean requestBook(int bookid, int studid, int libid) {

		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		
		if(librarian != null && book != null && student != null && 
			book.getStatus().equals("Available") && 
			librarian.getStatus().equalsIgnoreCase("authorised")) {
			
			book.setStatus("In-request");
			book.setStudent(student);
			book.setLibrarian(librarian);
			return bookDao.requestBook(book);
		}
		else {
			System.out.println("Unavailable");
		}
		return true;
		
	}
	
}

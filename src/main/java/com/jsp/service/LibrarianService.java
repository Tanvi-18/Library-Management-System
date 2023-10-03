package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dao.LibrarianDao;
import com.jsp.dao.StudentDao;
import com.jsp.dto.Book;
import com.jsp.dto.Librarian;
import com.jsp.dto.Student;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();
	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();
	Librarian librarian = new Librarian();
	
	
	public Librarian saveLibrarian(Librarian librarian) {
		librarian.setStatus("unauthorised");
		return librarianDao.saveLibrarian(librarian);
	}
	
	public Librarian deleteLibrarinById(int id) {
		if (librarian != null) {
			return librarianDao.deleteLibrarinById(id);
		}
		else {
			return null;
		}

	}
	
	public Librarian updateLibrarianById(int id, String email) {
		if (librarian != null) {
			return librarianDao.updateLibrarianById(id, email);		
		}		
		else {
			return null;
		}
	}
		

	public Librarian getLibrarianById(int id) {
		return librarianDao.getLibrarianById(id);
	}
	
	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}
	
	public boolean addBook(Book book, int libid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
	        if (librarian != null && librarian.getStatus().equalsIgnoreCase("authorized")) {
	            bookDao.saveBook(book);
	        }
		return true;       
	
	}
	
	public boolean removeBookById(int bookid, int libid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
        if (librarian != null && librarian.getStatus().equalsIgnoreCase("authorized")) {
            bookDao.deleteBookById(bookid);
        }
	return true;
	}
	
	public boolean issueBookById(int bookid, int studid, int libid) {
		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		
		if (librarian != null && book != null && student != null && 
				librarian.getStatus().equalsIgnoreCase("authorised")) {

			if(!book.getStatus().equalsIgnoreCase("Issued") && !book.getStatus().equalsIgnoreCase("In-Request")) {
				book.setStatus("Issued");
				book.setStudent(student);
				book.setLibrarian(librarian);
				}
				
			else {
				System.out.println("Book Status: " + book.getStatus() + ", Book Currently Unavailable");
			}
			return bookDao.issue(book);
		}
		return false;
	}
	

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		Librarian librarian = new Librarian();
		if (book != null && book.getStatus().equals("Issued")) {
			
			Student student = book.getStudent();
			Librarian librarians = book.getLibrarian();

			if (student != null && librarians != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return false;
	}
	
	public boolean issueRequestedBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBookById(bookid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		Student student = studentDao.getStudentById(studid);
		
		if (librarian != null && book != null  && book.getStatus().equals("In-request")
				&& studid == book.getStudent().getId()) {

			book.setStatus("Issued");
			book.setLibrarian(librarian);
			System.out.println("Issued Requested Book to" + book.getStudent());
			return bookDao.requestBook(book);

		}
		else {
			System.out.println("Book is in request by other student");
		}
		
		
		return false;
	}
	
}

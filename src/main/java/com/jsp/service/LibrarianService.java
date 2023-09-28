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
	
	public Book addBook(Book book, int libid) {
		Librarian librarian = librarianDao.getLibrarianById(libid);
	        if (librarian != null && librarian.getId() == 3 && 
	        		librarian.getStatus().equalsIgnoreCase("authorized")) {
	            return bookDao.saveBook(book);
	        }
		return book;       
	
	}
	
	public Book removeBookById(Book book, int id) {
		Librarian librarian = librarianDao.getLibrarianById(id);
        if (librarian != null && librarian.getId() == 3 && 
        		librarian.getStatus().equalsIgnoreCase("authorized")) {
            return bookDao.deleteBookById(id);
        }
	return book;
	}
	
	public boolean issueBookById(int bookid, int studid, int libid) {
		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		
		if (librarian != null && book != null && student != null && 
				librarian.getStatus().equalsIgnoreCase("authorised")) {

			if(!book.getStatus().equals("Issued")) {
				book.setStatus("Issued");
				book.setStudent(student);
				book.setLibrarian(librarian);
				}
				
			else {
				System.out.println(book.getStatus() + "-->Book Unavailable");
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
	
	public boolean issueRequestBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		Librarian librarian = new Librarian();
		Student student = new Student();
		
		if (librarian != null && book != null && student != null && 
			book.getStatus().equals("In-request")) {

			book.setStatus("Issued");
			return bookDao.requestBook(book);

		}				
		
		return false;
	}
	
}

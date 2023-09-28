package com.jsp.service;

import java.util.List;

import com.jsp.dao.BookDao;
import com.jsp.dto.Book;

public class BookService {
	
	BookDao bookDao = new BookDao();
	Book book = new Book();
	
	public Book saveBook(Book  book) {
		return bookDao.saveBook(book);
	}
	
	public Book deleteBookById(int id) {
		if(book!=null) {
			return bookDao.deleteBookById(id);
		}
		else {
			return null;
		}
	}
	
	public Book updateBookById(int id, String genre) {
		if(book!=null) {
			return bookDao.updateBookById(id, genre);
		}
		else {
			return null;
		}	
	}

	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

}

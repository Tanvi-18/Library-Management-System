package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Book;

public class BookDao {
	
	EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("tanvi");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public Book saveBook(Book  book) {
		
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();		
	
		return book;
		
	}
	
	public Book deleteBookById(int id) {
		
		Book book = entityManager.find(Book.class, id);
		
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
			
		return book;		
		
	}
	
	public Book updateBookById(int id, String genre) {
		
		Book book = entityManager.find(Book.class, id);
		
		book.setGenre(genre);
		
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
	
		return book;		
		
	}
	
	public Book getBookById(int id) {
		
		Book book = entityManager.find(Book.class, id);
		return book;
		
	}
	
	public List<Book> getAllBooks() {
		
		String sql = "SELECT b FROM Book b"	;
		Query query = entityManager.createQuery(sql);		
		List<Book> books = query.getResultList();
		
		return books;		
		
	}
	
	public boolean issue(Book book) {
		
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;

	}

	public boolean returnBook(Book book) {
		
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;
	
	}
	
	public boolean requestBook(Book book) {
	
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return true;
	
	}

}

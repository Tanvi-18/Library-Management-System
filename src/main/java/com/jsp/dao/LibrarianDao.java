package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Librarian;

public class LibrarianDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tanvi");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	Librarian librarian = new Librarian();

	Admin admin = new Admin();

	public Librarian saveLibrarian(Librarian librarian) {

		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();

		return librarian;

	}

	public Librarian deleteLibrarinById(int id) {

		Librarian librarian = entityManager.find(Librarian.class, id);

		entityTransaction.begin();
		entityManager.remove(librarian);
		entityTransaction.commit();
		
		return librarian;

	}

	public Librarian updateLibrarianById(int id, String email) {

		Librarian librarian = entityManager.find(Librarian.class, id);

		librarian.setEmail(email);

		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();

		return librarian;

	}

	public Librarian getLibrarianById(int id) {

		Librarian librarian = entityManager.find(Librarian.class, id);
		return librarian;

	}

	public List<Librarian> getAllLibrarians() {

		String sql = "SELECT l FROM Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarians = query.getResultList();
		return librarians;

	}

	public boolean approve(Librarian librarian) {

		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();

		return true;

	}

}

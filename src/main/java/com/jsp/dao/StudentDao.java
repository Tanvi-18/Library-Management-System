package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Student;


public class StudentDao {
	
	EntityManagerFactory entityManagerFactory =
			Persistence.createEntityManagerFactory("tanvi");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();		
	
		return student;
		
	}
	
	public Student deleteStudentById(int id) {
		
		Student student = entityManager.find(Student.class, id);
		
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		
		return student;		
		
	}
	
	public Student updateStudentEmailById(int id, String email) {
		
		Student student = entityManager.find(Student.class, id);
		
		student.setEmail(email);
				
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
				
		return student;		
		
	}
	
	public Student getStudentById(int id) {
		
		Student student = entityManager.find(Student.class, id);
		return student;
		
	}
	
	public List<Student> getAllStudents() {
		
		String sql = "SELECT s FROM Student s"	;
		Query query = entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		
		return students;		
		
	}
	
	
	

}

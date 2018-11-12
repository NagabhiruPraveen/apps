package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		
		System.out.println("creating a bean ..");
		
		Student student = new Student();
		student.setName("umesh");
		//why id has not been set
		//ans : we have chosen it to be auto generated 
		em.persist(student); //insert 
		t.commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}

package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		//em.getTransaction().begin();
		
		System.out.println("deleting a bean ..");
		
		Student student = new Student();
		student = em.find(Student.class, 1);
		em.getTransaction().begin();
		//em.remove(student);
		em.getTransaction().commit();
		
		System.out.println("deleted one student from the database.");
		em.close();
		factory.close();
	}
}

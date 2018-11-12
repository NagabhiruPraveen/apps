package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	Department d =em.find(Department.class, 20);
	System.out.println(d);
	em.close();
	factory.close();
	}
}

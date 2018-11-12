package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main3 {
	public static void main(String[] args) {
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.find(Trip.class,1);
		
		
		
		
	}

}

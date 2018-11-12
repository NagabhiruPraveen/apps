package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Person p1=new Person("praveen", 22, 3000, 'M');
		Person p2=new Person("virat", 23, 4000, 'M');
		Person p3=new Person("yuvi", 25, 5000, 'M');
		Person p4=new Person("kaur", 22, 2000, 'F');
		Person p5=new Person("Mithali", 27, 3500, 'F');
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
	}

}

package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("MaleFilterQuery");
		List<Person> persons= query.getResultList();
		for (Person person : persons) {
			System.out.println(person);
		}
		em.getTransaction().commit();
		em.clear();
		emf.close();
	}

}

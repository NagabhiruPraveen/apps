package com.training.model;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		String JPQL="select p from Person p where p.gender='M'";
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery(JPQL);
		query.setParameter("startrange", 5000);
		query.setParameter("endrange", 10000);
		List<Person> persons=query.getResultList();
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
	}

}

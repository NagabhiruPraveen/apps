package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Employee e=null;
		e=em.find(Employee.class, 1002);
		System.out.println(e.getName()+" ,"+e.getSalary()+","+e.getDepartment().getName());
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}

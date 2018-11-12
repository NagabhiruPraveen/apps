package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	Department dept=em.find(Department.class, 10);
	System.out.println(dept.getEmployees()+", "+dept.getEmployees().size());
	for (Employee e : args) {
		System.out.println(e.getName()+", "+e.getSalary());
		
	}
	em.close();
	factory.close();
	}
}

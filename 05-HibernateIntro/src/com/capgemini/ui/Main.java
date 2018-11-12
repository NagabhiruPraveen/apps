package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.business.Employee;

public class Main {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=emf.createEntityManager();
	Employee e=new Employee();
	e.setEmpId(103);
	e.setEmpName("rohit");
	e.setBasicSalary(4000.00);
	e.setEmpGender('M');
	e.setEmpGrade('A');
	
	
	EntityTransaction t = em.getTransaction();
	t.begin();
	
	em.persist(e);
	t.commit();
	
	em.close();
	emf.close();
	System.out.println("object is stored in db");
	}
}

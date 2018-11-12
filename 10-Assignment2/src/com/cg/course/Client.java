package com.cg.course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Course course = new Course();
		course.setC_name("CSE");
		FeeDetails feeDetails= new FeeDetails();
		feeDetails.setTotalFees(2000);
		feeDetails.setNoOfInstalments(3);
		
		
		
		
		course.setFeeDetails(feeDetails);
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}

}

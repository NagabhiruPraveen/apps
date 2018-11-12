package com.cg.course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Course course = new Course();
		FeeDetails feeDetails=em.find(FeeDetails.class, 1);
				System.out.println(feeDetails.getTotalFees()+""+feeDetails.getNoOfInstalments());
				course=em.find(Course.class, 2);
				System.out.println(course.getC_name()+"  "+course.getFeeDetails().getTotalFees()+"	"+course.getCid());
				em.close();
				factory.close();
	}

}

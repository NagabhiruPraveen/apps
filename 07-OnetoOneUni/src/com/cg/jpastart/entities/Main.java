package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		Address address=em.find(Address.class, 1);
				System.out.println(address.getStreet()+""+address.getCity()+""+address.getState()+""+address.getZipCode());
				student=em.find(Student.class, 2);
				System.out.println(student.getName()+"  "+student.getAddress().getCity()+"	"+student.getStudentId());
				em.close();
				factory.close();
	}

}

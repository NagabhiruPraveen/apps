package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		//em.getTransaction().begin();
		
		System.out.println("deleting a bean ..");
		
		Student student = new Student();
		String str="from Student";
		Query query = em.createQuery(str);
		List<Student> stuList=null;
		stuList=query.getResultList();
		for (Student student2 : stuList) {
			em.getTransaction().begin();
			student2=em.find(Student.class,student2.getStudentId());
			student2.setName(student2.getName().toUpperCase());
			em.merge(student2);
			em.getTransaction().commit();
			
		}

	}

}

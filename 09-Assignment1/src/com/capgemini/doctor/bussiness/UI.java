package com.capgemini.doctor.bussiness;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.doctor.bean.Doctor;
import com.capgemini.doctor.bean.Qualification;

public class UI {
	public static void main(String[] args) {
		Doctor doctor=new Doctor();
	
		doctor.setName("virat");
		doctor.setAmount(5000);
		Qualification qualify=new Qualification();
		qualify.setExperience(6);
		qualify.setQualification("B.Tech");
		doctor.setQualification(qualify);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(doctor);
		
		em.getTransaction().commit();
		String myQuery ="from Doctor";
		javax.persistence.Query query =  em.createQuery(myQuery);
		List<Doctor> list= query.getResultList();
		System.out.println(list);
		em.close();
		emf.close();
	}
}

package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {
	public static void main(String[] args) {
		
	
	SeatInfo info= new SeatInfo(15,20,30);
	Trip trip=new Trip();
	trip.setFromCity("Hyderabad");
	trip.setToCity("chennai");
	trip.setInfo(info);
	EntityManagerFactory factory  = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();
	em.persist(trip);
	em.getTransaction().commit();
	em.close();
	factory.close();
	}
}

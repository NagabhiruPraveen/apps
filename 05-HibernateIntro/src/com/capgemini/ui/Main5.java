package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Contact;

public class Main5 {
	public static void main(String[] args) {
		Contact contact1=new Contact(102,"sharma","7854457897");
		Contact contact2=new Contact(103,"krunal","7854457898");
		Contact contact3=new Contact(104,"hardik","7854457899");

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
		/*em.persist(contact1);
		em.persist(contact2);
		em.persist(contact3);*/
		//contact3.setPhoneNumber("8976543211");
		em.merge(contact3);
	em.getTransaction().commit();
		/*em.close();
		emf.close();*/
		Contact contact4=null;
		emf=Persistence.createEntityManagerFactory("JPA-PU");
		contact4=em.find(Contact.class, 102);
		contact4.setPhoneNumber("9876543211");
		em.merge(contact4);
		System.out.println(contact4.equals(contact1));
		emf.close();
		em.close();
		
	}

}

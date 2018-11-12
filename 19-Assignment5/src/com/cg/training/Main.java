package com.cg.training;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		Customer customer3=new Customer();
		Customer customer4=new Customer();
		Customer customer5=new Customer();
		Customer customer6=new Customer();
		Customer customer7=new Customer();
		Customer customer8=new Customer();
		Customer customer9=new Customer();
		Customer customer10=new Customer();
		
		customer1.setCus_Name("praveen");
		customer1.setDate(new Date());
		
		customer2.setCus_Name("virat");
		customer2.setDate(new Date());
		
		customer3.setCus_Name("rohit");
		customer3.setDate(new Date());
		
		customer4.setCus_Name("gouse");
		customer4.setDate(new Date());
		
		customer5.setCus_Name("shaw");
		customer5.setDate(new Date());
		
		customer6.setCus_Name("rayudu");
		customer6.setDate(new Date());
		
		customer7.setCus_Name("pant");
		customer7.setDate(new Date());
		
		customer8.setCus_Name("hardik");
		customer8.setDate(new Date());
		
		customer9.setCus_Name("krunal");
		customer9.setDate(new Date());
		
		customer10.setCus_Name("pandya");
		customer10.setDate(new Date());
	
		customer10.setCus_Name("sehwag");
		customer10.setDate(new Date());
		
		
		 
		
		Bank bank1=new Bank();
		
		bank1.setBankName("Hdfc");
		bank1.setHeadOfficeLocation("chennai");
		
		bank1.addCustomer(customer1);
		bank1.addCustomer(customer2);
		bank1.addCustomer(customer3);
		
		customer1.addBank(bank1);
		customer2.addBank(bank1);
		customer3.addBank(bank1);
		
		em.persist(bank1);
		
		
		
		
		
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}

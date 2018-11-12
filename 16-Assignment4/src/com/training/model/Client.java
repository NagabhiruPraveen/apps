package com.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.sql.ordering.antlr.Factory;

public class Client {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	Loan loan =new Loan();
	loan.setCustomerName("Rohit sharma");
	loan.setLoanAmount(5000.00);
	em.getTransaction().begin();
    em.persist(loan);
    
    Repayment rp =new Repayment();
    rp.setRepayAmount(2000);
    rp.setInstallmentNumber(1);
    em.persist(rp);
    
    
    Repayment rp1=new Repayment();
    rp.setRepayAmount(3000);
    rp.setInstallmentNumber(2);
    em.persist(rp1);
    
    Repayment rp2=new Repayment();
    rp.setRepayAmount(4000);
    rp.setInstallmentNumber(3);
    em.persist(rp2);
    
    rp.addEmployee(l1);
	rp.addEmployee(e2);
	
	//save department and its employees using entity manager
	em.persist(department);
    em.getTransaction().commit();
    em.close();
    factory.close();
    
    
    
    
    
 //   em.getTransaction().commit();
    
	
	}	
}

package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		 employee = em.find(Employee.class, 1);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof Manager);
		System.out.println(employee instanceof ContractEmployee);
		em.getTransaction().commit();
		
		if(employee instanceof Employee)
		{
			Employee employee1 = new Employee();
			System.out.println(employee1.getEmployeeId());
			System.out.println(employee1.getSalary());
		}
		if (employee instanceof Manager) {
			Manager m = (Manager) employee;
			System.out.println(m.getDepartmentName());
			System.out.println(m.getEmployeeId());
			System.out.println(m.getName());
			System.out.println(m.getSalary());
		}
		if (employee instanceof ContractEmployee) {
			ContractEmployee cem = (ContractEmployee) employee;
			System.out.println(cem.getDuration());
			System.out.println(cem.getEmployeeId());
			System.out.println(cem.getName());
			System.out.println(cem.getSalary());
		}
		
		
		
		em.close();
		factory.close();

}
}
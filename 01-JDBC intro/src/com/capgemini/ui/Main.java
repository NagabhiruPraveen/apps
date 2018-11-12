package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.business.Customer;
import com.capgemini.db.CustomerDAO;
import com.capgemini.db.CustomerDAOImpl;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("customer Application");
		System.out.println("..................................");
		System.out.println("1.add new customer");
		System.out.println("2.update customer");
		System.out.println("3.displayAll customer");
		System.out.println("4.delete customer");
		System.out.println("5.exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();
		switch (choice) {
				case 1:
					add();
						break;
				case 2:
					update();
						break;
				case 3:
					displayAll();
						break;
				case 4:
					remove();
						break;
				case 5:
						System.out.println("thank you");
						System.exit(0);
						break;
				default:
						break;
		}

	}
	public static void add() throws SQLException, ClassNotFoundException{
		int id;
		String name=null;
		String city=null;
		double outStandingAmount=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id");
		id=scanner.nextInt();
		System.out.println("enter name");
		name=scanner.next();
		System.out.println(("enter city"));
		city=scanner.next();
		System.out.println("enter amount");
		outStandingAmount=scanner.nextDouble();
		Customer customer1=new Customer();
		customer1.setId(id);
		customer1.setName(name);
		customer1.setCity(city);
		customer1.setOutStandingAmount(outStandingAmount);
		CustomerDAO dao=new CustomerDAOImpl();
		boolean result=dao.addCustomer(customer1);
		if(result)
		{
			System.out.println("added successfully");
		}
		else{
			System.out.println("adding failed");
		}
	}
	public static void update() throws ClassNotFoundException, SQLException
	{
		int id;
		String name=null;
		String city=null;
		double outStandingAmount=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("modify id");
		id=scanner.nextInt();
		System.out.println("modify name");
		name=scanner.next();
		System.out.println(("modify city"));
		city=scanner.next();
		System.out.println("modify amount");
		outStandingAmount=scanner.nextDouble();
		Customer customer1=new Customer();
		customer1.setId(id);
		customer1.setName(name);
		customer1.setCity(city);
		customer1.setOutStandingAmount(outStandingAmount);
		CustomerDAO dao=new CustomerDAOImpl();
		boolean result=dao.updateCustomer(customer1);
		if(result)
		{
			System.out.println("added successfully");
		}
		else{
			System.out.println("adding failed");
		}
	}
	public static void displayAll() throws ClassNotFoundException, SQLException
	{
		CustomerDAO dao=new CustomerDAOImpl();
		List<Customer> customer=dao.getAllCustomers();
		for (Customer customer1 : customer) 
		{
			//System.out.println(customer);
			System.out.print(customer1.getId());
			System.out.print(customer1.getName());
			System.out.print(customer1.getCity());
			System.out.println(customer1.getOutStandingAmount());
		}
	}
	public static void remove() throws SQLException, ClassNotFoundException
	{
		int inp_id=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id to remove");
		inp_id=scanner.nextInt();
		
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result=dao.removeCustomer(3);
		if(result)		
		{
			System.out.println("record deleted successfully");
		}
		else
		{
			System.out.println("not deleted");
		}
		
	}

}

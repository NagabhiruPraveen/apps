package com.capgemini.db;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.business.Customer;

public interface CustomerDAO {
	boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException;

	boolean removeCustomer(int customerId) throws SQLException, ClassNotFoundException;

	boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;

	Customer findCustomer(int customerId);

	List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException;

}

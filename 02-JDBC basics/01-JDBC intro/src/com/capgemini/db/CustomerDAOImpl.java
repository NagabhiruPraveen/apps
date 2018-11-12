package com.capgemini.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.business.Customer;

public class CustomerDAOImpl implements CustomerDAO {
static	List<Customer> customer = new ArrayList<Customer>();
	@Override
	public boolean addCustomer(Customer customer1) throws SQLException, ClassNotFoundException {
		Connection connection= ConnectionManager.createConnection();
		String sql="insert into Customer values(?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setInt(1,customer1.getId());
		statement.setString(2,customer1.getName());
		statement.setString(3,customer1.getCity());
		statement.setDouble(4, customer1.getOutStandingAmount());
		statement.execute();
		return true;
	}

	@Override
	public boolean removeCustomer(int customerId) throws SQLException, ClassNotFoundException {
Connection connection= ConnectionManager.createConnection();

String sql="delete from customer where c_id=?";
PreparedStatement statement=connection.prepareStatement(sql);
statement.setInt(1, customerId);
statement.execute();
statement.close();
ConnectionManager.closeConnection(connection);
return true;
	}

	@Override
	public boolean updateCustomer(Customer customer1) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection= ConnectionManager.createConnection();
		String sql="update Customer set C-name=?, C_city=?, C_outStandingAmount=? where Cid=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setInt(1,customer1.getId());
		statement.setString(2,customer1.getName());
		statement.setString(3,customer1.getCity());
		statement.execute();
		return true;
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		
		Connection connection= ConnectionManager.createConnection();
        String Sql="select * from Customer";
        PreparedStatement statement=connection.prepareStatement(Sql);
        ResultSet rs=statement.executeQuery(Sql);
        while(rs.next())
        {
        	int id=rs.getInt(1);
        			String name=rs.getString(2);
        			String city=rs.getString(3);
        			double outStandingAmount=rs.getDouble(4);
        			Customer customer1=new Customer();
        			customer1.setId(id);
        			customer1.setName(name);
        			customer1.setCity(city);
        			customer1.setOutStandingAmount(outStandingAmount);
        			customer.add(customer1);
        			
        }
        
statement.close();
ConnectionManager.closeConnection(connection);
		
		// TODO Auto-generated method stub
		return customer;
	}

}

package com.capgemini.client;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Main {
	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password = "pass";
		Connection connection = DriverManager.getConnection(dbURL, userName,
				password);
		return connection;
	}

	public static void insertRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();

		System.out.println("connected successfully");
		String SQL = "insert into Customer values(?,?,?,?)";
		// Statement statement=connection.createStatement();
		int inp_id = 0;
		String inp_name=" ";
		String inp_city="";
		double inp_amt=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter id");
		inp_id=scanner.nextInt();
		System.out.print("enter name");
        inp_name=scanner.next();
		System.out.print("enter city");
		inp_city=scanner.next();
		System.out.println("enter amount");
		inp_amt=scanner.nextDouble();
		
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(SQL);
		statement.setInt(1,inp_id);
	    statement.setString(2,inp_name);
	    statement.setString(3,inp_name);
	    statement.setDouble(4,inp_amt);
	statement.execute();
		//System.out.println(r + "rows inserted");
	    System.out.println("inserted");
        scanner.close();
		statement.close();
		connection.close();
	}

	public static void updateRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		String SQL = "update Customer set C_amt=C_amt+? where C_id=?";
		int inp_id = 0;
		double inp_amt=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter id");
		inp_id=scanner.nextInt();
		System.out.println("enter amount");
		inp_amt=scanner.nextDouble();
		
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(SQL);
		statement.setInt(2,inp_id);
		statement.setDouble(1,inp_amt);
		statement.execute();
	    System.out.println("row updated");
        scanner.close();
		statement.close();
		connection.close();
	}

	public static void deleteRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		
		String SQL = "delete from Customer where C_id=?";
		int inp_id = 0;
		//double inp_amt=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter id");
		inp_id=scanner.nextInt();
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(SQL);
		
		statement.setInt(1,inp_id);
		// statement.setDouble(4,inp_amt);
		//	statement.execute();
         statement.execute();
         System.out.println("row deleted");
         scanner.close();
		statement.close();
		connection.close();
		
	}

	public static void displayAll() throws ClassNotFoundException, SQLException {
		Connection connection = createConnection();
		String SQL = "select * from Customer";

		System.out.println("connected successfully");
		// Statement statement=connection.createStatement();
		Statement statement = connection.createStatement();
		// String
		// SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
		ResultSet rs = statement.executeQuery(SQL);
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getDouble(4));
			System.out.println(rs + "rows displayed");
		}
		rs.close();
		statement.close();
		connection.close();
	}

	public static void displayOneRecord(int id) throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		String SQL = "select * from Customer where C_id=?"  ;
	 id = 0;
		//double inp_amt=0;
		//Scanner scanner=new Scanner(System.in);
		//System.out.print("enter id");
		//inp_id=scanner.nextInt();
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(SQL);
		
		statement.setInt(1,id);
		// statement.setDouble(4,inp_amt);
		//	statement.execute();
         statement.execute();

		//System.out.println("connected successfully");
		// Statement statement=connection.createStatement();
		//Statement statement = connection.createStatement();
		// String
		// SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
		ResultSet rs = statement.executeQuery(SQL);
		if (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.print(rs.getDouble(4));
			System.out.println(rs + "rows displayed");
		}
		rs.close();
		statement.close();
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		displayOneRecord(2);
	}

}

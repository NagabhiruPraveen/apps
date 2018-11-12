package com.capgemini.client;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
public static Connection createConnection() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	String dbURL= "jdbc:mysql://localhost:3306/demodb";
	String userName="root";
	String password="pass";
	Connection connection=DriverManager.getConnection(dbURL,userName,password);
	return connection;
}
public static void insertRecord()throws ClassNotFoundException, SQLException{
	Connection connection=createConnection();
	
	System.out.println("connected successfully");
	//Statement statement=connection.createStatement();
	Statement statement= connection.createStatement();
	String SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
	int r=statement.executeUpdate(SQL);
	System.out.println(r+"rows inserted");
	
	statement.close();
	connection.close();
}
public static void updateRecord()throws ClassNotFoundException, SQLException{
	Connection connection=createConnection();
	String SQL ="update Customer set C_amt=C_amt+2000 where C_id=1";
	System.out.println("connected successfully");
	//Statement statement=connection.createStatement();
	Statement statement= connection.createStatement();
	//String SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
	int r=statement.executeUpdate(SQL);
	System.out.println(r+"rows updated");
	
	statement.close();
	connection.close();
}
public static void deleteRecord()throws ClassNotFoundException, SQLException{
	Connection connection=createConnection();
	String SQL ="delete from Customer where C_id=5";
	System.out.println("connected successfully");
	//Statement statement=connection.createStatement();
	Statement statement= connection.createStatement();
	//String SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
	int r=statement.executeUpdate(SQL);
	System.out.println(r+"rows deleted");
	
	statement.close();
	connection.close();
}
public static void displayAll()throws ClassNotFoundException, SQLException{
	Connection connection=createConnection();
	String SQL ="select * from Customer";
	
	System.out.println("connected successfully");
	//Statement statement=connection.createStatement();
	Statement statement= connection.createStatement();
	//String SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
	ResultSet  rs=statement.executeQuery(SQL);
	while(rs.next())
	{
	System.out.print(rs.getInt(1));
	System.out.print(rs.getString(2));
	System.out.print(rs.getString(3));
	System.out.print(rs.getDouble(4));
	System.out.println(rs+"rows displayed");
	}	
	rs.close();
	statement.close();
	connection.close();
}
public static void displayOneRecord(int id)throws ClassNotFoundException, SQLException{
	Connection connection=createConnection();
	String SQL ="select * from Customer where C_id="+id;
	
	System.out.println("connected successfully");
	//Statement statement=connection.createStatement();
	Statement statement= connection.createStatement();
	//String SQL="insert into Customer values(5,'yuvi traders','kolkata',4000)";
	ResultSet  rs=statement.executeQuery(SQL);
	if(rs.next())
	{
	System.out.print(rs.getInt(1));
	System.out.print(rs.getString(2));
	System.out.print(rs.getString(3));
	System.out.print(rs.getDouble(4));
	System.out.println(rs+"rows displayed");
	}
	rs.close();
	statement.close();
	connection.close();
}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		displayOneRecord(1);
	}

}

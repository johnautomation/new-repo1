package com.oop.concepts;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Student extends Person
	{
	 
	   public Student(String d_name, String d_address)
	 {
	      super(d_name,d_address);
	    
	 }
	 
	 public static Connection dbConn() throws ClassNotFoundException, SQLException {
	      Connection conn = null;
	        Class.forName("org.postgresql.Driver");
	        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qademo", "postgres", "y482550g");

	        return conn;
	    }

	        
	    public static void main(String[] args) throws ClassNotFoundException, SQLException{
	        
	        Student.dbConn();
	        System.out.println("The database was successfully connected ");
	        String query = "INSERT INTO student VALUES ('robel', 30 , 'geography')";
	        Connection c = dbConn();
	        Statement stmt = c.createStatement();

	         int count = stmt.executeUpdate(query );
	        
	      
	            System.out.println(count + " rows affected");
	            
	    
	        stmt.close();
	        c.close();
	    }

	    

	}

package com.oop.concepts;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class ConnectDB {

		public static Connection dbConn() throws ClassNotFoundException, SQLException {
			Connection conn = null;
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qademo", "postgres", "y482550g");

			return conn;
		}

		
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			
			ConnectDB.dbConn();
			System.out.println("The database was successfully connected ");
			
			Connection c = dbConn();
		    Statement stmt = c.createStatement();

		    ResultSet rs = stmt.executeQuery( "SELECT * FROM student;" );
		    
		    while(rs.next())
		    {
		        String name = rs.getString("student_name");
		        String age= rs.getString("student_age");
		        
		        System.out.println("Student Name = " + name);
		        System.out.println("Student Age = " + age);
		        System.out.println();
		    }

		    rs.close();
		    stmt.close();
		    c.close();
		}
		}





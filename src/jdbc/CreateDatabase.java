package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("registered successfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			System.out.println("connection established successfully");
			Statement st=con.createStatement();
			System.out.println("statement created successfully");
			st.execute("create database employee");
			System.out.println("database created successfully");
		
		}

	}



package com.school.project.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*<property name="url" value="jdbc:mysql://localhost:3306/test_one" />
		 <property name="username" value="kanam" />
		<property name="password" value="root" />
*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "Jingle@01");
			System.out.println(c.getMetaData()); 
			
			
			System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating table in given database...");
		     Statement stmt = c.createStatement();
		      
		    String sql = "insert into teacher values(3,'Chandu Mira','chandumira@gmail.com');"; 
		    // String sql="select * from teacher;";

		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
		      c.close();
		      stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}

}

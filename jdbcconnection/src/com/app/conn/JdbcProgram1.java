package com.app.conn;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement.*;

public class JdbcProgram1 
{

	public static void main(String args[]) throws SQLException,ClassNotFoundException
	{  
		
		Class.forName("oracle.jdbc.driver.OracleDriver");    
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");  
		java.sql.Statement st=con.createStatement();
		st.executeUpdate ("create table empdemo(enumber number(3),ename varchar2(20),esalary varchar2(20))");
		System.out.println("Table is created");
		con.close();
		  
		  
		  
	}
}
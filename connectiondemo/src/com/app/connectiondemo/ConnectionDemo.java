package com.app.connectiondemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionDemo 
{
public static void main(String[] args)throws SQLException
{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	System.out.println("SathyaTechnology connection is Established");
	Statement st=con.createStatement();
	st.executeUpdate("create table empdemo(eno number(5),ename varchar2(20),salary number(6,2))");
	System.out.println("Table is Created");
}
}
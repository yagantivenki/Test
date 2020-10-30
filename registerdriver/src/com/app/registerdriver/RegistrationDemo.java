package com.app.registerdriver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class RegistrationDemo 
{
	public static void main(String[] args)throws SQLException 
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("driver is a registered");
		
	}

}

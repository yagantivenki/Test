package demojdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter eno");
	int eno=sc.nextInt();
	System.out.println("Enter ename");
	String ename=sc.next();
	System.out.println("Enter Salary");
	int salary=sc.nextInt();
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	Statement st=con.createStatement();
	//query
	//String q = "INSERT into emp values(1,'kb',1000)";
	String q = "INSERT into emp values("+eno+",'"+ename+"',"+salary+")";
	int i = st.executeUpdate(q);
	System.out.println(i+" row inserted");
	st.close();
	con.close();
	sc.close();
}
}
